public class TestaProjeto {
    public static void main(String[] args) {
        // 1. Criando os Programadores (Eles existem sem o projeto)
        Programador dev1 = new Programador(1, "Laura", "Java");
        Programador dev2 = new Programador(2, "Lando Norris", "Python");
        Programador dev3 = new Programador(3, "Oscar Piastri", "C++");

        // 2. Criando o Projeto
        Projeto sistemaTCC = new Projeto(10, "Sistema de Monitoramento Geológico");

        // 3. Agregando os programadores ao projeto
        sistemaTCC.adicionarProgramador(dev1);
        sistemaTCC.adicionarProgramador(dev2);
        sistemaTCC.adicionarProgramador(dev3);

        // 4. Chamando o método de listagem
        sistemaTCC.listarEquipe();
    }
}