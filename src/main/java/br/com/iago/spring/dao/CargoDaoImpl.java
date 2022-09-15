package br.com.iago.spring.dao;

import org.springframework.stereotype.Repository;

import br.com.iago.spring.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
}
