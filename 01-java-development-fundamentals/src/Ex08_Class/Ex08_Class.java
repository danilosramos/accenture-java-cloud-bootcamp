package Ex08_Class;

public class Ex08_Class {

    static void main() {

        var male = new Person("João");
        male.incAge();
        var female = new Person("Scarlett");
        female.incAge();
        System.out.println("Male name: " + male.getName() + "\nMale age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + "\nFemale age: " + female.getAge() );

    }

}
