package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Connection conn = ConnectionMySQL.getConnection();
		ConnectionMySQL.closeConnection();*/
		
		serasa:
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("-------------SERASA GAMES------------");
			System.out.println("-------------------------------------\n");
			
			System.out.println("[1]-Jogos cadastrados");
			System.out.println("[2]-Cadastrar novo jogo");
			System.out.println("[3]-Editar jogo por id");
			System.out.println("[4]-Deletar jogo por id");
			System.out.println("[5]-Sair");
			int escolha = sc.nextInt();
			
			switch(escolha) {
			case 1:
				jogosCadastrados();
				break;
			case 2:
				cadastrarJogo();
				break;
			case 3:
				editarJogo();
				break;
			case 4:
				deletarJogo();
				break;
			case 5:
				System.out.println("Encerrando o programa...");
				break serasa;
			default:
				System.out.println("Opção Invalida!\n\n\n");
				break;
			}
		}
	}

	private static void deletarJogo() {
		// TODO Auto-generated method stub
		
	}

	private static void editarJogo() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastrarJogo() {
		// TODO Auto-generated method stub
		
	}

	private static void jogosCadastrados() {
		// TODO Auto-generated method stub
		
	}
}
