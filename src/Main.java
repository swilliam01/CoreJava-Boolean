import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean redEyes;
        String userRes = "";
        String input = "";

        do {
            redEyes = false;
            System.out.println("Are your eyes red?");
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("y")) {
                redEyes = true;
            }

            if (redEyes){
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great");
            }

            System.out.println("Do you want to try again?");
            userRes = keyboard.nextLine();
//            if (!userRes.equalsIgnoreCase("y")){
//                break;
//            }
        }while(!userRes.equalsIgnoreCase("n"));
    }
}
