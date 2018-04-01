package com.aspose.cad.examples.CADConversion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class EnableTrackingForCADRenderingProcess {

	public static void main(String[] args) throws FileNotFoundException {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(EnableTrackingForCADRenderingProcess.class) + "CADConversion/";
	//ExStart:EnableTrackingForCADRenderingProcess
                String srcFile = dataDir + "conic_pyramid.dxf";
		
		Image image = Image.load(srcFile);
		
		OutputStream stream = new FileOutputStream(dataDir + "conic_pyramid.pdf");
		PdfOptions pdfOptions = new PdfOptions();
		// Create an instance of CadRasterizationOptions and set its various properties
		CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
		pdfOptions.setVectorRasterizationOptions(cadRasterizationOptions);
		cadRasterizationOptions.setPageWidth(800);
		cadRasterizationOptions.setPageHeight(600);
		
		image.save(stream, pdfOptions);
		
		System.out.println("Tracking enabled successfully for CAD rendering process.");
	//ExEnd:EnableTrackingForCADRenderingProcess
        }

}
