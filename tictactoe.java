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
    int c = 0;
    int t = 0;
    boolean won = false;
    String player1 = "";
    String player2 = "";
    String[] bState = new String [10];

    public static void main(String args[]){
        tictactoe g = new tictactoe();
        g.getNames();
        g.init();
        g.drawBoard();
        g.beginGame();
        g.turn();

    }

    public void getNames() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the name of player x: ");
        player1 = in.nextLine();
        System.out.printf("Enter the name of player o: ");
        player2 = in.nextLine();
        
    }
    
    public void init(){
        for(int i = 1; i < bState.length; i++){
            bState[i-1] = Integer.toString(i);
        }
    }

    public void drawBoard() {
        System.out.printf("\n");
        System.out.printf("   %s|%s|%s\n", bState[0], bState[1], bState[2]);
        System.out.printf("   -----\n");
        System.out.printf("   %s|%s|%s\n", bState[3], bState[4], bState[5]);
        System.out.printf("   -----\n");
        System.out.printf("   %s|%s|%s\n", bState[6], bState[7], bState[8]);
    }

    public void beginGame() {
        double rand = (Math.random() * 10.0);
        if (rand >= 5){
            System.out.printf("\nIt is %s's turn\n", player1);
            t = 1;
        } else {
            System.out.printf("\nIt is %s's turn\n", player2);
            t = 2;
        }
    }

    public void turn(){
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.printf("Please input the number you wish to play\n");
            try {
                choice = Integer.parseInt(in.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("Please input a number");
            }

            if (choice < 9 || choice > 1){
                if (t == 1){
                    
                } else {
                    
                }
            } else{
                System.out.print("Please pick a number between 1 and 9");
            }
        }while(won == false);

    }

}
