package entities.domain.observers.impl;

import entities.domain.observers.IObserver;
import entities.domain.productos.Producto;

public class ContadorDeVentas implements IObserver {

    private Integer contadorVentas = 0;

    public ContadorDeVentas() {
        this.contadorVentas = 0;
    }

    @Override
    public void notificarVenta(Producto producto) {
        this.contadorVentas++;
    }
}
