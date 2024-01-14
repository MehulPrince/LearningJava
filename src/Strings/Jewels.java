package Strings;
import java.util.*;

public class Jewels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Jewels");
        String jewels = sc.nextLine();
        System.out.println("Enter Stones");
        String stones = sc.nextLine();
        char[] arr1 = new char[jewels.length()];
        for (int i = 0; i < jewels.length(); i++) {
            arr1[i] = jewels.charAt(i);
        }
        char[] arr2 = new char[jewels.length()];
        for (int i = 0; i < jewels.length(); i++) {
            arr2[i] = jewels.charAt(i);

        }
        Boolean equal=false;
        int counter = 0;
        for(int i=0;i<arr1.length;++i)
        {
            if(arr2[i]==arr1[i])
            {
                equal=true;
                counter += 1;
            }else{
                counter = 0;
                break;
            }
        }
        System.out.println(counter);
        
    }
}
