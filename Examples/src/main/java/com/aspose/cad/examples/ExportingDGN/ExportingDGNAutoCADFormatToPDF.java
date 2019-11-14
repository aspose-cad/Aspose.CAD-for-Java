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
		
       // Input and Output file paths
            String dataDir = Utils.getDataDir(ExportingDGNAutoCADFormatToPDF.class) + "ExportingDGN/";
           //ExStart:SupportForDGNV7   
            String fileName = dataDir + "Nikon_D90_Camera.dgn";
            String outFile  = dataDir + "Nikon_D90_Camera.dgn";
            
            DgnImage objImage = (DgnImage)com.aspose.cad.Image.load(fileName);
            
                PdfOptions options = new PdfOptions();
                CadRasterizationOptions vectorOptions = new CadRasterizationOptions();
                vectorOptions.setPageWidth(1500);
                vectorOptions.setPageHeight(1500);
                vectorOptions.setAutomaticLayoutsScaling(true);            
                vectorOptions.setLayouts(new String[] { "1", "2", "3", "9" });//only export 4 (1,2,3 and 9) views
                options.setVectorRasterizationOptions(vectorOptions);

                objImage.save(outFile, options);

    }
}
