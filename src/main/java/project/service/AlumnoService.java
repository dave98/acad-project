package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Alumno;
import project.repository.AlumnoRepository;

@Service
public class AlumnoService {
	  @Autowired
	  AlumnoRepository repository;

	  public List<Alumno> getAll() {
	    return repository.findAll();
	  }

	  public Alumno getByCodigo(String codigo) {
	    return repository.findOne(codigo);
	  }
	  
	  
	  public Alumno save(Alumno alumnoChanged) {
		    System.out.println("Modificando: " + alumnoChanged.getDni());
		    Alumno alumno = repository.findOne(alumnoChanged.getDni());
		    if (alumno != null) {
		      alumno.setApellidoPaterno(alumnoChanged.getApellidoPaterno());
		      alumno.setApellidoMaterno(alumnoChanged.getApellidoMaterno());
		      alumno.setNombre(alumnoChanged.getNombre());
		    } else {
		      alumno = alumnoChanged;
		    }

		    return repository.save(alumno);
	}	  
}
