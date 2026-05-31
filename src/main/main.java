package main;

import java.util.List;
import java.util.Scanner;

import dao.JogoDAO;
import model.Jogo;

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
				cadastrarJogo(sc);
				break;
			case 3:
				editarJogo(sc);
				break;
			case 4:
				deletarJogo(sc);
				break;
			case 5:
				System.out.println("Encerrando o programa...");
				break serasa;
			default:
				System.out.println("Opção Invalida!\n\n");
				break;
			}
		}
	}
	
	private static void jogosCadastrados() {
		JogoDAO j = new JogoDAO();
		List <Jogo> lista = j.selecionarJogos();
		
		System.out.println("\n");
		for(Jogo a : lista) {
			System.out.println(a);
		}
		System.out.println("\n\n");
	}

	private static void deletarJogo(Scanner sc) {
		System.out.println("Informe o id do jogo a ser deletado: ");
		int id = sc.nextInt();
		
	}

	private static void editarJogo(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void cadastrarJogo(Scanner sc) {
		// TODO Auto-generated method stub
		
	}


}
