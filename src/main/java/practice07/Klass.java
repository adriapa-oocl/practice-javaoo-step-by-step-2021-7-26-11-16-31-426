package practice07;

import java.text.MessageFormat;

public class Klass {

    private final int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return MessageFormat.format("Class {0}", number);
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }


    public Student getLeader() {
        return leader;
    }
}
