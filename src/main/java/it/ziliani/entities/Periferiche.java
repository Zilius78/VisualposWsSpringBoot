package it.ziliani.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(value="periferiche")
@javax.persistence.Table(catalog="Visualpos" ,name="periferiche")
public class Periferiche implements Serializable {

	
	public Periferiche(int id, Integer codPrf, String tipoPrf, String descrPrf, String connPrf, String portaPrf,
			String velindPrf, String parityPrf, String dataBitPrf, String stopBitPrf, String copyToPrf,
			String summaryOfPrf) {
		super();
		this.id = id;
		this.codPrf = codPrf;
		this.tipoPrf = tipoPrf;
		this.descrPrf = descrPrf;
		this.connPrf = connPrf;
		this.portaPrf = portaPrf;
		this.velindPrf = velindPrf;
		this.parityPrf = parityPrf;
		this.dataBitPrf = dataBitPrf;
		this.stopBitPrf = stopBitPrf;
		this.copyToPrf = copyToPrf;
		this.summaryOfPrf = summaryOfPrf;
	}





	private static final long serialVersionUID = 1459516325738275355L;

	
	public Periferiche () {
		super();
	}
	
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PRF")
	private int id;
	
	@JsonManagedReference
	@Column(name="COD_PRF")
	private Integer codPrf;
	
	@JsonManagedReference
	@Column(name="TIPO_PRF")
	private String tipoPrf;
	
	
	@JsonManagedReference
	@Column(name="DESCR_PRF")
	private String descrPrf;
	
	@JsonManagedReference
	@Column(name="CONN_PRF")
	private String connPrf;
	
	
	@Column(name="PORTA_PRF")
	private String portaPrf;
	
	
	@Column(name="VELIND_PRF")
	private String velindPrf;
	
	@Column(name="PARITY_PRF")
	private String parityPrf;
	
	
	@Column(name="DATABIT_PRF")
	private String dataBitPrf;
	
	@Column(name="STOPBIT_PRF")
	private String stopBitPrf;
	
	@Column(name="COPYTO_PRF")
	private String copyToPrf;
	
	@Column(name="SUMMARYOF_PRF")
	private String summaryOfPrf;
	public Integer getCodPrf() {
		return codPrf;
	}

	public void setCodPrf(Integer codPrf) {
		this.codPrf = codPrf;
	}

	public String getTipoPrf() {
		return tipoPrf;
	}

	public void setTipoPrf(String tipoPrf) {
		this.tipoPrf = tipoPrf;
	}

	public String getDescrPrf() {
		return descrPrf;
	}

	public void setDescrPrf(String descrPrf) {
		this.descrPrf = descrPrf;
	}

	public String getConnPrf() {
		return connPrf;
	}

	public void setConnPrf(String connPrf) {
		this.connPrf = connPrf;
	}

	public String getPortaPrf() {
		return portaPrf;
	}

	public void setPortaPrf(String portaPrf) {
		this.portaPrf = portaPrf;
	}

	public String getVelindPrf() {
		return velindPrf;
	}

	public void setVelindPrf(String velindPrf) {
		this.velindPrf = velindPrf;
	}

	public String getParityPrf() {
		return parityPrf;
	}

	public void setParityPrf(String parityPrf) {
		this.parityPrf = parityPrf;
	}

	public String getDataBitPrf() {
		return dataBitPrf;
	}

	public void setDataBitPrf(String dataBitPrf) {
		this.dataBitPrf = dataBitPrf;
	}

	public String getStopBitPrf() {
		return stopBitPrf;
	}

	public void setStopBitPrf(String stopBitPrf) {
		this.stopBitPrf = stopBitPrf;
	}

	public String getCopyToPrf() {
		return copyToPrf;
	}

	public void setCopyToPrf(String copyToPrf) {
		this.copyToPrf = copyToPrf;
	}

	public String getSummaryOfPrf() {
		return summaryOfPrf;
	}

	public void setSummaryOfPrf(String summaryOfPrf) {
		this.summaryOfPrf = summaryOfPrf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
