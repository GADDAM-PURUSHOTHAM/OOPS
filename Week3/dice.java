/*import java.io.*;
import java.util.*;
class Rand
{
            public static void main(String ar[])
            {
                        int d=0;
                        for(int i=0;i<=100;i++)
                        {
                                    Random r=new Random();
                                    int d1=r.nextInt(6)+1;
                                    int d2=r.nextInt(6)+1;
                                    if(d1==d2)
                                      d++;
                        }
                        System.out.println("The number of times the two roll dice have same number is  "+d);
            }
}*/
import java.util.Random;
 class DiceRollSimulation {

    public static void main(String[] args) {
        int numberOfAttempts = 10;
        int successfulAttempts = 0;

        for (int i = 1; i <= numberOfAttempts; i++) {
            System.out.println("Rolling dice attempt #" + i + "...");
            
            // Delay for 10 seconds
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Roll the dice
            int dice1 = rollDie();
            int dice2 = rollDie();

            System.out.println("Result: Die 1 = " + dice1 + ", Die 2 = " + dice2);

            // Check for a successful attempt
            if (dice1 == dice2) {
                System.out.println("Successful attempt!");
                successfulAttempts++;
            }
        }

        System.out.println("\nTotal successful attempts: " + successfulAttempts);
    }

    // Method to simulate rolling a six-sided die
    private static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

