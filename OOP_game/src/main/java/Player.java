public class Player {

    private String nick;
    private String name;
    private int points;

    public Player(String nick, String name) {
        this.nick = nick;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints (int val){
        points += val;
    }

    public String nameInfo (){
        return String.format("name: %s nick: %s", name, nick);
    }
}
