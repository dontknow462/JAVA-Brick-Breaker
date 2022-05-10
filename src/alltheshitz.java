import javax.swing.*;
import java.awt.*;


public class alltheshitz extends JFrame {
	int ver=10;
	int hor= 10;
	int spacing=49;
	int cellwidth= 50;
	
	JFrame frame;
	
	alltheshitz(){
		   frame = new JFrame("DrawGrid");
	        frame.setSize(1300, 900);
	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        frame.setResizable(false);
	       Board board= new Board();
	        frame.setContentPane(board);
	}
	
//	Color[][] color = new Color[ver][hor];
	Color [][] golor = new Color [ver][hor];
	
	public class Board extends JPanel {
		public void paintComponent(Graphics g){
			
			g.setColor(Color.BLACK);
			g.fillRect(0,0,1300,900);
			g.setColor(Color.RED);
			for(int i=0; i<ver; i++ ) {
				for(int j=0; j<hor;j++) {
					
					g.setColor(golor[i][j]);
					g.fillRect(i*spacing,j*spacing,40,40);
						
					
					
					
				}
			}
		}
	}
	
	
	
	
}
