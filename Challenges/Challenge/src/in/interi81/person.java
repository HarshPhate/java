package in.interi81;

import java.util.Objects;

public class person {

    private int age;
    private String name;

    public person(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
