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
		//controller.adicinarVagas();
		
		
		
		
    }
    
    public static void inicializarVagas(){
  
		
    	model.addVaga(new Vaga("Analista de Sistemas", "S�o Jos� dos Campos", "Atuar no desenvolvimento dos aplicativos da empresa", "Conhecimento avan�ado de Java", "Ingl�s fluente", "Gradua��o de TI"));
    	
    	model.addVaga(new Vaga("Analista de Suporte", "S�o Paulo", "Atuar manuten��o e preventicas dos equipamentos de TI", "Conhecimento Hardware e Software", "Certifica��o Microsoft", "Gradua��o de TI"));
    	
    }
}
