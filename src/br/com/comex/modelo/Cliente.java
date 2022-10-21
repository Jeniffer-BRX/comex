package br.com.comex.modelo;

public class Cliente {
	Long id;
	String nomeCliente;
	int cpf;
	String telefone;
	String rua;
	int numero;
	String complemento;
	String bairro;
	String cidade;
	String uf;
	
	//sem id
	public Cliente (String nomeC, int cpf, String telefone, String rua, int numero,
			String complemento, String bairro, String cidade, String uf) {
		
		this.nomeCliente = nomeC;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		
		if (nomeC == null) { //
			throw new IllegalArgumentException("NOME EH OBRIGATORIO! VERIFIQUE ");
		}
		
//		if (cliente.length() <= 5) {
//			throw new IllegalArgumentException("NOME muito pequeno verifique! ");
//		}
		
		if (cpf <= 11) {
			throw new IllegalArgumentException("cpf com tamanho invalido, verifique! ");
		}
		
		if (telefone == null ) {
			throw new IllegalArgumentException("telefone em branco, verifique ");
		}
		
		if (rua == null) {
			throw new IllegalArgumentException("RUA EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (numero == 0) {
			throw new IllegalArgumentException("numero da casa EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (bairro == null) { 
			throw new IllegalArgumentException("BAIRRO EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (cidade == null) { 
			throw new IllegalArgumentException("CIDADE EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (uf.length() > 2) {
			throw new IllegalArgumentException("ESTADO com tamanho invalido! VERIFIQUE ");
		}
	}
	
	//com id
	public Cliente(Long id, String nomeC, int cpf, String telefone, String rua, int numero,
			String complemento, String bairro, String cidade, String uf) {

		if (id == 0) { //validar nome
			throw new IllegalArgumentException("ID INVALIDO! VERIFIQUE");
		}
		
		if (nomeC == null) { //
			throw new IllegalArgumentException("NOME EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (nomeC.length() <= 2) {
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
		
		if (numero == 0) {
			throw new IllegalArgumentException("numero da casa EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (bairro == null) { 
			throw new IllegalArgumentException("BAIRRO EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (cidade == null) { 
			throw new IllegalArgumentException("CIDADE EH OBRIGATORIO! VERIFIQUE ");
		}
		
		if (uf.length() > 2) {
			throw new IllegalArgumentException("ESTADO com tamanho invalido! VERIFIQUE ");
		}
		
		this.id = id;
		this.nomeCliente = nomeC;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		
	}

	//gets e sets to string
	public long getId() {
		return id;
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

	public int getNumero() {
		return numero;
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
		
	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getUf() {
		return uf;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nomeCliente + ", cpf=" + cpf + ", telefone=" + telefone + ", rua=" + rua
				+ ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + uf + "]";
	}

	
}

/*

 */