package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadtables.CadStyleTableObject;

public class SubstituteFont {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(SubstituteFont.class) + "CADConversion/";
		String srcFile = dataDir + "conic_pyramid.dxf";
		
		// Load a CAD drawing  in an instance of CadImage
		CadImage cadImage = (CadImage) Image.load(srcFile);

		// Iterate over the items of CadStylesDictionary
		for (Object style : cadImage.getStyles()) {
			// Set the font name
		
                     cadImage.getStyles().get_Item(0).setPrimaryFontName("Arial");
		}
	}
}
