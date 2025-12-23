private final static String WELCOME_MESSAGE = "Hello, type your name:";

void main() {

    //comment

    Scanner scanner = new Scanner(System.in);
    IO.println(WELCOME_MESSAGE);
    String name = scanner.next();
    IO.println("Type your age: ");
    int age = scanner.nextInt();
    IO.println("Hello " + name + " your age is " + age);
    System.out.printf("Hello %s your age is %s \n", name, age);

        /*
        envelope
        comment
        */

}
