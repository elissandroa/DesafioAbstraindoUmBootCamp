package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}

	private int cargaHoraria;
	
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public double calcularTotalXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", titulo=" + getTitulo() + ", descricao=" + getDescricao() + "]";
	}
}
