public class itemCura extends item {

    private int quantidadeCura;

    public itemCura(String nome, String efeito, int quantidadeCura) {
        super(nome, efeito);
        this.quantidadeCura = quantidadeCura;
    }

    @Override
    public void aplicar(pokemon pokemon) {
        int novaVida = pokemon.getVida() + this.quantidadeCura;
        pokemon.setVida(novaVida);
    }

    public int getQuantidadeCura() {
        return quantidadeCura;
    }

    public void setQuantidadeCura(int quantidadeCura) {
        this.quantidadeCura = quantidadeCura;
    }
}