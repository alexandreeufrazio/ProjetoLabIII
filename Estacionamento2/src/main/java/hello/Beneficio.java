package hello;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Beneficio {
	private String salario;
	private String convenioMedico;
	private String convenioOndotologico;
	private String refeicao;
	private String valorRefeicao;
	private String alimentacao;
	private String valorAlimentacao;
	private String auxilioEscola;
	private String valorAuxEscola;
	
	public Beneficio(String salario, String convenioMedico, String convenioOndotologico, String refeicao,
			String valorRefeicao, String alimentacao, String valorAlimentacao, String auxilioEscola,
			String valorAuxEscola) {
		this.salario = salario;
		this.convenioMedico = convenioMedico;
		this.convenioOndotologico = convenioOndotologico;
		this.refeicao = refeicao;
		this.valorRefeicao = valorRefeicao;
		this.alimentacao = alimentacao;
		this.valorAlimentacao = valorAlimentacao;
		this.auxilioEscola = auxilioEscola;
		this.valorAuxEscola = valorAuxEscola;
	}
}


