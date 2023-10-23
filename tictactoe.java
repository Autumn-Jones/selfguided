import java.util.Scanner;
/**
 * Objective: to create a playable game of tic tac toe
 * Autumn Remmert
 * 
 * 
 */
public class tictactoe
{
    int boardState = 0;
    int tile = 1;
    boolean playerTurn = false;
    String player1 = "";
    String player2 = "";
    String[] bState;

    public static void main(String args[]){
        tictactoe g = new tictactoe();
        g.getNames();  
        System.out.print("\n");
        g.drawBoard();
        g.beginGame();

    }
    public void getNames() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the name of player 1: ");
        player1 = in.nextLine();
        System.out.printf("Enter the name of player 2: ");
        player2 = in.nextLine();
    }

    public void drawBoard() {
        bState = new String [32];
        for(int i = 0; i < bState.length; i++){
            if(i % 6 != 0){
                if(i > 6 && i < 12 || i > 18 && i < 21) {
                    bState[i] = "-";
                } else if(i % 2 != 0) {
                    bState[i] = "|";
                } else{
                    bState[i] = Integer.toString(tile);
                    tile++;
                }
            }else {
                bState[i]="\n";
            }
            System.out.printf(bState[i]);
        }

        /*
        if(boardState == 0){
        System.out.println("   1|2|3");
        System.out.println("   -----");
        System.out.println("   4|5|6");
        System.out.println("   -----");
        System.out.println("   7|8|9\n");
        }
        if(boardState == 1){

        }
         */
    }

    public void beginGame() {
        double rand = (Math.random() * 10.0);
        if (rand >= 5){
            playerTurn = true;
            System.out.printf("It is %s's turn", player1);
        } else {
            System.out.printf("It is %s's turn", player2 );
        }
    }

}
