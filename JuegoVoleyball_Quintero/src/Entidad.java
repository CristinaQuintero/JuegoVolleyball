import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Entidad extends JPanel {

    public Image imagen;
	
	public double getX1()
	{
		return this.getLocation().getX();
	}
	
	public double getX2()
	{
		return (getX1() + this.getWidth());
	}
	
	public double getY1()
	{
		return this.getLocation().getY();
	}
	
	public double getY2()
	{
		return (getY1() + this.getHeight());
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(imagen != null)
			g.drawImage(imagen, 0, 0, null);
		
	}
}	