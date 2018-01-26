package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.*;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import java.awt.Image;

public class ConvertDWGFileToPDF {

	public static void main(String[] args) {
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ConvertDWGFileToPDF.class) + "DWGDrawings/";
		String srcFile = dataDir + "Bottom_plate.dwg";
		
		 com.aspose.cad.Image objImage = com.aspose.cad.Image.load(srcFile);
		
	    // Create an instance of CadRasterizationOptions and set its various properties
		CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
	    rasterizationOptions.setBackgroundColor(Color.getWhite());
	    rasterizationOptions.setPageWidth(1600);
	    rasterizationOptions.setPageHeight(1600);
	    
	    // Create an instance of PdfOptions
	    PdfOptions pdfOptions = new PdfOptions();
	    // Set the VectorRasterizationOptions property
	    pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
	    
	    // Export the DWG to PDF
	    objImage.save(dataDir + "Bottom_plate_out_.pdf", pdfOptions);
	}
	
}
