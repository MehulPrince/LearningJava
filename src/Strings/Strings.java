package Strings;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //System.out.println(name);
        /*String firstname = "mehul";
        String lastname = "prince";
        String fullname = firstname + lastname;
        System.out.println(fullname.length());

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));

        }*/
    /*String name1 = "mehul";
    String name2 = "mehul";

    if(name1.compareTo(name2) == 0){
        System.out.println("String is equal");
    }
    else{
        System.out.println("Strings are not equal");
    }*/

        String sentence = "my name is Mehul";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);

    }
}
