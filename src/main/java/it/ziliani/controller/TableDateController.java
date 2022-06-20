package it.ziliani.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.ziliani.entities.OrdiniC;
import it.ziliani.entities.OrdiniT;
import it.ziliani.entities.Periferiche;
import it.ziliani.entities.TavoliStato;
import it.ziliani.services.OrderTableDataService;
import it.ziliani.services.PerifericheService;
import it.ziliani.services.TavoliStatoService;
import it.ziliani.utility.PrinterService;
import it.ziliani.utility.print.NetworkPrinter;
import it.ziliani.utility.print.Printer;



@RestController
@RequestMapping(path="/api")

public class TableDateController 
{
	private static final Logger logger = LoggerFactory.getLogger(TableDateController.class);
	@Autowired
	private PerifericheService perifericheService;
	@Autowired
	private OrderTableDataService orderDateTable;
	@Autowired
	private TavoliStatoService tableState;
					
	
	private OutputStream socketOut ;
    private OutputStreamWriter writer;
	private HttpRequest request;
	
    
    @GetMapping(value="/orderTable" ,produces ="Application/json")
	public @ResponseBody ResponseEntity<OrdiniT> selezionaOrdine(HttpServletRequest  request) throws ParseException  {
		
	
	String str = request.getParameter("barcodeOrdine");
	
	int tavoloOrt = Integer.valueOf ((String) str.subSequence(2, 6));
	//tagliata int fattorinoOrt = -1;
	String statoOrt =request.getParameter("state");
	if (statoOrt == null) {
		statoOrt="PRP";
	}
	String datastr = (String) str.subSequence(6,12);
	String datastr1 ="20"+datastr.subSequence(0, 2)+"-"+datastr.subSequence(2,4)+"-"+datastr.subSequence(4,6);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	Date parsed = sdf.parse(datastr1);
	Date dataOrt = parsed;

		 
	

	OrdiniT ordineSelezionato = orderDateTable.SelByOrdineBarcode(tavoloOrt,dataOrt);
	

	
	
	
	return new ResponseEntity<OrdiniT>(ordineSelezionato, HttpStatus.OK);
			
	}
	@PutMapping(value="/orderUpdate" )
	public ResponseEntity<OrdiniT> updateOrder(@RequestBody HashMap<String, ?> requestBody) throws ParseException, IOException
	{
		logger.info("presa in carico della comanda tramite json body");
		logger.info(requestBody.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String datastr=(String) requestBody.get("dataOrt");
		Date parsed = sdf.parse(datastr);
		
		Date dataOrt = parsed;
		//String statoOrt="PRP";
	
		int tavoloOrt= (int) requestBody.get("tavoloOrt");
		//int fattorinoOrt =-1;
		
		OrdiniT ot = orderDateTable.SelByOrdineBarcode(tavoloOrt, dataOrt);
		TavoliStato t =tableState.getByid(tavoloOrt);
		logger.info("tavoloOrt  dice:  " + tavoloOrt +"   " +t.getStatus());
		if (ot == null) {
			
			return new ResponseEntity<>(new HttpHeaders(), HttpStatus.NO_CONTENT);
		}
		else {
		int fattorinoN= (int) requestBody.get("fattorinoOrt");
		ot.setFattorinoOrt(fattorinoN);
		ot.setStatoOrt((String) requestBody.get("statoOrt"));
		t.setStatus((String) requestBody.get("statoTavolo"));
		orderDateTable.update(ot);
		tableState.update(t);
		logger.info("aggiorno fattorini n con"+ ot.getFattorinoOrt()+   " aggiorno  stato e'    "+  ot.getStatoOrt()  +" il numero di stato e'"+t.getStatus());
		
		Integer codPrf = (Integer) requestBody.get("codPrf");
		Optional<Periferiche> prn= perifericheService.findPrnById(codPrf );
		String printerIp =prn.get().getVelindPrf().toString();
		int port = Integer.parseInt(prn.get().getPortaPrf());
//		Socket socket = new Socket(printerIp, port);
//		socket.setSoTimeout(1000);
//		socketOut = socket.getOutputStream();
//		writer = new OutputStreamWriter(socketOut, "UTF-8");
		DecimalFormat df = new DecimalFormat("####0.00");
		 Printer printer = new NetworkPrinter(printerIp, port);
	     PrinterService printerService = new PrinterService(printer);
	     
	     printerService.setTextAlignCenter();
	     printerService.setText4Square();
		 printerService.setTextFontA();
		 printerService.setCharCode("USA");
		 printerService.print(ot.getTipoOrt().toUpperCase().toString());
		 printerService.lineBreak(1);
		 printerService.setTextNormal();
		 printerService.setTextAlignCenter();
		 String divider = "-----------------------------------------";
		
		 
		 printerService.printLn(divider);
		 
		 
		 printerService.setTextSize2H();
		 printerService.print("Ordine n:  ");
		 
		 printerService.print(String.valueOf(ot.getTavoloOrt()));
		 printerService.print(" del ");
		 printerService.print(ot.getDataOrt().toString());
		 printerService.lineBreak();
		 printerService.setTextNormal();
		 printerService.setTextAlignCenter();
		 printerService.printLn(divider);
		
		 
		 
		 
		 
		 printerService.setTextNormal();
		 printerService.setTextAlignCenter();
		 printerService.print("*****************************************"); 
		 printerService.lineBreak();
		 
		 printerService.setTextSize2H();
		 printerService.setTextAlignCenter();
		 
		 printerService.print("Consegna Prevista Ore: " );
		 
		 printerService.setText4Square();
		 printerService.setTextAlignRight();
		 printerService.print(ot.getDataRitOrt().toString());
		 
		 
		
		
		 printerService.setTextNormal();
		 printerService.setTextAlignCenter();
		 printerService.lineBreak();
		 printerService.print("*****************************************"); 
		 printerService.lineBreak(2);
		 //stampo info cliente indirizzo consegna
		 printerService.setTextAlignLeft();
		 printerService.setTextNormal();
		 printerService.print("Cliente :   ");
		 printerService.setTextSize2H();
		 printerService.setTextTypeBold();
		 printerService.print(ot.getListaOrdineDettCliente().getNameOrd().toString());
		 printerService.setTextAlignLeft();
		 printerService.setTextNormal();
		 printerService.lineBreak();
		 printerService.print("Indirizzo:  ");
		 printerService.setTextSize2H();
		 printerService.setTextTypeBold();		
		 printerService.print(ot.getListaOrdineDettCliente().getIndirizzoOrd().toString());
		 printerService.setTextAlignLeft();
		 printerService.setTextNormal();
		 printerService.lineBreak();
		 printerService.print("Citta':     ");
		 printerService.setTextSize2H();
		 printerService.setTextTypeBold();
		 printerService.print(ot.getListaOrdineDettCliente().getCittaOrd().toString()+ " - "+ot.getListaOrdineDettCliente().getProvOrd().toString()+" -");
		 printerService.setTextNormal();
		 printerService.lineBreak();
		 
		 if(ot.getListaOrdineDettCliente().getCampanelloOrd().length()>0) {
			 printerService.setTextAlignLeft();
			 printerService.setTextNormal();
			 
			 printerService.print("Campanello: ");
			 printerService.setTextSize2H();
			 printerService.setTextTypeBold();
			 printerService.print(ot.getListaOrdineDettCliente().getCampanelloOrd().toString());
			 printerService.setTextNormal();
			 printerService.lineBreak();
			 
		 }
		 
		 if(ot.getListaOrdineDettCliente().getScalaOrd().length()>0) {
			 
			 printerService.print("Scala: ");
			 printerService.setTextTypeBold();
			 printerService.print(ot.getListaOrdineDettCliente().getScalaOrd().toString()+" ");
			 printerService.setTextNormal();		 
			 }
		 if(ot.getListaOrdineDettCliente().getPianoOrd().length()>0) {
			
			 
			 printerService.print("Piano: ");
			 printerService.setTextTypeBold();
			 printerService.print(ot.getListaOrdineDettCliente().getPianoOrd().toString()+" ");
			 printerService.setTextNormal();
			 
			 }
		 if(ot.getListaOrdineDettCliente().getInternoOrd().length()>0) {
			 
			 printerService.print("Interno: ");
			 printerService.setTextTypeBold();
			 printerService.print(ot.getListaOrdineDettCliente().getInternoOrd().toString()+" ");
			 printerService.setTextNormal();
			 
			 }
		 printerService.setTextNormal();
		 printerService.lineBreak(1);
		 printerService.print("Telefono:   ");
		 printerService.setTextSize2H();
		 printerService.setTextTypeBold2Underline();
		 printerService.print(ot.getCellOrt().toString());
		 printerService.setTextNormal();
		 printerService.lineBreak(2);
		 
		 if(ot.getNoteOrt().length()>0) {
					 
			 printerService.print("Note:");
			 printerService.setTextSize2H();
			 printerService.print(ot.getNoteOrt().toString());
			 printerService.setTextNormal();
			 printerService.lineBreak();
			 
			 }
		 
		 printerService.setTextNormal();
		 printerService.setTextAlignCenter();
		 printerService.lineBreak();
		 printerService.print("*****************************************");
		 printerService.lineBreak();
		 
		 printerService.setText4Square();
		 
		
		 printerService.setTextAlignCenter();
		 printerService.printLn("Riepilogo:");
		 printerService.setTextNormal();
		 printerService.setTextAlignCenter();
		 printerService.print(divider);
		 printerService.lineBreak();
		 
		 
		//stampo riepilogo con prezzi v1
		 printerService.setTextAlignLeft();
		 printerService.setTextSize2H();
		 printerService.lineBreak();
		 List<OrdiniC> sortedOrc = ot.getListaOrdiniCorpo().stream().sorted(Comparator.comparing(OrdiniC::getIdOrc)).collect((Collectors.toList()));
		 
		 //sortedOrc.forEach((temp)->printerService.printLn(((int)temp.getQtaArtOrc())+" x "+temp.getDesArtOrc()+ df.format(
			//	 								BigDecimal.valueOf(temp.getPreArtOrc()))+"\n"));
	//Stampo riepilogo selettivo
		 double bill =0.00d;
		 int pz=0;
		 for (Iterator<OrdiniC> iterator = sortedOrc.iterator(); iterator.hasNext();) {
			OrdiniC ordiniC = (OrdiniC) iterator.next();
			
		
		 
		
			StringBuilder lineStr = new StringBuilder();
			String type = ordiniC.getTipoArtOrc();
			int qta = (int)ordiniC.getQtaArtOrc();
			
			
			String initStr; 
			if (type.equals("VAR")) {
				
				printerService.setTextNormal();
				initStr=" --> ";
			} else {
				printerService.setTextSize2H();
				initStr=" "+ qta + " x ";
				pz = pz+qta;
			}
			String descArt= ordiniC.getDesArtOrc();
			StringBuilder descArtBuild = new StringBuilder(descArt);
			descArtBuild.append("                                                     ");
						
					
			
			String price = df.format(BigDecimal.valueOf(ordiniC.getPreArtOrc()));
			lineStr.append(initStr);
			lineStr.append(descArtBuild.toString().substring(0,26));
			lineStr.append(price);
			bill = bill+ ordiniC.getPreArtOrc();
			printerService.printLn(lineStr.toString());
			
		 }
		 printerService.lineBreak();
		 printerService.print("   Numero Pezzi : " + pz);
		 printerService.lineBreak();
		 printerService.setTextNormal();
		 printerService.setTextAlignCenter();
		 printerService.print(divider);
		 printerService.lineBreak();
		 printerService.setTextAlignRight();
		 printerService.print("Spese di consegna: "+ df.format(BigDecimal.valueOf((double)ot.getSpeseSpedOrt()))+"        ");
		 printerService.lineBreak();
		 
		  
		  StringBuilder sum1 = new StringBuilder();
		  String initStr1="     ";
		  String totale1 = "Totale : ";
		  sum1.append(initStr1);
		  sum1.append(totale1);
		  String totalAmount1 = df.format(BigDecimal.valueOf((double)ot.getTotOrdOrt()));
		  printerService.setTextSize2W();
		  printerService.setTextAlignRight();
		  
		  printerService.print(sum1.toString());
		  printerService.setTextAlignRight();
		  printerService.print(totalAmount1+" ");
		  printerService.setTextNormal();
		  printerService.lineBreak();
		  
		  StringBuilder sum = new StringBuilder();
		   String initStr="     ";
		  String totale = "Pagato : ";
		  sum.append(initStr);
		  sum.append(totale);
		  String totalAmount = df.format(BigDecimal.valueOf((double)ot.getPagatoOrt()));
		  printerService.setTextSize2W();
		  printerService.setTextAlignRight();
		  
		  printerService.print(sum.toString());
		  printerService.setTextAlignRight();
		  printerService.print(totalAmount+" ");
		  printerService.setTextNormal();
		  printerService.lineBreak();
		  
		  
		 
		 printerService.setTextAlignCenter();
		 printerService.print(divider);
		 //fine ordine
		 printerService.lineBreak(5);
		 printerService.cutPart();
		 printerService.close();
				

		return new ResponseEntity<OrdiniT>(new HttpHeaders(),HttpStatus.CREATED);
		
	}
	
	}
	public OutputStream getSocketOut() {
		return socketOut;
	}
	public void setSocketOut(OutputStream socketOut) {
		this.socketOut = socketOut;
	}
	public OutputStreamWriter getWriter() {
		return writer;
	}
	public void setWriter(OutputStreamWriter writer) {
		this.writer = writer;
	}
	public HttpRequest getRequest() {
		return request;
	}
	public void setRequest(HttpRequest request) {
		this.request = request;
	}	
	 
}
