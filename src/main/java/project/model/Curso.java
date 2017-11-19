package project.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


import javax.persistence.CascadeType;

@Entity
public class Curso {
	@Id
	@Column(length = 20)
	private String codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "creditos")
	private int creditos;	
	
	@ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "prerequisito",
	      joinColumns = @JoinColumn(name = "curso_codigo", referencedColumnName = "codigo"),
	      inverseJoinColumns = @JoinColumn(name = "prerequisito_codigo",
	          referencedColumnName = "codigo"))
	  private List<Curso> prerequisitos;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(List<Curso> prerequisitos) {
		this.prerequisitos = prerequisitos;
	}

	 public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
	   this.creditos = creditos;
	}



}
