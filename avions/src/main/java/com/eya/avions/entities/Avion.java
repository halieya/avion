package com.eya.avions.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Avion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvion;
	private String nomAvion;
	private Double prixAvion;
	private Date dateCreation;
	@ManyToOne
	private Vol vol;
	public Avion() {
	super();
	}
	public Avion(String nomAvion, Double prixAvion, Date dateCreation) {
		super();
		this.nomAvion = nomAvion;
		this.prixAvion = prixAvion;
		this.dateCreation = dateCreation;
		}

	
	
	public Long getIdAvion() {
		return idAvion;
		}
		public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
		}
		public String getNomAvion() {
		return nomAvion;
		}
		public void setNomAvion(String nomAvion) {
		this.nomAvion = nomAvion;
		}
		public Double getPrixAvion() {
		return prixAvion;
		}
		public void setPrixAvion(Double prixAvion) {
		this.prixAvion = prixAvion;
		}
		public Date getDateCreation() {
		return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
		}
		@Override
		public String toString() {
		return "Avion [idAvion=" + idAvion + ", nomAvion=" + 
		nomAvion + ", prixAvion=" + prixAvion
		+ ", dateCreation=" + dateCreation + "]";
		}
		public Vol getVol() {
			return vol;
		}
		public void setVol(Vol vol) {
			this.vol = vol;
		}
		
		
}
