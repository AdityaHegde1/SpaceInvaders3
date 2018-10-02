import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel3 extends JPanel implements ActionListener,KeyListener {
	
	Timer timer;
	GameObject GO;
	public void GamePanel3() {
		Timer timer = new Timer(1000 / 60, this);
		GameObject GO = new GameObject(10,10, 10, 10);
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		GO.update();
	}
	public void startGame() {

		timer.start();
	}
	
	@Override

	public void paintComponent(Graphics g){

		
	        }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
System.out.println("1");		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("2");		
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("3");		
	
	}


}
