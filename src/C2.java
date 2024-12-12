// Classe C2 herdando de C1
class C2 extends C1 {
    protected int nivel;

    public C2(String nome, int nivel) {
        super(nome);
        this.nivel = nivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Nível: " + nivel);
    }
}