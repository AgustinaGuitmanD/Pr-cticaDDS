package entities.domain.observers.adapters;

import entities.domain.productos.Producto;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class AdapterSistemaContableHTTP implements AdapterSistemaContable{

    private final WebClient webClient;

    public AdapterSistemaContableHTTP() {
        this.webClient = WebClient.create("http://sistema-contable/api");
    }

    @Override
    public void notificar(Producto producto) {
        webClient.post()
                .uri("/ventas")
                .bodyValue(producto)
                .retrieve()
                .bodyToMono(Void.class)
                .subscribe();

    }
}
