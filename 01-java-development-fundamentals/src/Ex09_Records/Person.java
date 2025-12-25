package Ex09_Records;

public record Person(String name, int age) {


    public Person {

    }

    public Person(String name) {

        this(name, 1);
    }

}
