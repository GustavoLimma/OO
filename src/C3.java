// Classe C3 herdando de C1 e implementando as interfaces I1 e I2
class C3 extends C1 implements I1, I2 {
    private int duracao;

    public C3(String nome, int duracao) {
        super(nome);
        this.duracao = duracao;
    }

    public C3(String nome) {
        super(nome);
        this.duracao = 30;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Duração: " + duracao + " minutos");
    }

    public void exibirDetalhes(String extraInfo) {
        System.out.println("Nome: " + nome + ", Duração: " + duracao + " minutos. Info adicional: " + extraInfo);
    }

    @Override
    public void cardio() {
        System.out.println("Caminhando...");
    }

    @Override
    public void bulking() {
        System.out.println("max bulking, + 10kg!");
    }

    @Override
    public void cutting() {
        System.out.println("max cutting, -10kg");
    }

    public void cardio(String intensidade) {
        System.out.println("Caminhando com intensidade: " + intensidade);
    }
}