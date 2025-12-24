void main() {

    var scanner = new Scanner(System.in);
    IO.println("What's your weight?");
    float weight = scanner.nextFloat();
    IO.println("What's your Height?");
    float height = scanner.nextFloat();

    float bmi = weight / (height * height);

    if (bmi <= 18.5) {
        IO.println("Underweight");
    } else if (bmi <= 24.9) {
        IO.println("Normal");
    } else if (bmi <= 29.9) {
        IO.println("Overweight");
    } else if (bmi <= 34.9) {
        IO.println("Obese");
    } else {
        IO.println("Extremely Obese");
    }

    scanner.close();

}
