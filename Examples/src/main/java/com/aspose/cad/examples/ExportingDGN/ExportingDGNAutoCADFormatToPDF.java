package com.aspose.cad.examples.ExportingDGN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.imageoptions.DgnRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class ExportingDGNAutoCADFormatToPDF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String dataDir = Utils.getDataDir(ExportingDGNAutoCADFormatToPDF.class) + "ExportingDGN/";
		
		// load an existing DGN file as DgnImage.
		DgnImage dgnImage = (DgnImage)Image.load(dataDir + "Nikon_D90_Camera.dgn");

		DgnRasterizationOptions rasterizationOptions = new DgnRasterizationOptions();

		// Create an object of CadRasterizationOptions class and define/set different properties
		PdfOptions options = new PdfOptions();
		rasterizationOptions.setPageWidth(600);
		rasterizationOptions.setPageHeight(300);
		rasterizationOptions.setCenterDrawing(true);
		rasterizationOptions.setNoScaling(true);
                rasterizationOptions.setAutomaticLayoutsScaling(false);

		options.setVectorRasterizationOptions(rasterizationOptions);
		
		OutputStream outStream = new FileOutputStream(dataDir + "ExportDGNToPdf_Out.pdf");
		
		// Call the save method of the DgnImage class object.
		dgnImage.save(outStream, options);

	}
}
