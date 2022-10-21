package br.com.comex.main;

import javax.xml.ws.Endpoint;

import br.com.comex.ws.ComexWS;

public class MainComexWS {

	public static void main(String[] args) {

ComexWS comex = new ComexWS();
        
        
        String URL = "http://localhost:8080/ComexWS";

        System.out.println("Comex WS Rodando: " + URL);

        Endpoint.publish(URL, comex);
		
		
	}

}
