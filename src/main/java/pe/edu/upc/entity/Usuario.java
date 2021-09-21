package pe.edu.upc.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID =1L;
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;

@Column(name="nombreUsuario", nullable=false, length = 30)
	private String nombreUsuario;

	private String clave;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String nombreUsuario, String clave) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}



	
}
