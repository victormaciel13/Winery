package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {
        // URL onde o serviço será publicado
        String url = "http://localhost:8080/winery";

        // Instancia a implementação do serviço
        WineStockServiceImplementation implementacao = new WineStockServiceImplementation();

        // Publica o serviço
        Endpoint.publish(url, implementacao);

        System.out.println("Serviço publicado em: " + url);
    }
}
