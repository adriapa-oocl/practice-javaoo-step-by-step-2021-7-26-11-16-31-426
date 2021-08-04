package practice06;

import java.text.MessageFormat;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass != null)
            return MessageFormat.format("{0} I teach Class {1}.", concatIntroString(), klass.getNumber());
        else
            return MessageFormat.format("{0} I teach No Class.", concatIntroString());
    }

    public String concatIntroString(){
        return super.introduce() + " I am a Teacher.";
    }

    public String introduceWith(Student student) {
        return MessageFormat.format("{0} I am a Teacher. I {1}{2}.", super.introduce(),((student.getKlass().getNumber()==klass.getNumber())?"teach ":"don't teach "),
                student.getName());
    }
}
