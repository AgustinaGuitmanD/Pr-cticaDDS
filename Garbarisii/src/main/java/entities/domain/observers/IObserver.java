package entities.domain.observers;

import entities.domain.productos.Producto;

public interface IObserver {
    void notificarVenta(Producto producto);
}
