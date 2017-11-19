package project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import project.model.Matricula;

public interface MatriculaRepository extends CrudRepository<Matricula, Integer>{
	List<Matricula> findAll();
	
	
	
}
