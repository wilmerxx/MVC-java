package com.espe.prueba;

import com.espe.controlador.ClienteController;
import com.espe.modelo.ClienteBean;
import com.espe.vista.ClienteView;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteBean modeloCliente = llenarDatosClientes();
		ClienteView vistaCliente = new ClienteView();
		
		//crear un objeto
		ClienteController controladorCliente = new ClienteController(modeloCliente, vistaCliente);
		
		controladorCliente.actualizarVista();
		
		modeloCliente.setNombreCli("Mesias");
		controladorCliente.actualizarVista();
		
	}
	
	//Método estático que retorna el cliente con sus datos

	private static ClienteBean llenarDatosClientes() {
		// TODO Auto-generated method stub
		ClienteBean oCliente = new ClienteBean();
		oCliente.setIdCli(1);
		oCliente.setNombreCli("Wilmer");
		oCliente.setApellidoCli("Shagnay");
		oCliente.setCedulaCli("13156151");
		
		return oCliente;
	}

}
