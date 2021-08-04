package practice02;

import java.text.MessageFormat;

public class Student extends Person{

    private final int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return MessageFormat.format("I am a Student. I am at Class {0}.", klass);
    }
}