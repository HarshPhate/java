package in.my.Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Harsh","123", 19);
        Person person2 = new Person("Harsh","123", 19);

//        if(person1 == person2)     //== only check references
            if(person1.equals(person2)){
            System.out.println("equals");
        }else{
            System.out.println("Not equals");
        }

    }
}
