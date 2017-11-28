package com.aspose.cad.examples.ExportingDGN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.Image;
import com.aspose.cad.ImageOptionsBase;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.imageoptions.DgnRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;

public class SupportForDGNV7 
{
    public static void main(String[] args)
    {
        // Input and Output file paths
        String fileName = "BlockRefDgn.dwg";
       //ExStart:SupportForDGNV7     
       	String dataDir = Utils.getDataDir(SupportForDGNV7 .class) + "ExportingDGN/";
		
       DgnImage dgnImage = (DgnImage)Image.load(file);
        {
            PdfOptions options = new PdfOptions();
            CadRasterizationOptions vectorOptions = new CadRasterizationOptions();
            vectorOptions.setPageWidth(1500);
            vectorOptions.setPageHeight(1500);
            vectorOptions.setCenterDrawing(true);
            vectorOptions.setAutomaticLayoutsScaling(true);
            vectorOptions.setBackgroundColor(Color.getBlack());
            vectorOptions.setLayouts(new String[] { "1", "2", "3", "9" });//only export 4 (1,2,3 and 9) views
            options.setVectorRasterizationOptions(vectorOptions);

            dgnImage.save(outFile, options);
        }
      //ExEnd:SupportForDGNV7 
    }
}
