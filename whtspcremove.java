import java.io.*;
import java.util.*;
class whtspcremove
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String str2 = str.replaceAll("\\s","");
        System.out.println(str2);
    }
}