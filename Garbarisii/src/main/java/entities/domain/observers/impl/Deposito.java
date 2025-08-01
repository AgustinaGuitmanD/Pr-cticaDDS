package entities.domain.observers.impl;

import entities.domain.observers.IObserver;
import entities.domain.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Deposito implements IObserver {
    private List<Producto> productosApreparar;

    public Deposito() {
        this.productosApreparar = new ArrayList<>();
    }
    @Override
    public void notificarVenta(Producto producto) {
        this.preparar(producto);
    }

    private void preparar(Producto producto) {
        this.productosApreparar.add(producto);
    }
}
