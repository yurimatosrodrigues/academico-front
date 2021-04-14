package br.sp.gov.etec.academicofront.dto;

import java.io.Serializable;

public class Login implements Serializable {
	
	private static final long serialVersionUID = 2949369334033485694L;

	private Long id;
	private String login;
	private String password;
	private String tipo;
	private String nome;
	
	public Login() {
		
	}
	
	public Login(String login, String password, String tipo, String nome) {
		super();
		this.login = login;
		this.password = password;
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.login;
	}

	public void setUsername(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoLogin() {
		return tipo;
	}

	public void setTipoLogin(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
