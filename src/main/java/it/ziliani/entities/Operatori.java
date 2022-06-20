package it.ziliani.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@org.springframework.data.relational.core.mapping.Table
@Table(catalog="visualpos", name="operatori")
public class Operatori implements Serializable{
	
	public Operatori () {
		super();
	}
	
	public Operatori(Integer idOp, Integer codOp, String cognomeOp, String nomeOp, Date lastAccOp, String genderOp,
			String linguaOp, String passwOp, String badgeOp, String permessiOp, Integer cdoBilOp, String cashlogyOp) {
		super();
		
		this.codOp = codOp;
		this.cognomeOp = cognomeOp;
		this.nomeOp = nomeOp;
		this.lastAccOp = lastAccOp;
		this.genderOp = genderOp;
		this.linguaOp = linguaOp;
		this.passwOp = passwOp;
		this.badgeOp = badgeOp;
		this.permessiOp = permessiOp;
		this.cdoBilOp = cdoBilOp;
		this.cashlogyOp = cashlogyOp;
	}


	private static final long serialVersionUID = -4900545671506876118L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column (name="ID_OP")
	private long idOp;
	@Column (name="COD_OP")
	private long codOp;
	@Column (name="COGNOME_OP")
	private String cognomeOp;
	@Column (name="NOME_OP")
	private String nomeOp;
	@Column (name="LASTACC_OP")
	@Temporal (TemporalType.DATE)
	private Date lastAccOp;
	@Column (name="GENDER_OP")
	private String genderOp;
	@Column (name="LINGUA_OP")
	private String linguaOp;
	@Column (name="PASSW_OP")
	private String passwOp;
	@Column (name="BADGE_OP")
	private String badgeOp;
	@Column (name="PERMESSI_OP")
	private String permessiOp;
	@Column (name="CODBIL_OP")
	private Integer cdoBilOp;
	@Column (name="CASHLOGY_OP")
	private String cashlogyOp;
	public long getIdOp() {
		return idOp;
	}

	public void setIdOp(long idOp) {
		this.idOp = idOp;
	}

	public long getCodOp() {
		return codOp;
	}

	public void setCodOp(long codOp) {
		this.codOp = codOp;
	}

	public String getCognomeOp() {
		return cognomeOp;
	}

	public void setCognomeOp(String cognomeOp) {
		this.cognomeOp = cognomeOp;
	}

	public String getNomeOp() {
		return nomeOp;
	}

	public void setNomeOp(String nomeOp) {
		this.nomeOp = nomeOp;
	}

	public Date getLastAccOp() {
		return lastAccOp;
	}

	public void setLastAccOp(Date lastAccOp) {
		this.lastAccOp = lastAccOp;
	}

	public String getGenderOp() {
		return genderOp;
	}

	public void setGenderOp(String genderOp) {
		this.genderOp = genderOp;
	}

	public String getLinguaOp() {
		return linguaOp;
	}

	public void setLinguaOp(String linguaOp) {
		this.linguaOp = linguaOp;
	}

	public String getPasswOp() {
		return passwOp;
	}

	public void setPasswOp(String passwOp) {
		this.passwOp = passwOp;
	}

	public String getBadgeOp() {
		return badgeOp;
	}

	public void setBadgeOp(String badgeOp) {
		this.badgeOp = badgeOp;
	}

	public String getPermessiOp() {
		return permessiOp;
	}

	public void setPermessiOp(String permessiOp) {
		this.permessiOp = permessiOp;
	}

	public Integer getCdoBilOp() {
		return cdoBilOp;
	}

	public void setCdoBilOp(Integer cdoBilOp) {
		this.cdoBilOp = cdoBilOp;
	}

	public String getCashlogyOp() {
		return cashlogyOp;
	}

	public void setCashlogyOp(String cashlogyOp) {
		this.cashlogyOp = cashlogyOp;
	} 
	
	

	
	
	

}
