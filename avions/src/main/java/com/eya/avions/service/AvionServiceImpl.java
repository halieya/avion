package com.eya.avions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.avions.entities.Avion;
import com.eya.avions.entities.Vol;
import com.eya.avions.repos.AvionRepository;
@Service

public class AvionServiceImpl implements AvionService {
	@Autowired
	AvionRepository avionRepository;
	@Override
	public Avion saveAvion(Avion a) {
		return avionRepository.save(a);
	}
	@Override
	public Avion updateAvion(Avion a) {
	return avionRepository.save(a);
	}
	@Override
	public void deleteAvion(Avion a) {
	avionRepository.delete(a);
	}
	 @Override
	public void deleteAvionById(Long id) {
	avionRepository.deleteById(id);
	}
	@Override
	public Avion getAvion(Long id) {
	return avionRepository.findById(id).get();
	}
	@Override
	public List<Avion> getAllAvions() {
	return avionRepository.findAll();
	
	}
	@Override
	public List<Avion> findByNomAvion(String nom) {
	return avionRepository.findByNomAvion(nom);
	}
	@Override
	public List<Avion> findByNomAvionContains(String nom) {
	return avionRepository.findByNomAvionContains(nom);
	}
	@Override
	public List<Avion> findByNomPrix(String nom, Double prix) {

		return avionRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Avion> findByVol(Vol vol) {
	return avionRepository.findByVol(vol);
	}
	@Override
	public List<Avion> findByVolIdVol(Long id) {
	return avionRepository.findByVolIdVol(id);
	}
	@Override
	public List<Avion> findByOrderByNomAvionAsc() {
	return avionRepository.findByOrderByNomAvionAsc();
	}
	@Override
	public List<Avion> trierAvionsNomsPrix() {
	return avionRepository.trierAvionsNomsPrix();
	}
}
