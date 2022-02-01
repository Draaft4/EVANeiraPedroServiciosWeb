package ec.edu.ups.EVANeiraPedroSRV.bussiness;

import java.util.ArrayList;

import javax.ejb.Local;

import ec.edu.ups.EVANeiraPedroSRV.model.Automovil;

@Local
public interface AutomovilONLocal {
	
	public void crearAuto(Automovil auto) throws Exception;
	
	public ArrayList<Automovil> listarAutos();
	
}
