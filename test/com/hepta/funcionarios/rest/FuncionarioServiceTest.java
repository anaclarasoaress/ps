package com.hepta.funcionarios.rest;



import com.hepta.funcionarios.entity.Funcionario;
import com.hepta.funcionarios.persistence.FuncionarioDAO;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionarioServiceTest {

	FuncionarioDAO fDao = new FuncionarioDAO();
	
	public static void main(String[] args) throws Exception {
		Funcionario func1 = new Funcionario();	
		func1.setNome("Luci");
		func1.setEmail("luci@gmail.com");
		func1.setSetor(null);
		func1.setSalario(2.500);
		func1.setIdade(22);

		FuncionarioService fService = new FuncionarioService();
		

		fService.FuncionarioRead();
		
		

		
	}
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	void testFuncionarioRead() throws Exception {
		fDao.getAll();
		FuncionarioService fService = new FuncionarioService();
		fService.FuncionarioRead();
	}

	@Test
	void testFuncionarioCreate() {
		Funcionario func1 = new Funcionario();
		func1.setNome("Luci");
		func1.setEmail("luci@gmail.com");
		func1.setSetor(null);
		func1.setSalario(2.500);
			
		FuncionarioService fService = new FuncionarioService();
		fService.FuncionarioCreate(func1);
		
	}

	@Test
	void testFuncionarioUpdate(Integer id) {
		Funcionario func1 = new Funcionario();
		FuncionarioService fService = new FuncionarioService();
		fService.FuncionarioUpdate(id, func1);
	}

	@Test
	void testFuncionarioDelete(Integer id) {
		FuncionarioService fService = new FuncionarioService();
		fService.FuncionarioDelete(id);
	}

}
