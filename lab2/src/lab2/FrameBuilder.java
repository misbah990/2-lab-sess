package lab2;

public class FrameBuilder {
	 public Addf prepareframe (){
		 Addf addf = new Addf();
	      addf.addItem(new topf());
	      addf.addItem(new bottomf());
	      addf.addItem(new leftf());
	      addf.addItem(new rightf());
	      return addf;
	   }   
}
