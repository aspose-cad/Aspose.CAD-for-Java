package com.aspose.cad.examples.DXFDrawings;

import com.aspose.cad.Color;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.ifc.IfcImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.imageoptions.WmfOptions;

public class ExportDXFToWMF {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ExportDXFToWMF.class) + "DXFDrawings/";
	//ExStart:ExportDXFToWMF
               String srcFile = dataDir + "conic_pyramid.dxf";
		
		Image image = Image.load(srcFile);
		
	        IfcImage cadImage = (IfcImage)Image.load(("example.ifc"));
            try
            {
              {
                CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
                rasterizationOptions.setCenterDrawing(true);
                rasterizationOptions.setPageWidth(100);
                rasterizationOptions.setPageHeight(100);
                WmfOptions wmfOptions = new WmfOptions();
              
                cadImage.save("example.ifc.wmf", wmfOptions);
            }
          }
          finally
          {
            cadImage.dispose();
          
          }

	    // Export the DXF to PDF
	    image.save(dataDir + "conic_pyramid_out_.pdf");                	
	}
	//ExEnd:ExportDXFToWMF
}

