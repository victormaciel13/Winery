package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Menu de vinhos:\n- Cabernet Sauvignon\n- Merlot\n- Pinot Noir";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! " + quantity + "x " + name;
    }
}
