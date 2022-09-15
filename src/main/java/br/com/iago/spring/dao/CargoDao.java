package br.com.iago.spring.dao;

import java.util.List;

import br.com.iago.spring.domain.Cargo;

public interface CargoDao {

void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
}
