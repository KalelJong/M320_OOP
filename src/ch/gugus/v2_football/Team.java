package ch.gugus.v2_football;

import java.util.ArrayList;

public class Team {
    ArrayList<Player> PlayerList;

    public Team(ArrayList<Player> playerList) {
        PlayerList = playerList;
    }

    public ArrayList<Player> getPlayerList() {
        return PlayerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        PlayerList = playerList;
    }
}
