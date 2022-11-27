package com.eya.avions.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Vol {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idVol;
private String nomVol;
private String descriptionVol;
@OneToMany(mappedBy = "vol")
@JsonIgnore
private List<Avion> avions;


public void setIdVol(Long idVol) {
	this.idVol = idVol;
}
}
