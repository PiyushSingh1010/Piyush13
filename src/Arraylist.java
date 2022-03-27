import java.util.*;
import java.util.List;

class GFG {
public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>(Arrays.asList("GLA",  "WELCOME",  "IN" , "GLA" ,"MATHURA"));

   //     al.add("GLA");
    //    al.add("Welcome");
    //    al.add("in");
    //    al.add("GLA");
    //    al.add("Mathura");
        System.out.println("Initial List: " + al);
        al.removeAll(Collections.singleton("GLA"));
        for (String str:al)
          //  System.out.println("Initial List: " + al);
            {}
        System.out.println(al);

    }
}


