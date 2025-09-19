public abstract class item {

    private String nome;
    private String efeito;

    public item(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public abstract void aplicar(pokemon pokemon);

    public String getNome() {
        return nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
}