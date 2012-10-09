package fr.trinity;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.layout.FillLayout;

public class Main {


	public Main(Display display) {
	   //Set the shell and application window    
        Shell shell = new Shell(display);
        shell.setText("Trinity-Ogame");
        shell.setSize(1024, 768);
        shell.setLayout(new BorderLayout(0, 0));
        Menu menu = new Menu(shell, SWT.BAR);
        shell.setMenuBar(menu);  
        
        MenuItem mntmMenu = new MenuItem(menu, SWT.CASCADE);
        mntmMenu.setText("Menu");
        
        Menu menu_1 = new Menu(mntmMenu);
        mntmMenu.setMenu(menu_1);
        
        MenuItem mntmQuitter = new MenuItem(menu_1, SWT.NONE);
        mntmQuitter.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent arg0) {
        		System.exit(0);
        	}
        });
        mntmQuitter.setText("Quitter");
        
        final CTabFolder tabFolder = new CTabFolder(shell, SWT.CLOSE);
        /********** End of menu **********/
        
        Composite composite = new Composite(shell, SWT.NONE);
        composite.setLayoutData(BorderLayout.WEST);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        
        
        /********** Set Toolbar **********/
        ToolBar toolBar = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
        
        ToolItem tltmFutuOutils = new ToolItem(toolBar, SWT.NONE);
        tltmFutuOutils.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent arg0) {
        		TabOgame tbtmOgame = new TabOgame(tabFolder, SWT.NONE);
        		
        	}
        });
        tltmFutuOutils.setText("Nouvel onglet");
        /********** End of Toolbar **********/
        
        tabFolder.setLayoutData(BorderLayout.CENTER);
        tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
       
        
        
        
        
        
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
