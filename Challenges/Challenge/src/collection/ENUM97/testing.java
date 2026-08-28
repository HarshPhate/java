package collection.ENUM97;

public class testing {


    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.printf("%s : %s \n" , day , day.getType());
        }
    }
}
