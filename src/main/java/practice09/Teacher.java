package practice09;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private LinkedList<Klass> klass = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klass = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass != null)
//            return MessageFormat.format("{0} I teach Class {1}.", concatIntroString(), );
            return klass.stream().map(klass -> klass.getNumber().toString()).collect(Collectors.joining(", ")))
        else
            return MessageFormat.format("{0} I teach No Class.", concatIntroString());
    }

    public String concatIntroString(){
        return super.introduce() + " I am a Teacher.";
    }

//    public String introduceWith(Student student) {
//        return MessageFormat.format("{0} I am a Teacher. I {1}{2}.", super.introduce(),((student.getKlass().getNumber()==klass.getNumber())?"teach ":"don't teach "),
//                student.getName());
//    }

    public LinkedList<Klass> getClasses() {
        return klass;
    }
}
