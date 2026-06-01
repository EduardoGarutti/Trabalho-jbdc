package model;

public class Jogo extends EntidadeCatalogo {

	private String titulo;
	private String genero;
	private String plataforma;
	private int ano_lancamento;
	private float nota_avaliacao;
	
	public Jogo() {
		
	}
	
	public Jogo(Integer id, String titulo, String genero, String plataforma, int ano_lancamento, float nota_avaliacao) {
		setId(id);
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.ano_lancamento = ano_lancamento;
		this.nota_avaliacao = nota_avaliacao;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public int getAno_lancamento() {
		return ano_lancamento;
	}
	
	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}
	
	public float getNota_avaliacao() {
		return nota_avaliacao;
	}
	
	public void setNota_avaliacao(float nota_avaliacao) {
		this.nota_avaliacao = nota_avaliacao;
	}

	@Override
	public String getTipo() {
		return "Jogo";
	}
	
	@Override
	public String toString() {
		return getTipo() + " ID " + getId() + 
				" | Título: " + this.titulo + 
				" | Gênero: " + this.genero +
				" | Plataforma: " + this.plataforma +
				" | Ano de Lançamento: " + this.ano_lancamento +
				" | Nota de Avaliação: " + this.nota_avaliacao;
	}
}
