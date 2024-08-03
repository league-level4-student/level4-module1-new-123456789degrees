package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	
	public MovingMorph(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), 50, 50);
	}
	
	@Override
	public void update() {
		if (getX() > 450) {
			setX(0);
		}
		else {
			setX(getX() + 2);
		}
	}
	
}