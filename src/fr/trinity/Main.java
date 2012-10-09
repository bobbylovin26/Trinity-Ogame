package fr.trinity;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {


	public Main(Display display) {
	       
        Shell shell = new Shell(display);
        shell.setText("Trinity-Ogame");
        shell.setSize(1024, 768);
        shell.open();

        while (!shell.isDisposed()) {
          if (!display.readAndDispatch()) {
            display.sleep();
          }
        }
    }
	
	public static void main(String[] args) {
		Display display = new Display();
        new Main(display);
        display.dispose();
	}
}
