package pe.edu.upeu.academico.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.academico.dao.ProductoDao;
import pe.edu.upeu.academico.entity.Producto;
import pe.edu.upeu.academico.services.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
	private ProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		productoDao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void Update(Producto producto, long idproducto) {
		// TODO Auto-generated method stub
		productoDao.findById(idproducto).ifPresent((x)->{
			producto.setId(idproducto);
			productoDao.save(producto); 
		});
	}
	
}
