package com.espe.controlador;

import com.espe.modelo.ClienteBean;
import com.espe.vista.ClienteView;

public class ClienteController {

	// objetos vista y modelo

	private ClienteView vista;
	private ClienteBean modelo;

	// constructor para inicializar el modelo y la vista

	public ClienteController(ClienteBean modelo, ClienteView vista) {

		this.modelo = modelo;
		this.vista = vista;

	}

	// Pasar el modelo a la vista para presentar los datos
	public void actualizarVista() {
		vista.imprimirDatosClientes(modelo.getIdCli(), modelo.getNombreCli(), modelo.getApellidoCli(),
				modelo.getCedulaCli());
	}

}
