package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "usuario")
@Entity
public class Usuario {

	static private int cont;

	@Id
	private Integer id_usuario;
	private String nome;
	private String deficiente;
	private String email;
	private String senha;
	private String username;
	private String password;
	private String grupo;

	public Usuario() {
		this.id_usuario = cont;
		cont++;
	}

	public Usuario(Integer id_usuario, String nome, String deficiente, String email, String senha) {
		this.id_usuario = id_usuario;
		this.nome = nome;
		this.deficiente = deficiente;
		this.email = email;
		this.senha = senha;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDeficiente() {
		return deficiente;
	}

	public void setDeficiente(String deficiente) {
		this.deficiente = deficiente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario clone() {
		return new Usuario(id_usuario, nome, deficiente, email, senha);
	}

}
