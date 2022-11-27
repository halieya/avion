package com.eya.avions.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eya.avions.entities.Avion;
import com.eya.avions.entities.Vol;

@RepositoryRestResource(path = "rest")
public interface AvionRepository extends JpaRepository<Avion,  Long> {
	List<Avion> findByNomAvion(String nom);
	List<Avion> findByNomAvionContains(String nom);
	
	/*@Query("select a from Avion a where a.nomAvion like %:nom and a.prixAvion > :prix")
	List<Avion> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);*/
	@Query("select a from Avion a where a.nomAvion like %?1 and a.prixAvion > ?2")
	List<Avion> findByNomPrix (String nom, Double prix);
	@Query("select a from Avion a where a.vol = ?1")
	List<Avion> findByVol (Vol vol);
	List<Avion> findByVolIdVol(Long id);
	List<Avion> findByOrderByNomAvionAsc();
	@Query("select p from Avion p order by p.nomAvion ASC, p.prixAvion DESC")
	List<Avion> trierAvionsNomsPrix ();


}
