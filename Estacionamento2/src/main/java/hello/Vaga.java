package hello;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Vaga{
	private String titulo; 
	private String local;
	private String descricao; 	
	private String requisitos; 
	private String desejavel;
	private String formacao;
	private Empresa empr;
	private Beneficio benef;
	
	public Vaga(String titulo, String local, String descricao, String requisitos, String desejavel,
			String formacao, Empresa empresa, Beneficio beneficio) {
		this.titulo = titulo;
		this.local = local;
		this.descricao = descricao;
		this.requisitos = requisitos;
		this.desejavel = desejavel;
		this.formacao = formacao;
	}
	
}



