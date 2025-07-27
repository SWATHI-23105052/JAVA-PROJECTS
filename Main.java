//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        int score=0, round=0, lives=5;
        int system, userinput;
        do{
            system=random.nextInt(1,6);
            System.out.println("Input a Number:");
            userinput=sc.nextInt();
            if(system==userinput){
                score+=10;
            }
            else{
                lives--;
            }
            for(int i=0;i<lives;i++){
                System.out.print("♡ ");
            }
            System.out.println();
        }
        while(lives>0);
        System.out.println("Your Score: "+score);
    }
}