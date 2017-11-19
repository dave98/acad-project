package project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import project.model.Curso;

public interface CursoRepository extends CrudRepository<Curso, String>{
	List<Curso> findAll();
}
