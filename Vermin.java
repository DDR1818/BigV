import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You must provide the supreme leader your favorite color.");
        String color = scan.nextLine().toLowerCase();
        if (!color.equals("blue")) || (!color.equals("red")) || (!color.equals("green")){
            System.out.println("You have failed to provide a real color try again.")
            return;
        }
    }
}
