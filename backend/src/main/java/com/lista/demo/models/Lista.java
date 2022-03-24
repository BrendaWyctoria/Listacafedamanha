package com.lista.demo.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_LISTA")
public class Lista implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	private String nome;
	
	private String cpf;
	
	private String opcafe1; 
	
	private String opcafe2;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getOpcafe1() {
		return opcafe1;
	}

	public void setOpcafe1(String opcafe1) {
		this.opcafe1 = opcafe1;
	}

	public String getOpcafe2() {
		return opcafe2;
	}

	public void setOpcafe2(String opcafe2) {
		this.opcafe2 = opcafe2;
	}
	

}
