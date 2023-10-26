package org.example;

import java.util.*;

public class Players {
    public static Map<Integer, Integer> mp = new LinkedHashMap<>();
    public static void selectPlayers(int totalPlayers){
        for(int i=1; i<=totalPlayers; i++){
            Players.mp.put(i, 0);
        }
    }

    public static int returnPlayers(int playerKey){
        return mp.get(playerKey);
    }

    public static int move(int player, int steps) {
        Players.mp.put(player,steps);
        System.out.println("Successfully Player " + player + " Move Ahead: " +
                " , Current Position : " + steps);
        return Players.mp.get(player);
    }
}
