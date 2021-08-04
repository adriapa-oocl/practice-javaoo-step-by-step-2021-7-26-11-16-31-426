package practice05;

import java.text.MessageFormat;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
    }
}
