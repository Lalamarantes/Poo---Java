public class TestaEdificio {
    public static void main(String[] args) {
        // 1. Instanciamos o Edifício (O Todo)
        Edificio torreFranca = new Edificio("Residencial Amazonas", "Av. Rio Amazonas, 500");

        // 2. Chamamos o método de COMPOSIÇÃO
        // Repare: não damos 'new' em Apartamento aqui no main!
        torreFranca.construirApartamento(101, 1);
        torreFranca.construirApartamento(202, 2);
        torreFranca.construirApartamento(303, 3);

        // 3. Exibindo o resultado
        System.out.println(torreFranca.toString());

        // PROVA DA COMPOSIÇÃO:
        // Se o objeto 'torreFranca' for deletado, os apartamentos 101, 202 e 303
        // deixam de existir, pois só "moram" dentro da lista do edifício.
    }
}