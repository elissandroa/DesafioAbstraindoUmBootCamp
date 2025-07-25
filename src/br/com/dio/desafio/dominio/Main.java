package br.com.dio.desafio.dominio;

public class Main {

	public static void main(String[] args) {
		System.out.println("Boas vindas ao desafio de projeto do Dio.me!");
		Curso curso1 = new Curso("Curso de Java", "Aprenda os fundamentos de Java", 8);
		System.out.println("Curso: " + curso1.getTitulo());

	}

}
