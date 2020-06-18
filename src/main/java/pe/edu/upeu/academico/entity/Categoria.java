package pe.edu.upeu.academico.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="categoria")
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcategoria;
	private String nombre_cat;
	
	@OneToMany(targetEntity=Producto.class)
	private List<Producto> productolist;
	public Categoria() {
		super();
	}
	public Categoria(long idcategoria, String nombre_cat) {
		super();
		this.idcategoria = idcategoria;
		this.nombre_cat = nombre_cat;
	}
	public long getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(long idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombre_cat() {
		return nombre_cat;
	}
	public void setNombre_cat(String nombre_cat) {
		this.nombre_cat = nombre_cat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}