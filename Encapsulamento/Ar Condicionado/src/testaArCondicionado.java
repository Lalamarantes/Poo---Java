
    public static void main(String[] args) {
        // Testando a regra da marca curta e temperatura errada
        ArCondicionado ar = new ArCondicionado("LG", "Dual Inverter", 45, true);

        // Testando o Modo Turbo
        ar.setMarca("Samsung"); // Agora com nome válido
        ar.setTemperatura(22);
        ar.ativarModoTurbo();

        System.out.println(ar.toString());
    }
