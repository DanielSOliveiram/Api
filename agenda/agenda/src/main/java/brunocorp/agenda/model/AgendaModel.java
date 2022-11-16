package brunocorp.agenda.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="agenda")
public class AgendaModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer id;
	@DateTimeFormat
	@Column(name="datainclusao")
	public Date datainclusao;
	@Column(name="resumo")
	public String resuno;
	@Column(name="descricao")
	public String descricao;
	@Column(name="status")
	public String status;
	@DateTimeFormat
	@Column(name="da_altera")
	public Date da_altera;

	@Column(name="codigo")
	public int codigo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatainclusao() {
		return datainclusao;
	}

	public void setDatainclusao(Date datainclusao) {
		this.datainclusao = datainclusao;
	}

	public String getResuno() {
		return resuno;
	}

	public void setResuno(String resuno) {
		this.resuno = resuno;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDa_altera() {
		return da_altera;
	}

	public void setDa_altera(Date da_altera) {
		this.da_altera = da_altera;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


}
