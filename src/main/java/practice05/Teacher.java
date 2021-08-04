package practice05;

import java.text.MessageFormat;

public class Teacher extends Person{

    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age){
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass != null)
            return MessageFormat.format(concatIntroString()+" I teach Class {0}.", klass);
        else
            return concatIntroString()+" I teach No Class.";
    }

    public String concatIntroString(){
        return super.introduce()+" I am a Teacher.";
    }
}
