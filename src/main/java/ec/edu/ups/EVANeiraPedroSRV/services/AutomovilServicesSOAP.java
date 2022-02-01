package ec.edu.ups.EVANeiraPedroSRV.services;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.EVANeiraPedroSRV.bussiness.AutomovilONLocal;
import ec.edu.ups.EVANeiraPedroSRV.model.Automovil;

@WebService
public class AutomovilServicesSOAP {
	
	@Inject
	private AutomovilONLocal automovilON;
	
	@WebMethod
	public String crearAuto(Automovil auto) {
		try {
			automovilON.crearAuto(auto);
		}catch(Exception e) {
			return e.getMessage();
		}
		return "";
	}
	
	@WebMethod
	public ArrayList<Automovil> listarAutos(){
		return automovilON.listarAutos();
	}
	
}
