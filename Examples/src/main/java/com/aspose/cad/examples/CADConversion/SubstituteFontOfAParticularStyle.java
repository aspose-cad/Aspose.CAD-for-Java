package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;

public class SubstituteFontOfAParticularStyle {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(SubstituteFontOfAParticularStyle.class) + "CADConversion/";
		String srcFile = dataDir + "conic_pyramid.dxf";
		
		// Load a CAD drawing in an instance of CadImage
		CadImage cadImage = (CadImage)Image.load(srcFile);
		
		// Specify the font for one particular style
		cadImage.getStyles().get_Item("Roman").setPrimaryFontName("Arial");
	}
}
