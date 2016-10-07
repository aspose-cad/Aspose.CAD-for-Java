package com.aspose.cad.examples.ExportingDGN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.imageoptions.DgnRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;

public class ExportingDGNAutoCADFormatToRasterImageFormat {

	public static void main(String[] args) throws FileNotFoundException {
		
		String dataDir = Utils.getDataDir(ExportingDGNAutoCADFormatToRasterImageFormat.class) + "ExportingDGN/";
		
		// Load an existing DGN file as DgnImage.
		DgnImage dgnImage = (DgnImage) com.aspose.cad.Image.load(dataDir + "Sample.dgn");

		// Create an object of DgnRasterizationOptions class and define/set different properties
		DgnRasterizationOptions rasterizationOptions = new DgnRasterizationOptions();

		// Create an object of JpegOptions class as we are converting the DGN to JPEG and assign DgnRasterizationOptions object to it.
		JpegOptions options = new JpegOptions();

		rasterizationOptions.setPageWidth(600);
		rasterizationOptions.setPageHeight(300);
		rasterizationOptions.setCenterDrawing(true);
		rasterizationOptions.setAutomaticLayoutsScaling(false);

		options.setVectorRasterizationOptions(rasterizationOptions);
		
		OutputStream outStream = new FileOutputStream(dataDir + "ExportDGNToRasterImage_Out.jpg");
		
		// Call the save method of the CadImage class object.
		dgnImage.save(outStream, options);
	}

}