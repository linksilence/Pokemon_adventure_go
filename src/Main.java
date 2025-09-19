public class Main {
    public static void main(String[] args) {
        treinador ash = new treinador("Ash Ketchum");
        treinador gary = new treinador("Gary Carvalho");

        pokemon charmander = new pokemon("Charmander", tipoPoekmon.FOGO, 100, ash);
        pokemon bulbasaur = new pokemon("Bulbasaur", tipoPoekmon.GRAMA, 100, gary);

        habilidade brasa = new habilidade("Brasa", 40, tipoPoekmon.FOGO, charmander);
        habilidade folhaNavalha = new habilidade("Folha Navalha", 55, tipoPoekmon.GRAMA, bulbasaur);

        itemCura pocao = new itemCura("Poção", "Restaura 20 de vida", 20);

        batalha primeiraBatalha = new batalha(ash, gary);
        primeiraBatalha.iniciar();

        System.out.println("\n" + ash.getNome() + " envia " + charmander.getnome() + "!");
        System.out.println(gary.getNome() + " envia " + bulbasaur.getnome() + "!\n");

        int turno = 1;
        while (charmander.getVida() > 0 && bulbasaur.getVida() > 0) {
            primeiraBatalha.registrarTurno(turno);

            charmander.setAtaque(bulbasaur, brasa);

            if (bulbasaur.getVida() <= 0) {
                break;
            }

            System.out.println("---");

            bulbasaur.setAtaque(charmander, folhaNavalha);

            if (bulbasaur.getVida() <= 40) {
                System.out.println(gary.getNome() + " usa uma " + pocao.getNome() + " em " + bulbasaur.getnome() + "!");
                pocao.aplicar(bulbasaur);
            }

            System.out.println("\n------------------------------\n");
            turno++;
        }

        if (charmander.getVida() <= 0) {
            System.out.println(charmander.getnome() + " foi derrotado!");
            System.out.println("O vencedor é: " + gary.getNome() + "!");
        } else {
            System.out.println(bulbasaur.getnome() + " foi derrotado!");
            System.out.println("O vencedor é: " + ash.getNome() + "!");
        }

        primeiraBatalha.vitoria();
    }
}