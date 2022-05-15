package service;

import java.util.List;

import entity.form.Aluno;
import entity.form.AlunoForm;
import entity.form.AlunoUpdateForm;
import entity.form.AvaliacaoFisica;

public interface IAlunoService {

	Aluno create(AlunoForm form);
	
	Aluno get(Long id);
	
	List<Aluno> getAll(String dataDeNascimento);
	 
	Aluno update(Long id, AlunoUpdateForm formUpdate);
	 
	void delete(Long id);
	
	 List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
	 
	
}
