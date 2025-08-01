package services;

import entities.domain.observers.adapters.AdapterSistemaContable;
import entities.domain.observers.impl.OficinaContable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OficinaContableFactory {
    private final AdapterSistemaContable adapterSistemaContable;

    @Autowired
    public OficinaContableFactory(AdapterSistemaContable adapterSistemaContable) {
        this.adapterSistemaContable = adapterSistemaContable;
    }

    public OficinaContable crear() {
        return new OficinaContable(adapterSistemaContable);
    }
}
