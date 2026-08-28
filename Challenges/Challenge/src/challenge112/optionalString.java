package challenge112;

import java.util.Optional;

public class optionalString {
    public static void main(String[] args) {

        System.out.println(toptional(null));
        System.out.println(toptional(""));
        System.out.println(toptional("5"));

    }

    public static Optional<String> toptional(String str){
        if(str == null || str == ""){
            return Optional.empty();
        }

        return Optional.of(str.toUpperCase());
    }
}
