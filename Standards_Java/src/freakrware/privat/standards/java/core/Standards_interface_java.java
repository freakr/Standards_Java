package freakrware.privat.standards.java.core;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public interface Standards_interface_java {
	
	public Standards jstandard = new Standards();
	
	public class Standards{
		public void messagedialog(final Component comp,final String meldung)
		{
			Thread message = new Thread(new Runnable()
			{

				@Override
				public void run() {
			
			JOptionPane.showMessageDialog(comp,new JLabel(meldung, JLabel.CENTER));
		}
		
	});
	message.start();
	}
		
	}
	
	

}
