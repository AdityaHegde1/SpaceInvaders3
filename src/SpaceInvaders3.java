


import java.awt.Dimension;

import javax.swing.JFrame;

public class SpaceInvaders3{
	GamePanel3 GP = new GamePanel3();	
	public JFrame frame = new JFrame();
	
	static int height = 800;
	static int width = 500;

	public static void main(String[] args) {
	SpaceInvaders3 SP3 = new SpaceInvaders3();
	SP3.setup();

	}

	public void setup() {
		frame.add(GP);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));

		frame.pack();
		frame.addKeyListener(GP);
		frame.setVisible(true);
	

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GP.startGame();
	}
}
