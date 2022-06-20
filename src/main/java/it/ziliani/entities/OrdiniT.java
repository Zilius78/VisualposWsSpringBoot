package it.ziliani.entities;


import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(value="vo_ordini_t")
@javax.persistence.Table(catalog="myristo", name="vo_ordini_t")
@DynamicUpdate
public class OrdiniT implements Serializable
{ 	
	private static final long serialVersionUID = -7467565889140506581L;
	
	public OrdiniT() {
		super();
	}

public OrdiniT(String tipoOrt, String statoOrt, Date dataOrt, LocalTime dataRitOrt, int tavoloOrt, int fattorinoOrt, double totOrdOrt,
			String codPagOrt, double pagatoOrt, double speseSpedOrt, int codCliOrt, String nomeOrt, String cognomeOrt,
			String ragSocOrt, String cellOrt, String mailOrt, String fidelityOrt, String codLotteryOrt, String urlOrt,
			String noteOrt, String qrOrt, OrdiniD ordiniD, Set<OrdiniC> ordiniC) {
		super();
		this.statoOrt = statoOrt;
		this.dataOrt = dataOrt;
		this.dataRitOrt = dataRitOrt;
		this.tipoOrt =tipoOrt;
		this.tavoloOrt = tavoloOrt;
		this.fattorinoOrt = fattorinoOrt;
		this.totOrdOrt = totOrdOrt;
		this.codPagOrt = codPagOrt;
		this.pagatoOrt = pagatoOrt;
		this.speseSpedOrt = speseSpedOrt;
		this.codCliOrt = codCliOrt;
		this.nomeOrt = nomeOrt;
		this.cognomeOrt = cognomeOrt;
		this.ragSocOrt = ragSocOrt;
		this.cellOrt = cellOrt;
		this.mailOrt = mailOrt;
		this.fidelityOrt = fidelityOrt;
		this.codLotteryOrt = codLotteryOrt;
		this.urlOrt = urlOrt;
		this.noteOrt = noteOrt;
		this.qrOrt = qrOrt;
		
	}







	// da myristo.vo_ordini_t
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="ID_ORT")	
	private long idOrt;
	
	@Column(name="STATO_ORT")
	
	private String statoOrt;
	
	@Column(name="TIPO_ORT")
	private String tipoOrt;
	
	@Column(name="DATA_ORT")
	@Temporal(TemporalType.DATE)
	
	private Date dataOrt;
	
	@Column(name=" DATARIT_ORT")
	
	
	private LocalTime dataRitOrt;
	
	@Column(name="TAVOLO_ORT")

	private int tavoloOrt;
	
	@Column(name="FATTORINO_ORT")
	
	private int fattorinoOrt;
	
	@Column(name="TOTORD_ORT")

	private double totOrdOrt;
	
	@Column(name="CODPAG_ORT")
	
	private String codPagOrt;
	
	@Column(name="PAGATO_ORT")

	private double pagatoOrt;
	
	@Column(name="SPESESPED_ORT")

	private double speseSpedOrt;
	
	@Column(name="CODCLI_ORT")

	private int codCliOrt;
		
	@Column(name="NOME_ORT")

	private String nomeOrt;
	
	@Column(name="COGNOME_ORT")
	
	private String cognomeOrt;
	
	@Column(name="RAGSOC_ORT")

	private String ragSocOrt;
	
	@Column(name="CELL_ORT")
	
	private String cellOrt;
	
	@Column(name="MAIL_ORT")
	private String mailOrt;
	
	@Column(name="FIDELITY_ORT")
	
	private String fidelityOrt;
	
	@Column(name="CODLOTTERY_ORT")
	
	private String codLotteryOrt;
	
	@Column(name="URL_ORT")
	
	private String urlOrt;
	
	@Column(name="NOTE_ORT", columnDefinition ="MEDIUMTEXT")
	
	private String noteOrt;
	
	@Column(name="QR_ORT", columnDefinition ="MEDIUMTEXT")
	private String qrOrt;
	
	
	@OneToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	@PrimaryKeyJoinColumn
	@JsonManagedReference
	private OrdiniD listaOrdineDettCliente;
	
	
	@OneToMany(mappedBy= "idOrtOrc", cascade = CascadeType.ALL)
	@JsonManagedReference
	
	private List<OrdiniC> listaOrdiniCorpo;

	public long getIdOrt() {
		return idOrt;
	}

	public void setIdOrt(long idOrt) {
		this.idOrt = idOrt;
	}

	public String getStatoOrt() {
		return statoOrt;
	}

	public void setStatoOrt(String statoOrt) {
		this.statoOrt = statoOrt;
	}

	public Date getDataOrt() {
		return dataOrt;
	}

	public void setDataOrt(Date dataOrt) {
		this.dataOrt = dataOrt;
	}

	public LocalTime getDataRitOrt() {
		return dataRitOrt;
	}

	public void setDataRitOrt(LocalTime dataRitOrt) {
		this.dataRitOrt = dataRitOrt;
	}

	public int getTavoloOrt() {
		return tavoloOrt;
	}

	public void setTavoloOrt(int tavoloOrt) {
		this.tavoloOrt = tavoloOrt;
	}

	public int getFattorinoOrt() {
		return fattorinoOrt;
	}

	public void setFattorinoOrt(int fattorinoOrt) {
		this.fattorinoOrt = fattorinoOrt;
	}

	public double getTotOrdOrt() {
		return totOrdOrt;
	}

	public void setTotOrdOrt(double totOrdOrt) {
		this.totOrdOrt = totOrdOrt;
	}

	public String getCodPagOrt() {
		return codPagOrt;
	}

	public void setCodPagOrt(String codPagOrt) {
		this.codPagOrt = codPagOrt;
	}

	public double getPagatoOrt() {
		return pagatoOrt;
	}

	public void setPagatoOrt(double pagatoOrt) {
		this.pagatoOrt = pagatoOrt;
	}

	public double getSpeseSpedOrt() {
		return speseSpedOrt;
	}

	public void setSpeseSpedOrt(double speseSpedOrt) {
		this.speseSpedOrt = speseSpedOrt;
	}

	public int getCodCliOrt() {
		return codCliOrt;
	}

	public void setCodCliOrt(int codCliOrt) {
		this.codCliOrt = codCliOrt;
	}

	public String getNomeOrt() {
		return nomeOrt;
	}

	public void setNomeOrt(String nomeOrt) {
		this.nomeOrt = nomeOrt;
	}

	public String getCognomeOrt() {
		return cognomeOrt;
	}

	public void setCognomeOrt(String cognomeOrt) {
		this.cognomeOrt = cognomeOrt;
	}

	public String getRagSocOrt() {
		return ragSocOrt;
	}

	public void setRagSocOrt(String ragSocOrt) {
		this.ragSocOrt = ragSocOrt;
	}

	public String getCellOrt() {
		return cellOrt;
	}

	public void setCellOrt(String cellOrt) {
		this.cellOrt = cellOrt;
	}

	public String getMailOrt() {
		return mailOrt;
	}

	public void setMailOrt(String mailOrt) {
		this.mailOrt = mailOrt;
	}

	public String getFidelityOrt() {
		return fidelityOrt;
	}

	public void setFidelityOrt(String fidelityOrt) {
		this.fidelityOrt = fidelityOrt;
	}

	public String getCodLotteryOrt() {
		return codLotteryOrt;
	}

	public void setCodLotteryOrt(String codLotteryOrt) {
		this.codLotteryOrt = codLotteryOrt;
	}

	public String getUrlOrt() {
		return urlOrt;
	}

	public void setUrlOrt(String urlOrt) {
		this.urlOrt = urlOrt;
	}

	public String getNoteOrt() {
		return noteOrt;
	}

	public void setNoteOrt(String noteOrt) {
		this.noteOrt = noteOrt;
	}

	public String getQrOrt() {
		return qrOrt;
	}

	public void setQrOrt(String qrOrt) {
		this.qrOrt = qrOrt;
	}

	public OrdiniD getListaOrdineDettCliente() {
		return listaOrdineDettCliente;
	}

	public void setListaOrdineDettCliente(OrdiniD listaOrdineDettCliente) {
		this.listaOrdineDettCliente = listaOrdineDettCliente;
	}

	public List<OrdiniC> getListaOrdiniCorpo() {
		return listaOrdiniCorpo;
	}

	public void setListaOrdiniCorpo(List<OrdiniC> listaOrdiniCorpo) {
		this.listaOrdiniCorpo = listaOrdiniCorpo;
	}

	public String getTipoOrt() {
		return tipoOrt;
	}

	public void setTipoOrt(String tipoOrt) {
		this.tipoOrt = tipoOrt;
	}
	
	
	
	
	

	
	



	}
	


	
	
	

	

