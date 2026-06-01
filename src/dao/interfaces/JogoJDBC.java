package dao.interfaces;

import java.util.List;

import model.Jogo;

public interface JogoJDBC {
	void inserirJogo (Jogo jogo);
	void alterarJogo (Jogo jogo);
	void deletarJogo (int id);
	List <Jogo> selecionarJogos();
}
