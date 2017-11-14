import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class Jugador  extends Entidad{

	private BufferedImage spriteSheet;
	private final int ancho =40;//ancho de imagen
	private final int altura = 50;
	private final int  filaDeImagen = 3;
	private final int margenVertical = 0;
	private final int margenHorizontal = 0;

	
	private int estadoFila = 0;//fila
	private int index = 0;//columna
	
	public void SetImagePath(String imgPath){
		try{
			spriteSheet =ImageIO.read(new File(imgPath));
			changeSprite();
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
		}
		public void moveLeft(){
			if(estadoFila != 1){
				estadoFila =1;
				index= -1;
			}
			
			index ++;
			changeSprite();
		}
		public void moveRight(){
			if(estadoFila != 3){
				estadoFila = 3;
				index= -1;
			}
			
			index ++;
			changeSprite();
		}
		public void moveUp(){
			if(estadoFila != 0){
				estadoFila = 0;
				index= -1;
			}
			
			index ++;
			changeSprite();
		}
		public void moveDown(){
			if(estadoFila != 2){
				estadoFila = 2;
				index= -1;
			}
			
			index ++;
			changeSprite();
		}
	 public void changeSprite(){
		 if(spriteSheet == null){
			 System.out.println("Error, sprite no cargado");
			 return;
		 }
		 if(index == filaDeImagen){
			 index = 0;}
		 
		 this.imagen = spriteSheet.getSubimage(
				 index * ancho + margenVertical, 
				 estadoFila * altura + margenHorizontal,
				 ancho,
				 altura);
		 
	 }
	 
	}//monito