package practice09;

import java.text.MessageFormat;

public class Person {
    private final String name;
    private final int age;
    private final int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Person){
            return ((Person) object).getId() == this.getId();
        }
        return false;
    }

    public String introduce() {
        return MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
    }
}
