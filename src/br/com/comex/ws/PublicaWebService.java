package br.com.comex.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

    public static void main(String[] args) {

        ComexWS comex = new ComexWS();
        
        
        String URL = "http://localhost:8080/ComexWS";

        System.out.println("Comex WS Rodando: " + URL);

        Endpoint.publish(URL, comex); // associa de url e categoria ws
      
    }

}