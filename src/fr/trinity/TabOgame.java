package fr.trinity;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;

public class TabOgame extends CTabItem {

	/**
	 * Create the composite.
	 * @param TabFolder
	 * @param style
	 */
	
	public TabOgame(CTabFolder tabFolder, int style) {
		super(tabFolder, style);
		
		Browser bro = new Browser(tabFolder, getStyle());
		bro.setLayout(new FillLayout());
		bro.setUrl("www.ogame.fr");
		this.setControl(bro);
		this.setText("ogame");
		tabFolder.setSelection(this);
		
	}


}
