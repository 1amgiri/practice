import java.util.*;
public class Revstring{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Text: ");
       String str=sc.nextLine();
       String strrev="";
       for(int i=str.length()-1;i>=0;i--){
        strrev+=str.charAt(i);
       }
       System.out.println(strrev);
    }
}