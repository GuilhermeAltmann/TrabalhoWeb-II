package classes;

import java.sql.Date;
import java.sql.Time;

public class Agendamento {

	private int id;
	private Cliente cliente;
	private Medico medico;
	private Date dataConsulta;
	private Time horarioConsulta;
	
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
	public Time getHorarioConsulta() {
		return horarioConsulta;
	}
	public void setHorarioConsulta(Time horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}
	
	
}
