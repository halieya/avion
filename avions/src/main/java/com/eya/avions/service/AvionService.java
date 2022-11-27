package com.eya.avions.service;

import java.util.List;

import com.eya.avions.entities.Avion;
import com.eya.avions.entities.Vol;

public interface AvionService {
	Avion saveAvion(Avion a);
	Avion updateAvion(Avion a);
	void deleteAvion(Avion a);
	void deleteAvionById(Long id);
	Avion getAvion(Long id);
	List<Avion> getAllAvions();
	List<Avion> findByNomAvion(String nom);
	List<Avion> findByNomAvionContains(String nom);
	List<Avion> findByNomPrix (String nom, Double prix);
	List<Avion> findByVol (Vol vol);
	List<Avion> findByVolIdVol(Long id);
	List<Avion> findByOrderByNomAvionAsc();
	List<Avion> trierAvionsNomsPrix();
}
