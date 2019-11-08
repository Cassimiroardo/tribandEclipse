package com.integrador.model;

import java.sql.Date;
import java.sql.Time;
@Tabela(nome="reserva")
public class Reserva extends EntidadeBase{
	@Atributo(nome="id_estudio",tipo=EntidadeBase.class)
	private Estudio estudio;

	@Atributo(nome="id_banda",tipo=EntidadeBase.class)
	private Banda banda;
	@Atributo(nome="data_reserva",tipo=Date.class)
	private Date dataReserva;
	@Atributo(nome="horario_final",tipo=Time.class)
	private Time horarioFinal;

	@Atributo(nome="horario_inicio",tipo=Time.class)
	private Time horarioInicio;

	@Atributo(nome="id_reserva",tipo=Long.class)
	private Long idReserva;

	@Atributo(nome="preco",tipo=Double.class)
	private Double preco;

	public Reserva() {
		super();

	}
	
	public Reserva(Estudio agenda, Banda banda, Date dataReserva, Time horarioFinal, Time horarioInicio,
			Long idReserva) {

		super();

		this.estudio = agenda;
		this.banda = banda;
		this.dataReserva = dataReserva;
		this.horarioFinal = horarioFinal;
		this.horarioInicio = horarioInicio;
		this.idReserva = idReserva;
	}

	//GETS E SETS
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this.idReserva;
	}
	
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.idReserva = id;
	}
	
	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Time getHorarioFinal() {
		return horarioFinal;
	}

	public void setHorarioFinal(Time horarioFinal) {
		this.horarioFinal = horarioFinal;
	}

	public Time getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Time horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
		
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Banda getBanda() {
		return banda;
	}
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	public Estudio getEstudio() {
		return estudio;
	}
	public void setEstudio(Estudio agenda) {
		this.estudio = agenda;
	}
	
	
}