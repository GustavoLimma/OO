// Classe concreta C5 herdando de C2 e implementando a interface I1
class C5 extends C2 implements I1 {
    private int repeticoes;

    public C5(String nome, int nivel, int repeticoes) {
        super(nome, nivel);
        this.repeticoes = repeticoes;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Repetições: " + repeticoes);
    }

    @Override
    public void cardio() {
        System.out.println("Correndo...");
    }
}