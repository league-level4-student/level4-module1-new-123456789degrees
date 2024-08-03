package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{
	
	public RedPolymorph(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), 50, 50);
	}
	
	@Override
	public void update() {
	        
	}
	
}