import java.awt.Graphics;

public class GameObject {
    int X;

    int Y;

    int width;

    int height;


    public GameObject(int x, int y,int width,int height) {
	
	}
    public  void update() {
    	X-=5;
    	Y+=7;
    }
 public  void draw(Graphics g) {
	 g.fillRect(X, Y, 100, 100);
    }
}
