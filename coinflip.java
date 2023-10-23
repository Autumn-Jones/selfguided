import java.util.*;
/**
 * Write a description of class coinflip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class coinflip
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in = "";
        String ans = "";
        double num = 0;
        int done = 0;
        int correct = 0;
        
        System.out.printf("Welcome!\nHeads or Tails?\n");
        do {
            in = sc.nextLine().toLowerCase();
            if (in.indexOf('h') != -1 && in.indexOf('t') != -1){
                System.out.print("Please input h for heads or t for tails\n");
                done = 0;
            } else if (in.indexOf('h') != -1){
                in = "h";
                done = 1;
            } else if(in.indexOf('t') != -1){
                in = "t";
                done = 1;
            } else if(in.matches(".*\\d.*")){
                System.out.print("Please do not input numbers\n");
                done = 0;
            } else {
                System.out.print("There was an input error\n");
                done = 0;
            }
        } while (done == 0);
        num = Math.random()*2;
        num = (int) num;
        if(num == 0){
            ans = "tails";
        } else {
            ans = "heads";
        }
        if ((num == 0 && in.equals("t"))||(num == 1 && in.equals("h"))){
            System.out.print("Correct!\n");
        } else {
            System.out.print("Incorrect!\n");
        }
        System.out.printf("It was %s", ans);
    }
}
