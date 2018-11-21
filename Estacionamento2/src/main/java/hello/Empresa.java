package hello;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Empresa {
	private String nome; 
	private String areaAtuacao;
	private String email; 
	private String site;
	private String endereco;
	private String telefone;
	private String contato;
	
	public Empresa(String nome, String areaAtuacao, String email, String site, String endereco, String telefone,
			String contato) {
		this.nome = nome;
		this.areaAtuacao = areaAtuacao;
		this.email = email;
		this.site = site;
		this.endereco = endereco;
		this.telefone = telefone;
		this.contato = contato;
	}
	public boolean comparar(Empresa emp){
		if(nome.equals(emp.nome)){
			return true;
		} else {
			return false;
		}
	}
}
