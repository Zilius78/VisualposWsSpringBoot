package it.ziliani.controller;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.ziliani.xml.payment.NewDataSet;
import it.ziliani.xml.payment.NewDataSet.PAGA;


@RestController
@RequestMapping(path="/api")

public class PagaController {
	
	//unmarshaller jaxb
	@GetMapping(path="/getPayment", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity< List<PAGA>> payList() throws JAXBException  {
		
	
	
		//un marshaller del file
		 JAXBContext jc = JAXBContext.newInstance( NewDataSet.class );
	       Unmarshaller u = jc.createUnmarshaller();
	       
	    NewDataSet o =  (NewDataSet) u.unmarshal( new File( "c://VisualPos//config//paga.xml" ) );
	    
	       
	    List<PAGA>listPaga = o.getPAGA();
	      
		
		return new  ResponseEntity<List<PAGA>>( listPaga,HttpStatus.OK);
	
	
		
		
	
	
	}	

}
