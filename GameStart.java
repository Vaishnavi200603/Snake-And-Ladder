import java.util.Scanner;

import static java.lang.System.exit;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Participants : ");
        int totalParticipants;

        while(true){
            totalParticipants = sc.nextInt();

            if(totalParticipants <= 1 || totalParticipants > 4) {
                System.out.println("Invalid number of Participants : "+totalParticipants);
                System.out.print("Again Enter Number Of Participants : ");
            }
            else {
                Players.selectPlayers(totalParticipants);
                break;
            }
        }
        System.out.println(totalParticipants + " Participants added, GAME STARTED!!!");

        boolean start = true;
        while(start){
            for(int i=1; i<=totalParticipants; i++){
                System.out.print("Enter Player " + i + " steps : ");
                int step = sc.nextInt();
                start = Dice.roll(i, step);
                if(!start){
                    exit(0);
                }
            }
            System.out.println("************************************************************");
        }
    }
}
