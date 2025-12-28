package Ex12_PetBathSystemController;

import java.util.Scanner;

public class Ex12_PetBathSystemController {
    var scanner = new Scanner(System.in);
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
    }while (option != 0)


}
