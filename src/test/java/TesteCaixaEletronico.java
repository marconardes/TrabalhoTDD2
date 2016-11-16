import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import main.CaixaEletronico;
import main.Hardware;
import net.sf.esfinge.classmock.ClassMock;

public class TesteCaixaEletronico {
	

	
	@Test
	public void testLogin() throws InstantiationException, IllegalAccessException {
		
		//Sem erro, não estou testando a o Hardware
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String c = caixaEletronico.logar();
		
		assertEquals("Usuário Autenticado",c);
		
	}
	@Test
	public void testDepositar() {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		//Sem erro, não estou testando a o Hardware
		String depositar = caixaEletronico.depositar();
		
		assertEquals("Depósito recebido com sucesso",depositar);
		
	}

}
