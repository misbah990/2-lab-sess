package lab2;

public class Framedecorator extends PictureDecorator {

		   public Framedecorator(Picture decoratedPicture) {
		      super(decoratedPicture);		
		   }

		   @Override
		   public void draw() {
			   decoratedPicture.draw();	       
		      setframe(decoratedPicture);
		   }

		   private void setframe(Picture decoratedPicture){

			   FrameBuilder framebuilder = new FrameBuilder();

			   Addf picframe = framebuilder.prepareframe();
			      System.out.println("Frames ..... ");
			      picframe.showItems();
			     
			   
		   }
}
