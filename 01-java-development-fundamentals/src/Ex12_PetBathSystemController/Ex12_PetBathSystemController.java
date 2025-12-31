package Ex12_PetBathSystemController;

import java.util.Scanner;


public class Ex12_PetBathSystemController {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    static void main() {


        var option = -1;

        do{
            System.out.println("---Choose one of the options---");
            System.out.println("1. Pet Bath");
            System.out.println("2. Fill With Water");
            System.out.println("3. Fill With Shampoo");
            System.out.println("4. Verify Water Level");
            System.out.println("5. Verify Shampoo Level");
            System.out.println("6. Check for Pet");
            System.out.println("7. Place Pet in Machine");
            System.out.println("8. Remove Pet");
            System.out.println("9. Clean Machine");
            System.out.println("0. Leave");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid option.");
            }

        }while (true);
    }



    private static void setWater(){
        petMachine.addWater();
    }

    private static void setShampoo(){
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("In the moment the machine has " + amount + " liter(s) of water");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("In the moment the machine has " + amount + " liter(s) of shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet? "There is a Pet in the machine" : "There is not a Pet in the machine");
    }

    public static void setPetInMachine(){
        String name = "";
        while (name.isEmpty()) {
            System.out.println("Type the Pet's name: ");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("The Pet " + pet.getName() + " it is in the machine.");
    }


}
