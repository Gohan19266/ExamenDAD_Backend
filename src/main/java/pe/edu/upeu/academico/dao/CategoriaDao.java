package pe.edu.upeu.academico.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.academico.entity.Categoria;
@Repository
public interface CategoriaDao extends CrudRepository<Categoria, Long> {
	
}
