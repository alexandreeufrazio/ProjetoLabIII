package hello;

import static spark.Spark.*;



public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 1214;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarVagas();

		Controller controller = new Controller(model);
		
		controller.buscarVagaLocal();
		controller.buscarVagaTitulo();
		controller.listaTodasVagas();
		
    }
    
    public static void inicializarVagas(){
    	model.addVaga(new Vaga("Analista de Sistemas", "S�o Jos� dos Campos", "Atuar no desenvolvimento dos aplicativos da empresa", "Conhecimento avan�ado de Java", "Ingl�s fluente", "Gradua��o de TI",  new Empresa("AVIBR", "Aeronautica", "selecao@avibr.com", "www.avibr.com", "Av. Dom Pedro n�100", "12 3944-3367", "Maisa"), new Beneficio("R$5600.00", "Sim", "Sim", "Sim", "R$25.00 ao dia", "Sim", "R$300.00 ao m�s", "Sim", "R$500.00")));
    	
    	model.addVaga(new Vaga("Analista de Suporte", "S�o Paulo", "Atuar manuten��o e preventicas dos equipamentos de TI", "Conhecimento Hardware e Software", "Certifica��o Microsoft", "Gradua��o de TI",  new Empresa("ITTEC", "Consultoria de TI", "selecao@ittec.com", "www.ittec.com", "Av. Dom Bosco n�300", "11 3090-3368", "Isabela"), new Beneficio("R$3500.00", "Sim", "Sim", "Sim", "R$25.00 ao dia", "Sim", "R$500.00 ao m�s", "Sim", "R$800.00")));
    	
    }
}
