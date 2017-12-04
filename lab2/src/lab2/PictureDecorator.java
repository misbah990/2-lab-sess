package lab2;

public abstract class PictureDecorator implements Picture {
		   protected Picture decoratedPicture;

		   public PictureDecorator(Picture decoratedPicture){
		      this.decoratedPicture = decoratedPicture;
		   }

		   public void draw(){
			   decoratedPicture.draw();
		   }	
}
