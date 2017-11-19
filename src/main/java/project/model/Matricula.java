package project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Matricula {

	  @Id
	  private Integer id;

	  @OneToMany(mappedBy = "matricula")
	  private List<CursoMatriculado> cursoMatriculados;
	  
	  @ManyToOne
	  @JoinColumn(name = "alumno_codigo")
	  private Alumno alumno;
	  
	  private Date fecha;
	  
	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public Alumno getAlumno() {
	    return alumno;
	  }

	  public void setAlumno(Alumno alumno) {
	    this.alumno = alumno;
	  }

	  public Date getFecha() {
	    return fecha;
	  }

	  public void setFecha(Date fecha) {
	    this.fecha = fecha;
	  }

	  public List<CursoMatriculado> getCursoMatriculados() {
	    return cursoMatriculados;
	  }

	  public void setCursoMatriculados(List<CursoMatriculado> cursoMatriculados) {
	    this.cursoMatriculados = cursoMatriculados;
	  }
}
