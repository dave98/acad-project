package project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import project.model.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, String> {
	List<Alumno> finAll();
}
