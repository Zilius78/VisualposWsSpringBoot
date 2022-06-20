
package it.ziliani.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;



//value

@Entity
@Table(value= "vo_ordini_d")
@javax.persistence.Table(catalog="myristo", name="vo_ordini_d")
public class OrdiniD implements Serializable{
	
	private static final long serialVersionUID = 5799943182041631095L;


	
	public OrdiniD(Long idExtOrd, Long idOrtOrd, String nameOrd, String cognomeOrd, String indirizzoOrd,
			String civicoOrd, String capOrd, String cittaOrd, String provOrd, String nazioneOrd, String scalaOrd,
			String pianoOrd, String campanelloOrd, String internoOrd, String coordsOrd) {
		super();
		this.idExtOrd = idExtOrd;
		this.idOrtOrd = idOrtOrd;
		this.nameOrd = nameOrd;
		this.cognomeOrd = cognomeOrd;
		this.indirizzoOrd = indirizzoOrd;
		this.civicoOrd = civicoOrd;
		this.capOrd = capOrd;
		this.cittaOrd = cittaOrd;
		this.provOrd = provOrd;
		this.nazioneOrd = nazioneOrd;
		this.scalaOrd = scalaOrd;
		this.pianoOrd = pianoOrd;
		this.campanelloOrd = campanelloOrd;
		this.internoOrd = internoOrd;
		this.coordsOrd = coordsOrd;
		
	}

	public OrdiniD() {
		super();
	}
	

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ORD")
	private Long idOrd;
	
	@Column(name="IDEXT_ORD")
	private Long idExtOrd;
	
	@Column(name="ID_ORT_ORD")
	private Long idOrtOrd;
	
	@Column(name="NOME_ORD")
	private String nameOrd;
	
	@Column(name="COGNOME_ORD")
	private String cognomeOrd;
	
	@Column(name="INDIRIZZO_ORD")
	private String indirizzoOrd;
	
	@Column(name="CIVICO_ORD")
	private String civicoOrd;
	
	@Column(name="CAP_ORD")
	private String capOrd;
	
	@Column(name="CITTA_ORD")
	private String cittaOrd;
	
	@Column(name="PROV_ORD")
	private String provOrd;
	
	@Column(name="NAZIONE_ORD")
	private String nazioneOrd;

	@Column(name="SCALA_ORD")
	private String scalaOrd;
	
	@Column(name="PIANO_ORD")
	private String pianoOrd;
	
	@Column(name="CAMPANELLO_ORD")
	private String campanelloOrd;
	
	@Column(name="INTERNO_ORD")
	private String internoOrd;

	@Column(name="COORDS_ORD")
	private String coordsOrd;

	
	@OneToOne(mappedBy ="listaOrdineDettCliente")
	@JsonBackReference
	private OrdiniT idOrdineT;

	public Long getIdOrd() {
		return idOrd;
	}

	public void setIdOrd(Long idOrd) {
		this.idOrd = idOrd;
	}

	public Long getIdExtOrd() {
		return idExtOrd;
	}

	public void setIdExtOrd(Long idExtOrd) {
		this.idExtOrd = idExtOrd;
	}

	public Long getIdOrtOrd() {
		return idOrtOrd;
	}

	public void setIdOrtOrd(Long idOrtOrd) {
		this.idOrtOrd = idOrtOrd;
	}

	public String getNameOrd() {
		return nameOrd;
	}

	public void setNameOrd(String nameOrd) {
		this.nameOrd = nameOrd;
	}

	public String getCognomeOrd() {
		return cognomeOrd;
	}

	public void setCognomeOrd(String cognomeOrd) {
		this.cognomeOrd = cognomeOrd;
	}

	public String getIndirizzoOrd() {
		return indirizzoOrd;
	}

	public void setIndirizzoOrd(String indirizzoOrd) {
		this.indirizzoOrd = indirizzoOrd;
	}

	public String getCivicoOrd() {
		return civicoOrd;
	}

	public void setCivicoOrd(String civicoOrd) {
		this.civicoOrd = civicoOrd;
	}

	public String getCapOrd() {
		return capOrd;
	}

	public void setCapOrd(String capOrd) {
		this.capOrd = capOrd;
	}

	public String getCittaOrd() {
		return cittaOrd;
	}

	public void setCittaOrd(String cittaOrd) {
		this.cittaOrd = cittaOrd;
	}

	public String getProvOrd() {
		return provOrd;
	}

	public void setProvOrd(String provOrd) {
		this.provOrd = provOrd;
	}

	public String getNazioneOrd() {
		return nazioneOrd;
	}

	public void setNazioneOrd(String nazioneOrd) {
		this.nazioneOrd = nazioneOrd;
	}

	public String getScalaOrd() {
		return scalaOrd;
	}

	public void setScalaOrd(String scalaOrd) {
		this.scalaOrd = scalaOrd;
	}

	public String getPianoOrd() {
		return pianoOrd;
	}

	public void setPianoOrd(String pianoOrd) {
		this.pianoOrd = pianoOrd;
	}

	public String getCampanelloOrd() {
		return campanelloOrd;
	}

	public void setCampanelloOrd(String campanelloOrd) {
		this.campanelloOrd = campanelloOrd;
	}

	public String getInternoOrd() {
		return internoOrd;
	}

	public void setInternoOrd(String internoOrd) {
		this.internoOrd = internoOrd;
	}

	public String getCoordsOrd() {
		return coordsOrd;
	}

	public void setCoordsOrd(String coordsOrd) {
		this.coordsOrd = coordsOrd;
	}

	public OrdiniT getIdOrdineT() {
		return idOrdineT;
	}

	public void setIdOrdineT(OrdiniT idOrdineT) {
		this.idOrdineT = idOrdineT;
	}
	
	

}

