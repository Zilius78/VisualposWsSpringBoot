package it.ziliani.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(catalog = "myristo",name = "asporto")
@org.springframework.data.relational.core.mapping.Table
public class Asporto implements Serializable{
	public Asporto() {
		super();
	}	
	
	public Asporto(int n_asp, String tipoArt) {
		super();
		this.n_asp = n_asp;
		this.tipoArt = tipoArt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -9004667528440909054L;

	@Id()
	@Column(name = "N_ASP")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int n_asp;
	
	@Column(name = "TIPO_ASP")
	private String tipoArt;

	public int getN_asp() {
		return n_asp;
	}

	public void setN_asp(int n_asp) {
		this.n_asp = n_asp;
	}

	public String getTipoArt() {
		return tipoArt;
	}

	public void setTipoArt(String tipoArt) {
		this.tipoArt = tipoArt;
	}

}
