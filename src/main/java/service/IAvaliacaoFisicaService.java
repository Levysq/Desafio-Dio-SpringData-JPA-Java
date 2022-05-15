package service;

import java.util.List;

import entity.form.AvaliacaoFisica;
import entity.form.AvaliacaoFisicaForm;
import entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {

	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	
	
	AvaliacaoFisica get(Long id);
	
	
	List<AvaliacaoFisica> getAll();
	
	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
	
	void delete(Long id);
	
	
	
}
