package Ex08_Class;

import java.time.OffsetDateTime;

public class Person {

    //Class attributes

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    //Constructor

    public Person(String name){

    this.name = name;
    this.age = 1;

    }

    //Getters & Setters

    public String getName(){
        return this.name;
    }

    /*
    public void setName( String name ){
        this.name = name;
    }
    */

    public int getAge() {
        return this.age;
    }

    /*
    public void setAge( int age ) {
        this.age = age;
    }
    */

    public void incAge(){

        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age +=1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();

    }
}
