import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main (String[] args){
//        whileExample(3);
//        forloopExample();
//        forloopContinue();
//        forloopBreak();
//        doWhileloop(5);
//        randomNumGenerator();
//        codechallenge4 ();
        guessingGame();
    }
    public static void whileExample (int max){
        int i = 0;
        while(i<max){
            i++;
            System.out.println(i);
        }
    }
    public static void forloopExample(){
        for(int i = 0; i<=5; i++){
            System.out.println(i);
        }

    }
    public static void forloopContinue(){
        for(int i = 1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void forloopBreak(){
        for(int i = 1; i<=5; i++){
            if(i == 3){
                break;
            }
           System.out.println(i);
        }
    }
    public static void doWhileloop (int min){
        int i = 0;
        do{
            i++;
            System.out.println(i);
        }while( i<min);


    }

    public static void randomNumGenerator (){
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        int num = ThreadLocalRandom.current().nextInt(1, 7); // generates a random number between 1 and 6
        do {
            System.out.println("you rolled a " + num);
            System.out.print("Would you like to roll again? y/n? ");
            userChoice = scanner.next();
        }while(userChoice.equals("yes"));
    }

    public static void codechallenge4 (){
//        for(int i = 89 ; i<118; i++){
//            System.out.println(i);
//        }

//        for( int i = 1 ; i<41 ; i++){
//            if( i % 3 == 0){
//                System.out.println( i + "Quack");
//            }else{
//                System.out.println(i);
//            }
//        }
//        String password = "shark50";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Guess the password: ");
//        String userGuess = scanner.next();
//
//        while(!userGuess.equals(password)){
//            System.out.print("Guess the password: ");
//            userGuess = scanner.next();
//        }
//        for(int i = 0; i<11; i++){
//            System.out.println(i);
//        }




    }

    public static void guessingGame () {
        int num = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println(num);
        int userGuess;
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.print("Guess a number between 1 and 100: ");


            do {
                counter ++;
                 userGuess = scanner.nextInt();
                if (userGuess > num) {
                    System.out.print("LOWER: ");
//
                } else if (userGuess < num) {
                    System.out.print("HIGHER: ");
//                    userGuess = scanner.nextInt();
                } else {
                    System.out.println("CORRECT! You gussed " + counter + " times.");
                    break;
                }
            }
        while(userGuess!= num);

        }

    }


