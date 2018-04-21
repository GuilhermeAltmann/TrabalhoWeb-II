package classes;

import java.sql.Time;

public class Medico {

	private String crm;
	private Pessoa pessoa;
	private Time horarioInicial;
	private Time horarioFinal;
	private Especialidade especialidade;
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Time getHorarioInicial() {
		return horarioInicial;
	}
	public void setHorarioInicial(Time horarioInicial) {
		this.horarioInicial = horarioInicial;
	}
	public Time getHorarioFinal() {
		return horarioFinal;
	}
	public void setHorarioFinal(Time horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
}
