package plugins.perrine.ecclemautofinder;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import icy.file.Loader;
import icy.gui.viewer.Viewer;
import icy.plugin.PluginLauncher;
import icy.plugin.PluginLoader;
import icy.sequence.Sequence;
import plugins.adufour.ezplug.EzPlug;

public class test extends EzPlug{



@Override
public void clean() {
	// TODO Auto-generated method stub
	
}

@Override
protected void execute() {
	// TODO Auto-generated method stub
	final String imagePath = "C:\\Users\\perri\\Nextcloud\\Mes documents\\Papierssoumisouencours\\ENCOURS_ori\\AutomaticRegistration43points\\200824\\20200824_DFT_10_10_Aligned_binned_4x4x2.tif";
	final Sequence sequence = Loader.loadSequence( imagePath, 0, true );
	final String imagePath2 = "C:\\Users\\perri\\Nextcloud\\Mes documents\\Papierssoumisouencours\\ENCOURS_ori\\AutomaticRegistration43points\\200824\\C2-roi8.tif";
	final Sequence sequence2 = Loader.loadSequence( imagePath2, 0, true );

	

	// Display the images.
	try {
		SwingUtilities.invokeAndWait( () -> {
			new Viewer( sequence );
			new Viewer( sequence2 );
		} );
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// Run the plugin on the last active image (the copy).
	PluginLauncher.start( PluginLoader.getPlugin( EcclemAutoFinder.class.getName() ) );
}

@Override
protected void initialize() {
	// TODO Auto-generated method stub
	
}
}
