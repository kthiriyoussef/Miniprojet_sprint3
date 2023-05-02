package com.youssef.Miniprojet.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarque;
	private String nomMarque;
	private String paysMarque;
	@JsonIgnore
	@OneToMany(mappedBy = "marque")
	private List<Voiture> voiture;
	public Marque( String nomMarque, String paysMarque, List<Voiture> voiture) {
		super();
		this.nomMarque = nomMarque;
		this.paysMarque = paysMarque;
		this.voiture = voiture;
	}
	public String getNomMarque() {
		return nomMarque;
	}
	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}
	public String getPaysMarque() {
		return paysMarque;
	}
	public void setPaysMarque(String paysMarque) {
		this.paysMarque = paysMarque;
	}
	public List<Voiture> getVoiture() {
		return voiture;
	}
	public void setVoiture(List<Voiture> voiture) {
		this.voiture = voiture;
	}
	public Long getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(Long idMarque) {
		this.idMarque = idMarque;
	}
	
	


}
