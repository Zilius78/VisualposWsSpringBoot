package it.ziliani.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;




@Entity
@Table(value="vo_ordini_c")
@javax.persistence.Table(catalog="myristo", name="vo_ordini_c")

public class OrdiniC implements Serializable {
	
	private static final long serialVersionUID = -885647531201752501L;
	
	public OrdiniC() {
		super();
	}
	


	public OrdiniC(long idOrc, long idOrtOrc, String tipoArtOrc, String stipoArtOrc, String codArtOrc, String desArtOrc,
			String umArtOrc, double qtaArtOrc, double preArtOrc, double impArtOrc, double ivaArtOrc) {
		super();
		
		this.idOrtOrc = idOrtOrc;
		this.tipoArtOrc = tipoArtOrc;
		this.stipoArtOrc = stipoArtOrc;
		this.codArtOrc = codArtOrc;
		this.desArtOrc = desArtOrc;
		this.umArtOrc = umArtOrc;
		this.qtaArtOrc = qtaArtOrc;
		this.preArtOrc = preArtOrc;
		this.impArtOrc = impArtOrc;
		this.ivaArtOrc = ivaArtOrc;
		
	}

	

	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column ( name="ID_ORC")
	private long idOrc;
	
	@Column (name="ID_ORT_ORC")
	
	private long idOrtOrc;
	
	@Column (name="TIPOART_ORC")
	private String tipoArtOrc;

	@Column (name="STIPOART_ORC")
	
	private String stipoArtOrc;
	
	@Column (name="CODART_ORC")
	
	private String codArtOrc;

	@Column (name="DESART_ORC")
	private String desArtOrc;

	@Column (name="UMART_ORC")
	private String umArtOrc;

	@Column (name="QTAART_ORC")
	private double qtaArtOrc;

	@Column (name="PREART_ORC")
	private double preArtOrc;

	@Column (name="IMPART_ORC")
	private double impArtOrc;

	@Column (name="IVAART_ORC")
	private double ivaArtOrc;
	
	
	
	@ManyToOne(targetEntity = OrdiniT.class)
	@JsonBackReference
	@JoinColumn(name="ID_ORT_ORC",insertable = false,updatable = false)
	private OrdiniT ordineT;

	public long getIdOrc() {
		return idOrc;
	}



	public void setIdOrc(long idOrc) {
		this.idOrc = idOrc;
	}



	public long getIdOrtOrc() {
		return idOrtOrc;
	}



	public void setIdOrtOrc(long idOrtOrc) {
		this.idOrtOrc = idOrtOrc;
	}



	public String getTipoArtOrc() {
		return tipoArtOrc;
	}



	public void setTipoArtOrc(String tipoArtOrc) {
		this.tipoArtOrc = tipoArtOrc;
	}



	public String getStipoArtOrc() {
		return stipoArtOrc;
	}



	public void setStipoArtOrc(String stipoArtOrc) {
		this.stipoArtOrc = stipoArtOrc;
	}



	public String getCodArtOrc() {
		return codArtOrc;
	}



	public void setCodArtOrc(String codArtOrc) {
		this.codArtOrc = codArtOrc;
	}



	public String getDesArtOrc() {
		return desArtOrc;
	}



	public void setDesArtOrc(String desArtOrc) {
		this.desArtOrc = desArtOrc;
	}



	public String getUmArtOrc() {
		return umArtOrc;
	}



	public void setUmArtOrc(String umArtOrc) {
		this.umArtOrc = umArtOrc;
	}



	public double getQtaArtOrc() {
		return qtaArtOrc;
	}



	public void setQtaArtOrc(double qtaArtOrc) {
		this.qtaArtOrc = qtaArtOrc;
	}



	public double getPreArtOrc() {
		return preArtOrc;
	}



	public void setPreArtOrc(double preArtOrc) {
		this.preArtOrc = preArtOrc;
	}



	public double getImpArtOrc() {
		return impArtOrc;
	}



	public void setImpArtOrc(double impArtOrc) {
		this.impArtOrc = impArtOrc;
	}



	public double getIvaArtOrc() {
		return ivaArtOrc;
	}



	public void setIvaArtOrc(double ivaArtOrc) {
		this.ivaArtOrc = ivaArtOrc;
	}



	public OrdiniT getOrdineT() {
		return ordineT;
	}



	public void setOrdineT(OrdiniT ordineT) {
		this.ordineT = ordineT;
	}
	
	
	

	
	 
    
	
}
