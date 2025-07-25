package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private LocalDateTime dataInicial;
	private LocalDateTime dataFinal;
	private String nome;
	
	private String descricao;
	
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicial = LocalDateTime.now();
		this.dataFinal = dataInicial.plusDays(45);
	}
	
	public void addConteudo(Conteudo conteudo) {
		this.conteudos.add(conteudo);
	}

	public LocalDateTime getDataInicial() {
		return dataInicial;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public LocalDateTime getDataFinal() {
		return dataFinal;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(nome, other.nome);
	}
	
	

}
