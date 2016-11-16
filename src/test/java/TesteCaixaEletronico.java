import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.CaixaEletronico;
import main.Envelope;
import main.Hardware;
import mocks.ContaCorrente;
import net.sf.esfinge.classmock.ClassMock;

public class TesteCaixaEletronico {
	
	CaixaEletronico caixaEletronico;
	ContaCorrente mockConta;
	
	@Before
	public void SetUp()
	{
		caixaEletronico = new CaixaEletronico();
		mockConta = new ContaCorrente(100, "123456789");
	}
	
	@Test
	public void testLogin(){
		
		//Sem erro, nao estou testando a o Hardware
		
		String c = caixaEletronico.logar();
		
		assertEquals("Usuaario Autenticado",c);
		
	}
	@Test
	public void testDepositar() {
		
	
		
		
		Envelope e = new Envelope(50.00);
		String login = caixaEletronico.logar();
		String depositar = caixaEletronico.depositar(e);
		
		assertEquals("Usuaario Autenticado",login);
		assertEquals("Deposito recebido com sucesso",depositar);
		
	}
	
	@Test
	public void testSacar() {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		String sacar = caixaEletronico.sacar(10.00);
		
		assertEquals("Retire seu dinheiro",sacar);
		
	}

}
