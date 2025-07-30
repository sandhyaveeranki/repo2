  import java.util.*;
  public class Bytestuffing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        String str=sc.nextLine();
        String ans="F";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='F')
            ans=ans+"EF";
            else if(str.charAt(i)=='E')
            ans=ans+"EE";
            else
            ans=ans+str.charAt(i);
        }
        ans=ans+'F';
        System.out.println(ans);
    }
}
