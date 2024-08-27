package br.com.ebac.animais_service.repository;

import br.com.ebac.animais_service.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {


}
