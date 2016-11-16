package mocks;

import main.Hardware;

public class MockHardwareFail implements Hardware {

	private boolean falhaHardware1;
	private boolean falhaHardware2;
	private boolean falhaHardware3;
	private String conta = "123456789";
	
	public void falhaConta()
	{
		conta = "2121";
	}
	
	public boolean isFalhaHardware1() {
		return falhaHardware1;
	}

	public void setFalhaHardware1(boolean falhaHardware1) {
		this.falhaHardware1 = falhaHardware1;
	}
	
	public boolean isFalhaHardwar2() {
		return falhaHardware2;
	}

	public void setFalhaHardware2(boolean falhaHardware2) {
		this.falhaHardware2 = falhaHardware2;
	}
	
	public boolean isFalhaHardwar3() {
		return falhaHardware3;
	}

	public void setFalhaHardware3(boolean falhaHardware3) {
		this.falhaHardware3 = falhaHardware3;
	}

	
	@Override
	public String pegarNumeroDaContaCartao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void entregarDinheiro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lerEnvelope() {
		// TODO Auto-generated method stub
		
	}

}
