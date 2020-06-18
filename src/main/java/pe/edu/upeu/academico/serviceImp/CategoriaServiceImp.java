package pe.edu.upeu.academico.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.academico.dao.CategoriaDao;
import pe.edu.upeu.academico.entity.Categoria;
import pe.edu.upeu.academico.services.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
	@Autowired
	private CategoriaDao categoriaDao;
	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}
	@Override
	@Transactional
	public Categoria findById(Long idcat) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(idcat).orElse(null);
	}
	@Override
	@Transactional
	public Categoria Add(Categoria cat) {
		// TODO Auto-generated method stub
		return categoriaDao.save(cat);
	}
	@Override
	@Transactional
	public void delete(Long idcat) {
		// TODO Auto-generated method stub
		 categoriaDao.deleteById(idcat);
		
	}
	@Override
	public void Update(Categoria categoria, long idcategoria) {
		// TODO Auto-generated method stub
		categoriaDao.findById(idcategoria).ifPresent((x)->{
			categoria.setIdcategoria(idcategoria);
			categoriaDao.save(categoria);
		});
	}
	
}
