package it.ziliani.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;



@Entity
@Table(value="tavolistato")
@javax.persistence.Table(catalog="myristo", name= "tavolistato")
public class TavoliStato implements Serializable {

	
	private static final long serialVersionUID = 8591646448935153819L;
	public TavoliStato() {
		super();
	}
	public TavoliStato(int nTav, String status) {
		super();
		this.nTav = nTav;
		this.status = status;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="NTav")
	private Integer nTav;
	
	@Column(name="Status")
	private String status;

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getnTav() {
		return nTav;
	}
	
	
	
	
}
