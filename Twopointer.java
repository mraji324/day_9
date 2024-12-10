import java.util.*;
public class Twopointer
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String ans="";
        int n=a.length();
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int temp=a.charAt(l);
            a.charAt(l)=a.charAt(h);
            a.charAt(h)=temp;
            l++;
            h--;
        }
        System.out.println(a);
    }
}