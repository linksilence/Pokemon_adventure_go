public class batalha {

    private treinador treinador1;
    private treinador treinador2;

    public batalha(treinador treinador1, treinador treinador2) {
        this.treinador1 = treinador1;
        this.treinador2 = treinador2;
    }

    public void iniciar() {
        System.out.println("A Batalha Pokémon começou entre " + treinador1.getNome() + " e " + treinador2.getNome() + "!");
    }

    public void registrarTurno(int numeroDoTurno) {
        System.out.println("--- Turno " + numeroDoTurno + " ---");
    }

    public void vitoria() {
        // A lógica para determinar o vencedor pode ser adicionada aqui.
        // Por exemplo: verificar qual treinador tem Pokémons restantes.
        System.out.println("Fim da batalha!");
    }

    public treinador getTreinador1() {
        return treinador1;
    }

    public treinador getTreinador2() {
        return treinador2;
    }
}