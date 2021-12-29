public class Game {

    private final static int MAX_NUMBER_OFF_PLAYER = 10;
    private int actPlayersNumber = 0;
    private Player[] players = new Player[MAX_NUMBER_OFF_PLAYER];

    public void addPlayer(Player player){
        if(actPlayersNumber == MAX_NUMBER_OFF_PLAYER){
            System.out.println("There is no space for new Player, try again later.");
            return;
        }
        players[actPlayersNumber++] = player;
    }
    public Player winner(){
        Player winner = players[0];
        for (int i = 0; i < actPlayersNumber; i++) {
            if(players[i].getPoints() > winner.getPoints()){
                winner = players[i];
            }

        }
        if(winner.getPoints() > 100){
            return winner;
        }
        return null;
    }



}
