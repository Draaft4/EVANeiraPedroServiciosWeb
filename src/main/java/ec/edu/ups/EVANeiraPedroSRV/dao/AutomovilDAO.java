package ec.edu.ups.EVANeiraPedroSRV.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EVANeiraPedroSRV.model.Automovil;


@Stateless
public class AutomovilDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Automovil automovil) throws Exception{
		em.persist(automovil);
		throw new Exception("Se ha creado correctamente");
	}
	
	public void update(Automovil automovil) throws Exception{
		em.merge(automovil);
		throw new Exception("Se ha actualizado correctamente");
	}
	
	public Automovil read(String id) {
		Automovil automovil = em.find(Automovil.class, id);
		return automovil;
	}
	
	public void delete(int id) throws Exception{
		Automovil automovil = em.find(Automovil.class, id);
		em.remove(automovil);
		throw new Exception("Se ha eliminado correctamente");
	}
	
	public List<Automovil> getList(){
		List<Automovil> listado = new ArrayList<Automovil>();
		
		String jpql = "SELECT op FROM Automovil op";
		
		Query query = em.createQuery(jpql, Automovil.class); 
	
		listado = query.getResultList();
		
		return listado;
	}
	
	
}
