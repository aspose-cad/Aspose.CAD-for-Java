package com.aspose.cad.examples.ExportingDGN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.Image;
import com.aspose.cad.ImageOptionsBase;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;

import com.aspose.cad.imageoptions.JpegOptions;

public class ExportingDGNAutoCADFormatToRasterImageFormat {

	public static void main(String[] args) throws FileNotFoundException 
        {
		
            String dataDir = Utils.getDataDir(ExportingDGNAutoCADFormatToRasterImageFormat.class) + "ExportingDGN/";
            //ExStart:ExportingDGNAutoCADFormatToRasterImageFormat
            
            // Load an existing DGN file as DgnImage.
            DgnImage dgnImage = (DgnImage) Image.load(dataDir + "Nikon_D90_Camera.dgn");

            // Create an object of JpegOptions class as we are converting the DGN to JPEG and assign DgnRasterizationOptions object to it.
            ImageOptionsBase options = new JpegOptions();
            
            CadRasterizationOptions vectorOptions = new CadRasterizationOptions();
            vectorOptions.setPageWidth(600);
            vectorOptions.setPageHeight(400);
            vectorOptions.setCenterDrawing(true);
            vectorOptions.setNoScaling(true);
	
            vectorOptions.setAutomaticLayoutsScaling(false);

            options.setVectorRasterizationOptions(vectorOptions);
		
            OutputStream outStream = new FileOutputStream(dataDir + "ExportDGNToRasterImage_Out.jpg");
		
            // Call the save method of the CadImage class object.
            dgnImage.save(outStream, options);
	   
            //ExEnd:ExportingDGNAutoCADFormatToRasterImageFormat
        }
}