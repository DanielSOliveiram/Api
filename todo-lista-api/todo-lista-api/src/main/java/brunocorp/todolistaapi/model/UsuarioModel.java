package brunocorp.todolistaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name="usuario")
public class UsuarioModel {
 
	@Column(nullable=false,length =40 )
	public String nome;
	@Column(nullable=false,length=11)
	public int senha;
	@Id
	public Integer codigo;

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	


}
