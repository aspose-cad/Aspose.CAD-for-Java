package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;

public class GetBlockAttributeValueOfExternalReference {

	public static void main(String[] args) {
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(GetBlockAttributeValueOfExternalReference.class) + "DWGDrawings/";
                //ExStart:GetBlockAttributeValueOfExternalReference
		// Load an existing DWG file as CadImage.
		CadImage cadImage = (CadImage) Image.load(dataDir + "sample.dwg");
		
		// Access the external path name property
		String sXternalRef = cadImage.getBlockEntities().get_Item("*MODEL_SPACE").getXRefPathName();
		System.out.println(sXternalRef);
                //ExEnd:GetBlockAttributeValueOfExternalReference
	}

}