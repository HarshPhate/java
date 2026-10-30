package in.my.collections;

import java.util.Collection;

public class Utilitu {
    public static <E> void print(Collection<E> collection) {
        System.out.print("Collection is :");
        for (E coll : collection) {
            System.out.printf("%s ", coll);
        }
        System.out.println();

    }
}
