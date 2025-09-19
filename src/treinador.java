import java.util.ArrayList;
import java.util.List;

public class treinador {

    private String nome;
    private List<pokemon> pokemonList;

    public treinador(String nome) {
        this.nome = nome;
        this.pokemonList = new ArrayList<>();
    }

    public void capturar(pokemon pokemon) {
        this.pokemonList.add(pokemon);
        pokemon.setTreinador(this);
    }

    public void dado() {

    }

    public String getNome() {
        return nome;
    }

    public List<pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}