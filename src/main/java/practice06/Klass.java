package practice06;

import java.text.MessageFormat;

public class Klass {

    private final int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return MessageFormat.format("Class {0}", number);
    }
}
