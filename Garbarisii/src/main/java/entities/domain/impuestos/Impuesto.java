package entities.domain.impuestos;

import entities.domain.productos.Producto;

public interface Impuesto {

    public Double calculatePara(Producto producto);
}
