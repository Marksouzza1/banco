package banco;

import java.util.Scanner;

public class login {

	public String email;
	public String senha;

	public void menu() {
		Scanner sc = new Scanner(System.in);
		investimento aplicacao = new investimento();
		movimentacao_bancaria movimentacao = new movimentacao_bancaria();
		conta_pessoal numero_agencia = new conta_pessoal();

		System.out.println("//////////////////////////////////////////////");
		System.out.println("Escolha o tipo de operação:");
		System.out.println("[1] - VER O SALDO");
		System.out.println("[2] - RECEBER/DEPOSITAR");
		System.out.println("[3] - TRANSFERIR");
		System.out.println("[4] - MEUS DADOS");
		System.out.println("[5] - APLICAÇÃO MENSAL");
		System.out.println("[6] - SAIR");
		
		int op2 = sc.nextInt();

		while (op2 > 0 && op2 < 7) {

			if (op2 == 1) {
				System.out.println("Seu saldo é de " + movimentacao.saldo);

			} else if (op2 == 2) {
				System.out.println("Quanto você deseja receber?");
				movimentacao.receber(sc.nextFloat());
				System.out.println("Seu novo saldo é "+movimentacao.saldo);

			} else if (op2 == 3) {
				System.out.println("Quanto você deseja transferir?");
				movimentacao.transferir = sc.nextFloat();
				movimentacao.saldo = movimentacao.saldo - movimentacao.transferir;
				System.out.println("Seu novo saldo é "+movimentacao.saldo);

			} else if (op2 == 4) {
				System.out.println("sua conta bancária é " + numero_agencia.numero);
				System.out.println("O número do banco é " + 01);

			} else if (op2 == 5) {
				System.out.println("quanto deseja investir por mês?");
				aplicacao.pacote_investimento = sc.nextFloat();

			} else if (op2 == 6) {
				System.out.println("Agradecemos a parceria!");
				break;
			} 

			System.out.println("//////////////////////////////////////////////");
			System.out.println("Escolha o tipo de operação:");
			System.out.println("[1] - VER O SALDO");
			System.out.println("[2] - RECEBER/DEPOSITAR");
			System.out.println("[3] - TRANSFERIR");
			System.out.println("[4] - MEUS DADOS");
			System.out.println("[5] - APLICAÇÃO MENSAL");
			System.out.println("[6] - SAIR");
			op2 = sc.nextInt();

		}
		sc.close();
	}
	
}
