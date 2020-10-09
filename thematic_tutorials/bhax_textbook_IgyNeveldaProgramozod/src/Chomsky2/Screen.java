mport java.awt.*;
import javax.swing.JFrame;

public class Screen {
	
	private GraphicsDevice gd;
	
	public Screen() {
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		gd = env.getDefaultScreenDevice();
	}
	
	public void setFullScreen(DisplayMode dm, JFrame window) {
		
		window.setUndecorated(true);
		window.setResizable(false);
		gd.setFullScreenWindow(window);
		
		if (dm != null && gd.isDisplayChangeSupported()) {
			try {
				gd.setDisplayMode(dm);
			}
			catch (Exception e){}
		}
	}
	
	public Window getFullScreenWindow() {
		return gd.getFullScreenWindow();
	}
	
	public void restore() {
		Window w = gd.getFullScreenWindow();
		if (w != null)
			w.dispose();
		gd.setFullScreenWindow(null);
	}
}