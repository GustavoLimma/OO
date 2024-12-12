public class App {
    public static void main(String[] args) {
        
        // Testando C2
        C2 nivelTreino = new C2("Treino Básico", 1);
        nivelTreino.exibirDetalhes();

        // Testando C3 que implementa I1 e I2
        C3 treinoCardio = new C3("Cardio Intenso", 30);
        treinoCardio.exibirDetalhes();
        treinoCardio.cardio();
        treinoCardio.bulking();
        treinoCardio.cutting();
        
        // Testando C3 com metodos sobrescritos
        C3 novoTreino = new C3("Cardio moderado");
        novoTreino.exibirDetalhes("Cuidado para não correr demais!!");
        novoTreino.cardio("Moderada");

        // Testando C4
        C4 treinoComEquipamento = new C4("Treino com Peso", 2, "Halteres");
        treinoComEquipamento.exibirDetalhes();

        // Testando C5 que implementa I1
        C5 treinoForca = new C5("Treino de Força", 3, 12);
        treinoForca.exibirDetalhes();
        treinoForca.cardio();

        // Criando um C4 com uma variante de construtor
        C4 outroTreino = new C4("Treino Avançado", 3, "Barra fixa");
        outroTreino.exibirDetalhes();

        // Demonstrando sobrecarga de métodos
        outroTreino.exibirDetalhes();
    }
}
