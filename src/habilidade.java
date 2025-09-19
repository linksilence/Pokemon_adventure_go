public class habilidade {
    // Atributos
    private String nome;
    private int poder;
    private tipoPoekmon tipo;
    private pokemon pokem;

    public habilidade(String nome, int poder, tipoPoekmon tipo, pokemon pokem) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
        this.pokem = pokem;
    }

    public int usar() {
        return poder;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setTipo(tipoPoekmon tipo) {
        this.tipo = tipo;
    }

    public void setPokemon(pokemon pokem) {
        this.pokem = pokem;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public tipoPoekmon getTipo() {
        return tipo;
    }

    public pokemon getPokemon() {
        return pokem;
    }
}

