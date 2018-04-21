package classes;

import java.sql.Date;

public class Agendamento {

	private int id;
	private Cliente cliente;
	private Medico medico;
	private Date dataConsulta;
	private Date horarioConsulta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public Date getHorarioConsulta() {
		return horarioConsulta;
	}
	public void setHorarioConsulta(Date horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}
	
	
}
