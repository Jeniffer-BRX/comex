package br.com.comex.modelo;
import java.lang.String;


public class Categoria {

	private int id_cat;
	private String nome_cat;
	private StatusCategoria status;

	public Categoria(int id_cat, String nome_cat, StatusCategoria status) {
		
		this.id_cat = id_cat;
		this.nome_cat = nome_cat;
		this.setStatus(status);
		
		if (id_cat  == 0 ) { // validacao id
			throw new IllegalArgumentException("ID obrigatorio, deve ser maior que zero! "); 
		}
		
		if (nome_cat.length() <= 3) { //validacao tamanho nome 
			throw new IllegalArgumentException("Nome da categoria invalido! Deve ser maior que 3!");
		}
		
		/*if () { //validacao status
			throw new IllegalArgumentException("cat ativa teste");
			TODO VALIDAR ENUM
		}*/
	} 

	//public Categoria () {
		
	//}
/**/

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public String getNome_cat() {
		return nome_cat;
	}

	public void setNome_cat(String nome_cat) {
		this.nome_cat = nome_cat;
	}

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}


	

}
