package br.com.comex.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

    public static void main(String[] args) {

        CategoriaWS catWS = new CategoriaWS();
        String URL = "http://localhost:8080/categoriaws";

        System.out.println("Categoria WS rodando: " + URL);

        Endpoint.publish(URL, catWS); // associa de url e categoria ws
    }

}