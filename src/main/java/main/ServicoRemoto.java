package main;

public interface ServicoRemoto {
	
		public InterfaceContaCorrente recuperarConta(String numero);
		public void persistirConta(InterfaceContaCorrente cc);
	
}
