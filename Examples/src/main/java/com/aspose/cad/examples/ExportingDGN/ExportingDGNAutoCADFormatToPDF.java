package com.aspose.cad.examples.ExportingDGN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class ExportingDGNAutoCADFormatToPDF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
        String dataDir = Utils.getDataDir(ExportingDGNAutoCADFormatToPDF.class) + "ExportingDGN/";

        //ExStart:ExportingDGNAutoCADFormatToPDF
        // load an existing DGN file as DgnImage.
        DgnImage dgnImage = (DgnImage)Image.load(dataDir + "Nikon_D90_Camera.dgn");
        // Create an object of CadRasterizationOptions class and define/set different properties
        PdfOptions options = new PdfOptions();
        CadRasterizationOptions vectorOptions = new CadRasterizationOptions();
        vectorOptions.setPageWidth(1500);
        vectorOptions.setPageHeight(1500);
        vectorOptions.setCenterDrawing(true);
        vectorOptions.setNoScaling(true);

        vectorOptions.setAutomaticLayoutsScaling(false);

        options.setVectorRasterizationOptions(vectorOptions);

        OutputStream outStream = new FileOutputStream(dataDir + "ExportDGNToPdf_Out.pdf");

        // Call the save method of the DgnImage class object.
        dgnImage.save(outStream, options);
        //ExEnd:ExportingDGNAutoCADFormatToPDF

    }
}
