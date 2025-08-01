package entities.domain.impuestos;

import entities.domain.productos.Producto;
import lombok.Setter;

public class EI implements Impuesto{
   // los 3 están como static para que todas las clases
    // tengan el mismo valor
    @Setter
    private static Double gananciasImpositivas;

    @Setter
    private static Double factorPrecioBase;

    @Setter
    private static Double factorGananciasImpositivas;


    @Override
    public Double calculatePara(Producto producto) {
        return ((producto.getPrecioBase()/factorPrecioBase) +
                (factorGananciasImpositivas * gananciasImpositivas));
    }
}
