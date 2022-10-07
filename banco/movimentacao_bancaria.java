package banco;

public class movimentacao_bancaria {

	public float receber;
	public float transferir;
	public float saldo;
	public investimento aplicacao;
	
	
	
	public void receber(float valor) {
		this.saldo += valor;
	}

	}
