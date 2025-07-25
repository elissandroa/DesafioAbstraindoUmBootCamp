package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public Dev(String nome) {
		this.nome = nome;
	}

	public void progredir() {

		if (!conteudosInscritos.isEmpty()) {
			System.out.println("Progredindo no conteúdo: " + conteudosInscritos.iterator().next().getTitulo());
			Conteudo conteudo = conteudosInscritos.iterator().next();
			conteudosConcluidos.add(conteudo);
			conteudosInscritos.remove(conteudo);
			System.out.println("Você concluiu o conteúdo: " + conteudo.getTitulo());
		} 
		if (!conteudosConcluidos.isEmpty() && conteudosInscritos.size() == 0) {
			System.out.println("Parabéns " + nome + "! Você concluiu o Bootcamp!");
			return;

		}
	}

	public void conteudoAtual() {
		if (!conteudosInscritos.isEmpty()) {
			System.out.println(nome + " - Conteúdo atual: " + conteudosInscritos.iterator().next().getTitulo());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}

	public void listarConteudosInscritos() {
		if (conteudosInscritos.isEmpty()) {
			System.out.println("Nenhum conteúdo inscrito.");
		} else {
			System.out.println("O Aluno(a) " + nome + " está inscrito nos seguintes conteúdos:");
			for (Conteudo conteudo : conteudosInscritos) {
				System.out.println("- " + conteudo.getTitulo());
			}
		}
	}

	public double calcularTotalXp() {
		return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularTotalXp).sum();
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
	}

	public String getNome() {
		return nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(nome, other.nome);
	}

}
