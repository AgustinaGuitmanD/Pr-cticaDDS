package entities.domain.observers.adapters;

import entities.domain.productos.Producto;

public interface AdapterSistemaContable {
    void notificar(Producto producto);
}
