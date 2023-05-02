package com.youssef.Miniprojet.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	@NotNull
	@Size (min = 4,max = 15)
	private String modele;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date relaseDate;
	@Min(value = 100)@Max(value = 10000)
	private Double prix;
	@NotNull
	@Size (min = 4,max = 15)
	private String coleur;
	
	@ManyToOne
	public Marque marque;
	
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public Voiture() {
		super();
	}
	public Voiture(String modele, Date relaseDate, Double prix, String coleur) {
		super();
		
		this.modele = modele;
		this.relaseDate = relaseDate;
		this.prix = prix;
		this.coleur = coleur;
	}
	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public Date getRelaseDate() {
		return relaseDate;
	}
	public void setRelaseDate(Date relaseDate) {
		this.relaseDate = relaseDate;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getColeur() {
		return coleur;
	}
	public void setColeur(String coleur) {
		this.coleur = coleur;
	}
	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", Modele=" + modele + ", RelaseDate=" + relaseDate + ", prix="
				+ prix + ", Coleur=" + coleur + "]";
	}
	

}
