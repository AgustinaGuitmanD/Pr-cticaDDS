package services;

import entities.domain.Sucursal;
import entities.domain.observers.impl.ContadorDeVentas;
import entities.domain.observers.impl.Deposito;
import entities.domain.observers.impl.OficinaContable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {
    private final OficinaContableFactory oficinaContableFactory;

    @Autowired
    public SucursalService(OficinaContableFactory oficinaContableFactory) {
        this.oficinaContableFactory = oficinaContableFactory;
    }

    public Sucursal crearSucursal(String nombre) {
        Sucursal sucursal = new Sucursal(nombre);
        OficinaContable oficinaContable = oficinaContableFactory.crear();
        Deposito deposito = new Deposito();
        ContadorDeVentas contadorDeVentas = new ContadorDeVentas();
        sucursal.agregarObservers(oficinaContable, deposito, contadorDeVentas);
        return sucursal;
    }
}
