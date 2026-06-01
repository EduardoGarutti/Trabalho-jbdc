package model;

public abstract class EntidadeCatalogo {

	private Integer id;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public abstract String getTipo();
}
