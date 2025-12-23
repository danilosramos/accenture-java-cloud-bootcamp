void main() {

    Scanner scanner = new Scanner(System.in);
    IO.print("What's your name: ");
    String name = scanner.nextLine();

    LocalDate birthDate = null;

    while (birthDate == null) {
        IO.print("What's your date of birth (mm/dd/yyyy): ");
        String birthday = scanner.nextLine();
        String[] parts = birthday.split("/");

        if (parts.length != 3) {
            IO.println("Invalid format! Please use mm/dd/yyyy.");
            continue;
        }

        try {
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (month < 1 || month > 12) {
                IO.println("Invalid month! Must be between 1 and 12.");
                continue;
            }

            birthDate = LocalDate.of(year, month, day);

        } catch (Exception e) {
            IO.println("Invalid date! Please enter a valid date.");
        }
    }

    LocalDate today = LocalDate.now();
    Period age = Period.between(birthDate, today);

    IO.println("Hello " + name + ", you are " + age.getYears() + " years old.");

}
