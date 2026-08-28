package in.interi81;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class test {


    public static void main(String[] args) {

    person per1 = new person("harsh", 19);
    person per2 = new person("harsh", 19);

    if(per1.equals(per2)){
        System.out.println("equal");
    }else{
        System.out.println("Not equal");
    }
    }



}
