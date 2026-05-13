package dc.unifacef.memoria.controller;

import dc.unifacef.memoria.model.Cliente;
import dc.unifacef.memoria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> consulta() {
        return ResponseEntity.ok(service.consulta());
    }

    @PostMapping
    public ResponseEntity<Cliente> cria (@RequestBody Cliente cliente) {
        Cliente novo = service.cria(cliente);
        URI uri = URI.create("/cliente/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>remove(@PathVariable Long id){
        if(service.remove(id)) {
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Cliente> atualiza (@PathVariable Long id, @RequestBody Cliente novo){
        Cliente resposta = service.atualiza(id, novo);
        if(resposta != null){
            return ResponseEntity.ok(resposta);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> substitui(@PathVariable Long id, @RequestBody Cliente novo) {
        // Chamamos o método que percorre a lista e troca o objeto
        Cliente resposta = service.substitui(id, novo);

        if (resposta != null) {
            // Se encontrou o ID e substituiu, retorna 200 OK com o novo objeto
            return ResponseEntity.ok(resposta);
        } else {
            // Se o ID não existia na lista, retorna 404 Not Found
            return ResponseEntity.notFound().build();
        }
    }
}
