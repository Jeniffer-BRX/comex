package comex;

public class Categoria {

	private int id_cat = 0;
	private char nome_cat = 0;
	private boolean status_cat = true;

	public Categoria() {
	}

	public Categoria(int id_cat, char nome_cat, boolean status_cat) {
		super();
		this.id_cat = id_cat;
		this.nome_cat = nome_cat;
		this.status_cat = status_cat;
	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public char getNome_cat() {
		return nome_cat;
	}

	public void setNome_cat(char nome_cat) {
		this.nome_cat = nome_cat;
	}

	public boolean isStatus_cat() {
		return status_cat;
	}

	public void setStatus_cat(boolean status_cat) {
		this.status_cat = status_cat;
	}

}
