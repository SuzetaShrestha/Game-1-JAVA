import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args){
        Random rn=new Random();
        int value=rn.nextInt(10);
        value++;
        Scanner sn=new Scanner(System.in);
        int count=5;
        System.out.println("Guess the number:");
         int n=sn.nextInt();
         while(count!=0){
            if(n==value){
                System.out.println("Correct answer");
                break;
            }
            else if(n>value){
                System.out.println("Hint:Smaller");
                n=sn.nextInt();
            }
            else {
                System.out.println("Hint:Greater");
                n=sn.nextInt();
            }
            count--;

         }
         if(count==0){
            System.out.println("Game Over");
         }


    }
}