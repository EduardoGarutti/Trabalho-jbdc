package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.interfaces.JogoJBDC;
import model.Jogo;

public class JogoDAO implements JogoJBDC {

	private static final String sqlInsert = "INSERT INTO jogo "
			+ "(titulo, genero, plataforma, ano_lancamento, nota_avaliacao) "
			+ "VALUES (?, ?, ?, ?, ?)";
	private static final String sqlUpdate = "UPDATE jogo SET "
			+ "titulo = ?, genero = ?, plataforma = ?, ano_lancamento = ?, nota_avaliacao = ?"
			+ "  WHERE id = ?";
	private static final String sqlDelete = "DELETE FROM jogo WHERE id = ?";
	private static final String sqlSelect = "SELECT * FROM jogo";
	
	public void inserirJogo(Jogo jogo) {
		try {
			Connection conn = ConnectionMySQL.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sqlInsert);
			stmt.setString(1, jogo.getTitulo());
			stmt.setString(2, jogo.getGenero());
			stmt.setString(3, jogo.getPlataforma());
			stmt.setInt(4, jogo.getAno_lancamento());
			stmt.setFloat(5, jogo.getNota_avaliacao());
			stmt.execute();
			System.out.println("Jogo inserido com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarJogo(Jogo jogo) {
		try {
			Connection conn = ConnectionMySQL.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sqlUpdate);
			stmt.setString(1, jogo.getTitulo());
			stmt.setString(2, jogo.getGenero());
			stmt.setString(3, jogo.getPlataforma());
			stmt.setInt(4, jogo.getAno_lancamento());
			stmt.setFloat(5, jogo.getNota_avaliacao());
			stmt.execute();
			System.out.println("Jogo alterado com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deletarJogo(Jogo jogo) {
		try {
			Connection conn = ConnectionMySQL.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sqlDelete);
			stmt.setInt(1, jogo.getId());
			stmt.execute();
			System.out.println("Jogo excluído com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Jogo> selecionarJogos(){
		List<Jogo> j_list = new ArrayList<Jogo>();
		try {
			Connection conn = ConnectionMySQL.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sqlSelect);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Jogo c = new Jogo();
				c.setId(rs.getInt(1));
				c.setTitulo(rs.getString(2));
				c.setGenero(rs.getString(3));
				c.setPlataforma(rs.getString(4));
				c.setAno_lancamento(rs.getInt(5));
				c.setNota_avaliacao(rs.getFloat(6));
				j_list.add(c);
			}
			System.out.println("Jogos recuperados com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return j_list;
	}

}
