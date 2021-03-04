import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class demoMain 
{  
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {          
       
    	List ar = new ArrayList();
        ar.add(new demo("shaloo",1));
        ar.add(new demo("manisga",2));
        ar.add(new demo("pooja",3));
        ar.add(new demo("shri",4));
        
        Collections.sort(ar,(a,b)-> {
        	return ((demo) a).getName().compareTo(((demo) b).getName());
        });
        for(demo x:ar) {
        	System.out.println(x.getName()+" "+x.roll);
        }
    }
}