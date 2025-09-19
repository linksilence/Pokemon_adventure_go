import java.util.List;

public class pokemon {
    private String nome;
    private List<tipoPoekmon>tipo;
    private int vida;
    private treinador treinador;

    public pokemon(String nome,tipoPoekmon tipo, int vida, treinador treinador)
    {
        this.tipo.add(tipo);
        this.nome=nome;
        this.vida=vida;
        this.treinador=treinador;
    }
    public void setAtaque(pokemon poke)
    {
        poke.vida=
    }
    public void setTipo(tipoPoekmon algum) {
        this.tipo.add(algum);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida){
        this.vida=vida;
    }
    public void setTreinador(treinador treinador)
    {
        this.treinador=treinador;
    }

    public String getnome()
    {
        return nome;
    }
    public int getVida()
    {
        return vida;
    }
    public treinador getTreinador()
    {
        return treinador;
    }

}
