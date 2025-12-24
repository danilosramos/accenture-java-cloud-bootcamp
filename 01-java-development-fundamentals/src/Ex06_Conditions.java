void main() {

    var scanner = new Scanner(System.in);
    System.out.println("What's your name?");
    var name = scanner.next();
    System.out.println("What's your age?");
    var age = scanner.nextInt();

    var canDrive = (age >= 18);
    var message = canDrive ?
            name + ", you are allowed to drive \n" :
            name + ", you are not allowed to drive \n";

    System.out.println("Type a number between 1 and 3: ");
    var option = scanner.nextInt();
    var message2 = switch (option) {

        case 1, 3 -> {
            var day = option == 1 ? "Small" : "Big";
            yield String.format("Congratulations, you guess the wrong number", day);
        }

        case 2 -> "You Won!!!";

        default -> "Invalid number";

    };

    IO.println(message2);

    int sum = 0;
    while (true) {
        System.out.println("Type a number?");
        int number = scanner.nextInt();

        if (number == -1) {
            break;
        }

        sum += number;

    }

    System.out.println("Sum: " + sum);


}
