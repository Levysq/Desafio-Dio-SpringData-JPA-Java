package service;

import java.util.List;

import entity.form.Matricula;
import entity.form.MatriculaForm;

public interface IMatriculaService {

	Matricula create (MatriculaForm form);
	
	Matricula get(Long id);
	
	List<Matricula> getAll();
	
	
	void delete(Long id);
	
	
}
