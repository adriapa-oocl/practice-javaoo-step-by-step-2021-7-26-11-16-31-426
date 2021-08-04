package practice08;

import java.text.MessageFormat;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return concatIntroString();
    }

    public String concatIntroString(){
        return MessageFormat.format("{0} I am a Student. I am {1}{2}.", super.introduce(),
                ((klass.getLeader() != null)?"Leader of ":"at "), klass.getDisplayName());
    }
}
