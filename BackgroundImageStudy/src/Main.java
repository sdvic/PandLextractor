import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main extends JComponent
{
	Image sailboatImage = new ImageIcon(this.getClass().getResource("si.jpg")).getImage();

//	URL pingSoundAddress = getClass().getResource("fire.wav");
//    AudioClip pingSoundFile = JApplet.newAudioClip(pingSoundAddress);

	public JFrame space = new JFrame();
	int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	int screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

	public static void main(String[] args) {
		new Main().getGoing();
	}

	void getGoing() {
		space.setSize(screenWidth, screenHeight);
		space.setVisible(true);
		space.setDefaultCloseOperation(space.EXIT_ON_CLOSE);
		space.add(this);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(sailboatImage, 0, 0, null);
	}
}
