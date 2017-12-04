
package lab2;
import java.util.ArrayList;
import java.util.List;

public class Addf {
	 private List<type> types = new ArrayList<type>();	

	   public void addItem(type type){
	      types.add(type);
	   }

	  

	   public void showItems(){
	   
	      for (type type : types) {
	         System.out.print(" " + type.fname());
	         
	      }		
	   }	
}
