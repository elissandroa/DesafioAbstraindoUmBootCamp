package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

	public Mentoria(String titulo, String descricao, LocalDateTime data) {
		super(titulo, descricao);
		this.data = data;
	}

	private LocalDateTime data;
	
	
	
	public LocalDateTime getData() {
		return data;
	}

	@Override
	public double calcularTotalXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override	
	public String toString() {
		return "Mentoria [data=" + data + ", titulo=" + getTitulo() + ", descricao=" + getDescricao() + "]";
	}
}
