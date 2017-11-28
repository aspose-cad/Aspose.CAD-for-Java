package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadtables.CadStyleTableObject;

public class ReadingDWT {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ReadingDWT.class) + "CADConversion/";
		String srcFile = dataDir + "conic_pyramid.dxf";
		//ExStart:ReadingDWT
		CadImage image = (CadImage)Image.load("example.dwt");
           {
            for (CadBaseEntity entity : image.getEntities())
            {
             //   ...
            }
       
        }
             //ExEnd:ReadingDWT
	}
        }
