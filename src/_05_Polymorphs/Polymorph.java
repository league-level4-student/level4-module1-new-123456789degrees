package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    public void setX(int set) {
    	x = set;
    }
    public void setY(int set) {
    	y = set;
    }
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
