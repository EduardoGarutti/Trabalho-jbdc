package main;

import java.util.List;
import java.util.Scanner;

import dao.JogoDAO;
import model.Jogo;

public class main {
	
	public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		serasa:
		while(true) {
			System.out.println(AZUL + 
					"+++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(VERDE + 
					"===================================================");
			System.out.println(AMARELO + 
					"|              S E R A S A   G A M E S            |");
			System.out.println(VERDE + 
			         "===================================================");
			System.out.println(AZUL + 
					"+++++++++++++++++++++++++++++++++++++++++++++++++++" + 
					RESET);
			
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
				alterarJogo(sc);
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
		
		JogoDAO j = new JogoDAO();
		j.deletarJogo(id);
		
		System.out.println();
	}

	private static void alterarJogo(Scanner sc) {
		System.out.println("Informe o id do jogo a ser alterado: ");
		int id = sc.nextInt();
		
		JogoDAO j = new JogoDAO();
		Jogo jogo = new Jogo();
		jogo.setId(id);
		
		sc.nextLine();
		System.out.println("informe titulo do jogo: ");
		jogo.setTitulo(sc.nextLine());
		
		System.out.println("Informe genero: ");
		jogo.setGenero(sc.nextLine());
		
		System.out.println("Informe plataforma: ");
		jogo.setPlataforma(sc.nextLine());
		
		System.out.println("Informe ano de lançamento: ");
		jogo.setAno_lancamento(sc.nextInt());
		
		System.out.println("informe nota de avaliação: ");
		jogo.setNota_avaliacao(sc.nextFloat());
		
		j.alterarJogo(jogo);
		
		System.out.println();
		
	}

	private static void cadastrarJogo(Scanner sc) {
		
		sc.nextLine();
		System.out.println("informe titulo do jogo: ");
		String titulo = sc.nextLine();
		
		System.out.println("Informe genero: ");
		String genero = sc.nextLine();
		
		System.out.println("Informe plataforma: ");
		String plataforma = sc.nextLine();
		
		System.out.println("Informe ano de lançamento: ");
		int ano_lancamento = sc.nextInt();
		
		System.out.println("informe nota de avaliação: ");
		float nota_avaliacao = sc.nextFloat();
		
		Jogo jogo = new Jogo(null, titulo, genero , plataforma, ano_lancamento, nota_avaliacao);
		
		JogoDAO jogoDao = new JogoDAO();
		jogoDao.inserirJogo(jogo);
		
		System.out.println();
	}


}
