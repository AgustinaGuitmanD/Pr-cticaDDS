package entities.domain.productos;

import entities.domain.impuestos.Impuesto;

import java.util.ArrayList;
import java.util.List;

public class TipoProducto {

    private String descripcion;
    private List<Impuesto> impuestos;

    public TipoProducto() {
        super();
        this.impuestos = new ArrayList<>();
    }

    public Double totalDeImpuestosPara(Producto producto) {
       return this.impuestos
               .stream()
               .mapToDouble(impuesto -> impuesto.calculatePara(producto))
               .sum();
    }
}
