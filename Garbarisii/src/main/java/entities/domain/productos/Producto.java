package entities.domain.productos;

import lombok.Getter;

public class Producto {
    private TipoProducto tipo;
    @Getter
    private Double precioBase;
    private String descripcion;

    public Double precioFinal() {
        return this.totalImpuestos() + this.precioBase;
    }

    public Double totalImpuestos() {
        return this.tipo.totalDeImpuestosPara(this);
    }


}
