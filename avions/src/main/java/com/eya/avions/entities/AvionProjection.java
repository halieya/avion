package com.eya.avions.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Avion.class })
public interface AvionProjection {
	public String getNomAvion();

}
