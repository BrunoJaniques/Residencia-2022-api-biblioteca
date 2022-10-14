package br.com.residencia.biblioteca.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.residencia.biblioteca.entity.Editora;


public class EditoraDTO {
	private Integer codigoEditora;
	private String nome;
	
	
	public EditoraDTO(Editora editora) {
		 	this.codigoEditora = editora.getCodigoEditora();
	        this.nome= editora.getNome();
	      
	}
	public EditoraDTO(Integer codigoEditora, String nome) {
		this.codigoEditora = codigoEditora;
		this.nome = nome;
	}
	public Integer getCodigoEditora() {
		return codigoEditora;
	}
	public void setCodigoEditora(Integer codigoEditora) {
		this.codigoEditora = codigoEditora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	}
	
	

