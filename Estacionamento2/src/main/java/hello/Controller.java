package hello;

import static spark.Spark.get;
import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void buscarVagaLocal(){
		get("/vaga/local/:local", (req, res) -> {
		
			List<Vaga> vagasEncontrado = model.buscarLocal(req.params(":local"));	
			return new Gson().toJson(vagasEncontrado);
			
		});
	}
	
	public void buscarVagaTitulo(){
		get("/vaga/local/titulo/:titulo", (req, res) -> {
		
			List<Vaga> vagasEncontrado = model.buscarTitulo(req.params(":titulo"));	
			return new Gson().toJson(vagasEncontrado);
			
		});
	}
	
	public void listaTodasVagas() {
		get("/vaga/", (req, res) -> {
			return new Gson().toJson(model.getVagas());
			
			
		});
		
	}
	
	/*public void adicinarVagas() {
		    get("/vaga/local/titulo/nome/:tituto/:local/:descricao/:requisitos/:desejavel/:formacao", (req, res) -> {
			
			
			model.addVaga2(req.params(":titulo"), req.params(":local"), req.params(":descricao"), req.params(":requisitos"), req.params(":desejavel"), req.params(":formacao"));
			return null;
			
			
		});
	}*/
			
}
	
	


