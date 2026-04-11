import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        // 1. Instanciando Filmes
        Filme f1 = new Filme(1, "Batman", "Ação", 175);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 155);

        // 2. Criando Sessão para 20/07/2026 às 20h00
        LocalDateTime dataSessao = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao1 = new Sessao(101, dataSessao, 1);

        // 3. AGREGAÇÃO: Vinculando o filme Batman
        sessao1.vincularFilme(f1);

        // 4. COMPOSIÇÃO: Vendendo ingressos
        sessao1.venderIngresso(1, "A1", "Inteira", 40.0f);
        sessao1.venderIngresso(2, "A2", "Meia", 20.0f);
        sessao1.venderIngresso(3, "A3", "Inteira", 40.0f);

        // 5. Imprimindo resultado
        System.out.println(sessao1.toString());
    }
}]