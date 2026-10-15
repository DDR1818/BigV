import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String pet = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("You must provide the supreme leader your favorite color.");
        String color = scan.nextLine().toLowerCase();
        if (!color.equals("blue") && !color.equals("red") && !color.equals("green")){
            System.out.println("You have failed to provide a real color try again.");
            return;
        } else {
            System.out.println("Thank you for your contribution.");
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.println("You must provide the supreme leader your favorite season.");
        String season = scan2.nextLine().toLowerCase();
        if (!season.equals("fall") && !season.equals("winter") && !season.equals("summer") && !season.equals("spring")){
            System.out.println("You have failed to provide a real season try again.");
            return;
        } else {
            System.out.println("Thank you for your contribution.");
        }

        Scanner scan3 = new Scanner(System.in);
        System.out.println("You must now provide the supreme leader you first name");
        String name = scan3.nextLine().toLowerCase();
        if ("aeiou".indexOf(name.substring(0,1))==-1 && color.equals("green") && season.equals("winter")){
            pet = "giraffe";
            System.out.println(pet);
        }
    }
}
