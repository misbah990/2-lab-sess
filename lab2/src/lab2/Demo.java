package lab2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Picture pic = new PictureView();

		Picture framepic = new Framedecorator(new PictureView());

	     
	      System.out.println("Simple Picture ");
	      pic.draw();

	      System.out.println("\nPicture with Frame");
	      framepic.draw();
  
		
	}

}
