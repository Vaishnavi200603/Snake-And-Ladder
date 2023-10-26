package org.example;

import java.util.Scanner;

public class Dice {
    public static boolean roll(int player, int diceInput){
        boolean ans = true;
        if(diceInput >=1 && diceInput<=6){
            if(diceInput == 1 || diceInput == 6) {
                if (Players.returnPlayers(player) == 0) {
                    System.out.println("CONGRATULATION player " + player + " start the game");
                    System.out.print("ROLL AGAIN : ");
                    diceInput = new Scanner(System.in).nextInt();
                    ans = notZero(player,diceInput);
                }
                else{
                    ans = notZero(player,diceInput);
                }
            }
            else if(Players.returnPlayers(player) != 0){
                ans = notZero(player,diceInput);
            }
            else{
                if(Players.returnPlayers(player) == 0){
                    System.out.println("TRY IN YOUR NEXT CHANCE");
                    //return true;
                }
            }

        }
        else{
            System.out.println("Number Should Be Between 1 to 6 Only. ROLL AGAIN");
            diceInput = new Scanner(System.in).nextInt();
            roll(player, diceInput);
        }
        if(!ans){
            return false;
        }
        return true;
    }

    public static boolean notZero(int player, int diceInput){
        int position  = 0;
        if(diceInput >=1 && diceInput <= 6) {
            if (Players.returnPlayers(player) == 0) {
                position = Players.move(player, diceInput);
            }
            else if (Players.returnPlayers(player) > 94) {
                if(diceInput + Players.returnPlayers(player) <= 100){
                    position = Players.move(player, Players.returnPlayers(player)+diceInput);
                }
            }
            else{
                position = Players.move(player, Players.returnPlayers(player)+diceInput);
            }

            if (Snake.snakeBite(position) != null) {
                System.out.println("Player " + player + " Bitten From The Snake");
                Players.move(player, Snake.snakeBite(position));
            }

            if (Ladder.climbLadder(position) != null) {
                System.out.println("Player " + player + " Climb The Ladder");
                Players.move(player, Ladder.climbLadder(position));
            }
            if (position == 100) {
                System.out.println("Player " + player + " win the game");
                return false;
            }
            return true;
        }
        return false;
    }
}
