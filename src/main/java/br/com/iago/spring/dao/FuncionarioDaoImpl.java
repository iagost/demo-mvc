package br.com.iago.spring.dao;

import org.springframework.stereotype.Repository;

import br.com.iago.spring.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
