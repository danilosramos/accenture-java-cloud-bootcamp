void main() {

    var scanner = new Scanner(System.in);
    System.out.printf("Type your first number: \n");
    int var1 = scanner.nextInt();
    System.out.printf("Type your second number: \n");
    int var2 = scanner.nextInt();
    int sum = var1 + var2;
    boolean isEven = sum % 2 == 0;
    System.out.printf("Your sum number is Even? %s (%s)", sum, isEven);


}
