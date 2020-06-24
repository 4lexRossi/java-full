package one.digitalinnovation.finals;

public class Programa {
    public static void main(String[] args) {
        final HardCoreGamer hardCoreGamer = new HardCoreGamer();
        final Gamer gamer = new Gamer();
        final CasualGamer casualGamer = new CasualGamer();
        final var game = "PUBG";

        System.out.println(casualGamer.play(game));
    }
}
