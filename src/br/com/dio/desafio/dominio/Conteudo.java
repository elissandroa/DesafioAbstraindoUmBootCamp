package br.com.dio.desafio.dominio;

import java.util.Objects;

public abstract class Conteudo {

	protected final Double XP_PADRAO = 20d;
	private String titulo;
	private String descricao;
	
	public Conteudo(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public abstract double calcularTotalXp();

	public Double getXP_PADRAO() {
		return XP_PADRAO;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(XP_PADRAO, descricao, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteudo other = (Conteudo) obj;
		return Objects.equals(XP_PADRAO, other.XP_PADRAO) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
}
