import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class pokemon {
    private String nome;
    private List<tipoPoekmon>tipo = new ArrayList<>();
    private int vida;
    private treinador treinador;

    public pokemon(String nome,tipoPoekmon tipo, int vida, treinador treinador)
    {
        this.tipo.add(tipo);
        this.nome=nome;
        this.vida=vida;
        this.treinador=treinador;
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

    public void setAtaque(pokemon alvo, habilidade habilidade) {
        Random rand = new Random();

        System.out.println(this.getnome() + " usou " + habilidade.getNome() + "!");

        double stabBonus = 1.0;
        if (this.tipo.contains(habilidade.getTipo())) {
            stabBonus = 1.5;
            System.out.println("É um ataque do mesmo tipo! Bônus de 1.5x!");
        }

        double multiplicadorTipo = 1.0;
        tipoPoekmon tipoAtaque = habilidade.getTipo();

        if (tipoAtaque.toString().equalsIgnoreCase("FOGO") && alvo.tipo.stream().anyMatch(t -> t.toString().equalsIgnoreCase("GRAMA"))) {
            multiplicadorTipo = 2.0;
            System.out.println("É super efetivo!");
        } else if (tipoAtaque.toString().equalsIgnoreCase("AGUA") && alvo.tipo.stream().anyMatch(t -> t.toString().equalsIgnoreCase("FOGO"))) {
            multiplicadorTipo = 2.0;
            System.out.println("É super efetivo!");
        } else if (tipoAtaque.toString().equalsIgnoreCase("GRAMA") && alvo.tipo.stream().anyMatch(t -> t.toString().equalsIgnoreCase("AGUA"))) {
            multiplicadorTipo = 2.0;
            System.out.println("É super efetivo!");
        }

        if (tipoAtaque.toString().equalsIgnoreCase("FOGO") && alvo.tipo.stream().anyMatch(t -> t.toString().equalsIgnoreCase("AGUA"))) {
            multiplicadorTipo = 0.5;
            System.out.println("Não é muito efetivo...");
        }

        int dano = (int) (habilidade.usar() * stabBonus * multiplicadorTipo);
        if (dano <= 0) {
            dano = 1;
        }

        alvo.vida -= dano;
        if (alvo.vida < 0) {
            alvo.vida = 0;
        }

        System.out.println(alvo.getnome() + " recebeu " + dano + " de dano!");
        System.out.println("Vida restante de " + alvo.getnome() + ": " + alvo.getVida());
    }




}
