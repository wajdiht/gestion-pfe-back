package tn.essat.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.Model.Pfe;
@Repository
public interface IPfe extends JpaRepository<Pfe, Integer> {
    public Pfe findByTitre  (String titre);

	public Pfe findbytype(String type);  	
	

}
