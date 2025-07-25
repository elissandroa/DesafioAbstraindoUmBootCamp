package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Aprenda Java do zero ao avançado");
		
		bootcamp.addConteudo(new Curso("Curso de Java Básico", "Aprenda os fundamentos do Java", 20));
		bootcamp.addConteudo(new Curso("Curso de Java Avançado", "Aprofunde seus conhecimentos em Java", 30));
		bootcamp.addConteudo(new Mentoria("Mentoria de Java", "Tire suas dúvidas sobre Java", LocalDateTime.now()));
		bootcamp.addConteudo(new Mentoria("Mentoria de Desenvolvimento de Software", "Dicas e orientações sobre desenvolvimento de software", LocalDateTime.now().plusDays(1)));
		bootcamp.listarConteudos();
		
		Dev dev1 = new Dev("Alice");
		Dev dev2 = new Dev("Bob");
		
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        
       	dev1.listarConteudosInscritos();
       	dev2.listarConteudosInscritos();
       	
       	dev1.conteudoAtual();
       	dev2.conteudoAtual();
       	
       	dev1.progredir();
       	dev2.progredir();
       	
       	dev1.listarConteudosInscritos();
       	dev2.listarConteudosInscritos();
       	
       	dev1.conteudoAtual();
       	dev2.conteudoAtual();
       	
       	System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularTotalXp());
       	System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
       	
       	dev1.progredir();
       	dev2.progredir();
       	
       	dev1.listarConteudosInscritos();
       	dev2.listarConteudosInscritos();
       	
       	dev1.conteudoAtual();
       	dev2.conteudoAtual();
       	
       	System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularTotalXp());
       	System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
  
       	dev1.progredir();
       	dev2.progredir();

        dev1.listarConteudosInscritos();
        dev2.listarConteudosInscritos();
        
       	dev1.conteudoAtual();
       	dev2.conteudoAtual();
       	
       	System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularTotalXp());
       	System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
       	
       	dev1.progredir();
       	dev2.progredir();
       	
       	  	
       	System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularTotalXp());
       	System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
       	

	}

}
