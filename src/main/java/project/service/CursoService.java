package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.repository.CursoRepository;
import project.model.Curso;;

@Service
public class CursoService {
	@Autowired
	CursoRepository repository;
	
	public List<Curso> getAll(){
		return repository.findAll();
	}
	
	public Curso getByCodigo(String cor_code) {
		return repository.findOne(cor_code);
	}
	
	public Curso save(Curso cursoChanged) {
		System.out.println("Modificando el curso" + cursoChanged.getNombre());
		Curso curso = repository.findOne(cursoChanged.getCodigo());
		if(curso != null) {
			curso.setCreditos(cursoChanged.getCreditos());
			curso.setNombre(cursoChanged.getNombre());
		}
		else {
			curso = cursoChanged;
		}
		return repository.save(curso);
	}
	

}
