// Classe concreta C4 herdando de C2
class C4 extends C2 {
    private String equipamento;

    public C4(String nome, int nivel, String equipamento) {
        super(nome, nivel);
        this.equipamento = equipamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Equipamento: " + equipamento);
    }
}