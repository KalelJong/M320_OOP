package ch.gugus.v2_football;

import java.util.ArrayList;

public class Team {
    ArrayList<Player> playerList;

    public Team(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public void play(){
        for (Player player:
                playerList) {
            System.out.println(player.getName() + " | Season data: " + player.getRoleSeasonData());
        }
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

}
