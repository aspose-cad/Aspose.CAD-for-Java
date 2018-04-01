package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;

public class SubstituteFontOfAParticularStyle {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(SubstituteFontOfAParticularStyle.class) + "CADConversion/";
		//ExStart:SubstituteFontOfAParticularStyle
                String srcFile = dataDir + "conic_pyramid.dxf";
		
		// Load a CAD drawing in an instance of CadImage
		CadImage cadImage = (CadImage)Image.load(srcFile);
		
		// Specify the font for one particular style
                 
                ((com.aspose.cad.fileformats.cad.cadtables.CadStyleTableObject)cadImage.getStyles().get_Item(0)).setPrimaryFontName("Arial");
	//ExEnd:SubstituteFontOfAParticularStyle
        
        }
}
