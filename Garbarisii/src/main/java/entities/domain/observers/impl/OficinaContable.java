package entities.domain.observers.impl;

import entities.domain.observers.IObserver;
import entities.domain.observers.adapters.AdapterSistemaContable;
import entities.domain.productos.Producto;

public class OficinaContable implements IObserver {
    private Double totalLibroDiario;
    private AdapterSistemaContable adpater;

    public OficinaContable(AdapterSistemaContable adpater) {
        this.adpater = adpater;
        this.totalLibroDiario = 0.0;
    }

    @Override
    public void notificarVenta(Producto producto) {
        this.totalLibroDiario += producto.precioFinal();
        adpater.notificar(producto);
    }
}
