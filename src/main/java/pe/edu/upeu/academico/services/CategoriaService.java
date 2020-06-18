package pe.edu.upeu.academico.services;

import java.util.List;

import pe.edu.upeu.academico.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long idcat);
	public Categoria Add(Categoria cat);
	public void Update(Categoria categoria,long idcategoria);
	public void delete(Long idcat);
}
