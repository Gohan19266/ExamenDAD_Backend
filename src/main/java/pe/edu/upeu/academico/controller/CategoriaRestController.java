package pe.edu.upeu.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.academico.entity.Categoria;
import pe.edu.upeu.academico.services.CategoriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/exa")
public class CategoriaRestController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/")
	public List<Categoria> readAll(){
		return categoriaService.findAll();
	}
	
	@GetMapping("/categoria/{id}")
	public Categoria findById(@PathVariable(name = "id") Long id) {
		return categoriaService.findById(id);
	}
	
	@PostMapping("/createcat")
	public Categoria Add(@RequestBody Categoria categoria) {
		return categoriaService.Add(categoria);
	}
	
	@PutMapping("/categoria/{idcategoria}")
	public void update(@RequestBody Categoria categoria, @PathVariable(value = "idcategoria") long idcategoria) {
		categoriaService.Update(categoria, idcategoria);
	}
	
	@DeleteMapping("/categoria/{idcat}")
	public void delete(@PathVariable(name = "idcat") Long idcat) {
		categoriaService.delete(idcat);
	}
}
