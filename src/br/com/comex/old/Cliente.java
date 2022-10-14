package br.com.comex.old;

public class Cliente {
	
	int idCliente;
	public String nomeCliente;
	int cpf;
	String telefone;
	String rua;
	int numeroCasa;
	String complemento;
	String bairro;
	String cidade;
	String estado;

	public Cliente(int idCliente, String nomeCliente, int cpf, String telefone, String rua, int numeroCasa,
			String complemento, String bairro, String cidade, String estado) {

		if (idCliente == 0) { //validar nome
			throw new IllegalArgumentException("ID INVALIDO! VERIFIQUE");
		}
		
		if (nomeCliente == null) { //validar nome
			throw new IllegalArgumentException("NOME EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (nomeCliente.length() <= 5) {
			throw new IllegalArgumentException("NOME muito pequeno verifique! ");
		}
		
		if (cpf <= 11) {
			throw new IllegalArgumentException("cpf com tamanho invalido, verifique! ");
		}
		
		if (telefone == null ) {
			throw new IllegalArgumentException("telefone em branco, verifique ");
		}
		
		if (rua == null) {
			throw new IllegalArgumentException("RUA EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (numeroCasa == 0) {
			throw new IllegalArgumentException("numero da casa EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (bairro == null) { 
			throw new IllegalArgumentException("BAIRRO EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (cidade == null) { 
			throw new IllegalArgumentException("CIDADE EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (estado.length() > 2) {
			throw new IllegalArgumentException("ESTADO com tamanho invalido! VERIFIQUE ");
		}
		
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public int getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getRua() {
		return rua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

}

/*

 */