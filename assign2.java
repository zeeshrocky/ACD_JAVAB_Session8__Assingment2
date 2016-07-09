import java.util.*;
public class example {

	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		  HashSet hs = new HashSet();
	      // add elements to the hash set
	      hs.add("Me");
	      hs.add("11");
	      hs.add("11");
	      hs.add("4.66");
	      hs.add("Victory");
	      hs.add("FLoat");
	      
	      
	      Iterator it = hs.iterator();
	      System.out.println("\n Hashset elements are: \n");
	      while(it.hasNext())
	      {
	    	  
	    	  System.out.println(" "+it.next());
	      }
	      

	}

}