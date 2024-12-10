import java.util.*;
public class Mostfrequentchar
{
    public static void main(String[] args)
    {
        String a="UDAYANIEEE";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
        int max=0;
        for(int i=0;i<26;i++)
        {
            if(c[i]>max)
            {
            max=c[i];
            }
        }
        System.out.println("the most frequent value= "+max);
    }
}