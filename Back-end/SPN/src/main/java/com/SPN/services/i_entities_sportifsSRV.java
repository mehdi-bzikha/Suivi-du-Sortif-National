package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.entities_sportifs;

public interface i_entities_sportifsSRV {

	void addone(entities_sportifs entities_sportif);

	List<entities_sportifs> getAll(int id);

	entities_sportifs getone(int id);

	void deleteone(int id);

}