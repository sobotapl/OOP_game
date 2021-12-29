public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Sobo", "Piotrek");
        Player player2 = new Player("Tiny", "Piotrek");
        Player player3 = new Player("Koko", "Piotrek");
        player1.addPoints(44);
        player2.addPoints(55);
        player3.addPoints(101);

        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        Player winner = game.winner();
        winner.getNick();

        System.out.println(winner.nameInfo());

    }
}
