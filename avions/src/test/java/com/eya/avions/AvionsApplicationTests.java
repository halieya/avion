package com.eya.avions;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eya.avions.entities.Avion;
import com.eya.avions.entities.Vol;
import com.eya.avions.repos.AvionRepository;

@SpringBootTest
class AvionsApplicationTests {

	@Autowired
	private AvionRepository avionRepository;
	@Test
	public void testCreateAvion() {
		Avion prod = new Avion("avions party",1425.000,new Date());
	avionRepository.save(prod);
	}
	
	
	@Test
	public void testFindAvion()
	{
		Avion a = avionRepository.findById(1L).get(); 
	System.out.println(a);
	}
	
	@Test
	public void testUpdateAvion()
	{
		Avion a  = avionRepository.findById(1L).get();
	a.setPrixAvion(200000.0);
	avionRepository.save(a);
	}
	@Test
	public void testDeleteAvion()
	{
		avionRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousAvion()
	{
	List<Avion> prods = avionRepository.findAll();
	for (Avion a : prods)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testFindByNomAvion()
	{
	List<Avion> prods = avionRepository.findByNomAvion("avions d'affaire");

	for (Avion a : prods)
	{
	System.out.println(a);
	}

	}
	@Test
	public void testFindByNomAvionContains ()
	{
	List<Avion> prods=avionRepository.findByNomAvionContains("av");

	for (Avion a : prods)
	{
	System.out.println(a);
	} 
}
	@Test
	public void testfindByNomPrix()
	{
	List<Avion> prods = avionRepository.findByNomPrix("avions", 2000.0);
	for (Avion a : prods)
	{
	System.out.println(a);
	}
	}
	@Test
	public void testfindByVol()
	{
		Vol vol = new Vol();
	vol.setIdVol(1L);
	List<Avion> prods = avionRepository.findByVol(vol);
	for (Avion a : prods)
	{
	System.out.println(a);
	}
	}
	
	
	@Test
	public void findByVolIdVol()
	{
	List<Avion> prods = avionRepository.findByVolIdVol(1L);
	for (Avion a : prods)
	{
	System.out.println(a);
	}
	 }
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Avion> prods = 
			avionRepository.findByOrderByNomAvionAsc();
	for (Avion a : prods)
	{
	System.out.println(a);
	}
	}
	@Test
	public void testTrierAvionsNomsPrix()
	{
	List<Avion> prods = avionRepository.trierAvionsNomsPrix();
	for (Avion a : prods)
	{
	System.out.println(a);
	}
	}
}