package entities.domain;

import entities.domain.observers.IObserver;
import entities.domain.productos.Producto;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sucursal {
    private String nombre;
    private List<Producto> productos;
    private  List <IObserver> observers;

    public Sucursal(String nombre) {
        this.nombre = nombre;
    }

    public void agregarObservers(IObserver ... observers) {
        Collections.addAll(this.observers, observers);
    }

    public void vende(Producto producto) {
        // Al usar un foreach estoy haciendo un llamadas sincrónicas y secuenciales
        // podríamos tratar de que se llamen a todos los obs de forma paralela para
        // no penalizar a aquellos que van después de alguno pesado.
        this.observers.forEach(o->o.notificarVenta(producto));
    }
}
