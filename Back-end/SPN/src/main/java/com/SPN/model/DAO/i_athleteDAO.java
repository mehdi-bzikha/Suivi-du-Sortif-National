package com.SPN.model.DAO;

import java.util.List;

import com.SPN.model.entiteis.athletes;
import com.SPN.model.entiteis.historique_entite;

public interface i_athleteDAO {

	athletes addathlet(athletes athlete, historique_entite historique_entite);
	
	athletes addOneAthlet(athletes athlete);


	List<athletes> getAll(int id);

	athletes getone(int id);

	void deleteone(int id);

}