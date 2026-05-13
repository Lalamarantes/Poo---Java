package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private final List<Cliente>clientes = new ArrayList<Cliente>();
    private Long id = 1L;

    public List<Cliente> consulta(){
        return this.clientes;
    }

    public Cliente cria(Cliente cliente){
        cliente.setId(id);
        id++;
        this.clientes.add(cliente);
        return cliente;
    }

    public boolean remove (Long id) {
        return this.clientes.removeIf(c -> c.getId().equals(id));
    }

    public Cliente atualiza(Long id, Cliente novo) {
        novo.setId(id);
        for (int i = 0; i<this.clientes.size(); i++){
            if (this.clientes.get(i).getId().equals(id)){
                this.clientes.set(i, novo); //atualiza
                return novo;
            }
        }
        return null;
    }

    public Cliente substitui(Long id, Cliente novo) {
        novo.setId(id);
        for (int i = 0; i < this.clientes.size(); i++) {
            // Procuramos o cliente na lista pelo ID
            if (this.clientes.get(i).getId().equals(id)) {
                // Substituímos o objeto antigo pelo novo na mesma posição
                this.clientes.set(i, novo);
                return novo;
            }
        }
        return null; // Se não achar o ID, retorna null para o Controller dar 404
    }
}
