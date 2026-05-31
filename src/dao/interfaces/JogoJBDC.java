package dao.interfaces;

import java.util.List;

import model.Jogo;

public interface JogoJBDC {
	void inserirJogo (Jogo jogo);
	void alterarJogo (Jogo jogo);
	void excluirJogo (Jogo jogo);
	List <Jogo> selecionarJogos();
}
