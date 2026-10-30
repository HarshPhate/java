package in.my.collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        //<> this is also called generics key to define data type
        //<> this generics type only exist for compile time ,and this is only for developer help ,after compiletion this keys are deleted and only give normal array
        // <> ye bass isliiye hai ki complie time pe koi error na aaie
     List<String> Strlist = new ArrayList<>();      //<String> this is a type of list this <> bracket we can declare type for specific type of data
     Strlist.add("Harsh");                           //and second time i only declare <> this simple bracket becase this already understand this is also string
     Strlist.add("roni");
     Strlist.add(1,"nayan");
//     Strlist.add(54);                    //icant store integer because i fieslty declare a string datatype

//        System.out.println(Strlist.get(0));
Strlist.remove(0);
Strlist.set(0,"Harsh");
//Strlist.clear();

if(Strlist.contains("Harsh")){
    System.out.println("turee");
    System.out.println(Strlist.indexOf("Harsh"));
}
        for (int i = 0; i < Strlist.size(); i++) {
            System.out.println(Strlist.get(i));

        }


        //we can also use for each loop
        for(String str : Strlist){
            System.out.println(str);
        }
    }
}
