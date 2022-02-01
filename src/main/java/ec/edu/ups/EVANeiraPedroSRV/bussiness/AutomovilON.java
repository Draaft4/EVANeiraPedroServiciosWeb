package ec.edu.ups.EVANeiraPedroSRV.bussiness;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EVANeiraPedroSRV.dao.AutomovilDAO;
import ec.edu.ups.EVANeiraPedroSRV.model.Automovil;

@Stateless
public class AutomovilON implements AutomovilONLocal{
	
	@Inject
	private AutomovilDAO dao;
	
	public void crearAuto(Automovil auto) throws Exception{
		dao.insert(auto);
	}
	
	public ArrayList<Automovil> listarAutos(){
		return (ArrayList<Automovil>) dao.getList();
	}
	
}
