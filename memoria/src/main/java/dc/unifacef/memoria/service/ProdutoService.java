package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    // cria o ArrayList
    private final List<Produto> produtos = new ArrayList<Produto>();
    private Long id = 1L;
    // consulta os produtos na lista
    public List<Produto> consulta(){
        return this.produtos;
    }
    // insere produto na lista
    public Produto cria(Produto produto){
        produto.setId(id);
        id++;
        this.produtos.add(produto);
        return produto;
    }

    // remove um produto com id
    public boolean remove(Long id){
        return this.produtos.removeIf( p -> p.getId().equals(id));
    }

    //atualiza um produto por id
    public Produto atualiza(Long id, Produto novo) {
        novo.setId(id);
        //percorrer pra atualizar o produto
        for (int i = 0; i<this.produtos.size(); i++){
            if (this.produtos.get(i).getId().equals(id)){
                this.produtos.set(i, novo); //atualiza
                return novo;
            }
        }
        return null; // produto nao encontrado pra atualizar
    }
}