package com.eya.avions.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eya.avions.entities.Avion;
import com.eya.avions.service.AvionService;


	@RestController
	@RequestMapping("/api")
	@CrossOrigin
	public class AvionRESTController {
		@Autowired
		AvionService avionService;
		@RequestMapping(method = RequestMethod.GET)
		public List<Avion> getAllAvions() {
		return avionService.getAllAvions();
		}
		
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public Avion getAvionById(@PathVariable("id") Long id) {
		return avionService.getAvion(id);
		 }
		
		
		@RequestMapping(method = RequestMethod.POST)
		public Avion createAvion(@RequestBody Avion avion) {
		return avionService.saveAvion(avion);
		}
		
		@RequestMapping(method = RequestMethod.PUT)
		public Avion updateAvion(@RequestBody Avion avion) {
		return avionService.updateAvion(avion);
		}
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteAvion(@PathVariable("id") Long id)
		{
			avionService.deleteAvionById(id);
		}
		
		@RequestMapping(value="/prodscat/{idVol}",method = RequestMethod.GET)
		public List<Avion> getAvionsByVolId(@PathVariable("idVol") Long idVol) {
		return avionService.findByVolIdVol(idVol);
		}
		
		}