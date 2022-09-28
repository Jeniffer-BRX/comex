package br.com.comex.modelo;

public class Cliente {
	int idCliente;
	public String nomeCliente;
	int cpf;
	String telefone;
	String rua;
	int numeroCasa;
	String complemento;
	char bairro;
	char cidade;
	char estado;

	public Cliente(int idCliente, String nomeCliente, int cpf, String telefone, String rua, int numeroCasa,
			String complemento, String bairro, String cidade, String estado) {

		idCliente = this.idCliente;
		nomeCliente = this.nomeCliente;
		cpf = this.cpf;
		telefone = this.telefone;
		rua = this.rua;
		numeroCasa = this.numeroCasa;
		complemento = this.complemento;
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

	public char getBairro() {
		return bairro;
	}

	public char getCidade() {
		return cidade;
	}

	public char getEstado() {
		return estado;
	}

}

/*
 * id: númerico nome: nome completo do cliente; cpf: número do cadastro de
 * pessoa física do cliente; telefone: número do celular do cliente (muitos hoje
 * não possuem telefone fixo); rua: rua do endereço principal do cliente;
 * número: número do endereço principal do cliente; pode ser alfanumérico e ter
 * valores como "S/N". complemento: endereço principal do cliente; bairro:
 * endereço principal do cliente; cidade: endereço principal do cliente; estado:
 * endereço principal do cliente; Crie getters para todos os atributos.
 * 
 * Não defina setters. Receba as informações pelo construtor!
 * 
 * Crie uma classe MainCliente que define clientes para Ana, Eli e Gabi. Invente
 * as demais informações!
 * 
 * Imprima todos os dados de clientes com um formatação bacana!
 */