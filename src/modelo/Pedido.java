package modelo;

import java.util.ArrayList;

public class Pedido {
    // ATRIBUTOS
    private int id;
    private String cliente;
    private ArrayList<ItemPedido> items;

    // CONSTRUCTOR
    public Pedido(int id, String cliente, ArrayList<ItemPedido> items) {
        this.id = id;
        this.cliente = cliente;
        this.items = items;
    }

    // METODOS GETTER
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<ItemPedido> getItems() {
        return items;
    }

    // METODOS SETTER
    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setItems(ArrayList<ItemPedido> items) {
        this.items = items;
    }
}
