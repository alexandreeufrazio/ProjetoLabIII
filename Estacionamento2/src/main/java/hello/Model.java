package hello;


import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import java.util.LinkedList;

public class Model{
	
	ObjectContainer vagas = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "vagas.db4o");

	
	public void addVaga(Vaga vaga){
		vagas.store(vaga);
		vagas.commit();
	}
	
	public List<Vaga> buscarLocal(String local){
		Query query = vagas.query();
		query.constrain(Vaga.class);
	    ObjectSet<Vaga> todasVagas = query.execute();
		
		List<Vaga> vagasEncontrados = new LinkedList<Vaga>();
		
		for(Vaga vaga:todasVagas){
			 if(vaga.getLocal().contains(local)) vagasEncontrados.add(vaga);
		}
		
		return vagasEncontrados;
		
	}
	
	public List<Vaga> buscarTitulo(String titulo){
		Query query = vagas.query();
		query.constrain(Vaga.class);
	    ObjectSet<Vaga> todasVagas = query.execute();
		
		List<Vaga> vagasEncontrados = new LinkedList<Vaga>();
		
		for(Vaga vaga:todasVagas) {
			if(vaga.getTitulo().contains(titulo)) vagasEncontrados.add(vaga);
		}
		return vagasEncontrados;
	}
	
	public List<Vaga> buscarEmpresa(Empresa emp){
		Query query = vagas.query();
		query.constrain(Vaga.class);
	    ObjectSet<Vaga> todasVagas = query.execute();
	    
		List<Vaga> vagasEncontrados = new LinkedList<Vaga>();
		
		for(Vaga vaga:todasVagas){
			 if(emp.comparar(vaga.getEmpr())) vagasEncontrados.add(vaga);
		}
		
		return vagasEncontrados;
		
	}
	
	public List<Vaga> getVagas(){
		Query query = vagas.query();
		query.constrain(Vaga.class);
	    ObjectSet<Vaga> todasVagas = query.execute();
	    
		return todasVagas;
	}

}
