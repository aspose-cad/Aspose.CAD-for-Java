package com.aspose.cad.examples.DWGDrawings;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.CadLayoutDictionary;
import com.aspose.cad.fileformats.cad.cadobjects.CadLayout;

public class ListAllLayoutsInAnAutoCADDrawing {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ListAllLayoutsInAnAutoCADDrawing.class) + "DWGDrawings/";
		String srcFile = dataDir + "conic_pyramid.dxf";
		
		Image image = Image.load(srcFile);
		
	    CadImage cadImage = (CadImage)image;

	    CadLayoutDictionary layouts = cadImage.getLayouts();
	    for (CadLayout layout : layouts.getValues()) {
	        System.out.println("Layout " + layout.getLayoutName());
	    }
	}

}
