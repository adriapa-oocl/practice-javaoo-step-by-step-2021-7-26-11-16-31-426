package practice06;

import java.text.MessageFormat;

public class Student extends Person{

    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return concatIntroString();
    }

    public String concatIntroString(){
        return MessageFormat.format("{0} I am a Student. I am at {1}.",super.introduce(), klass.getDisplayName());
    }
}
