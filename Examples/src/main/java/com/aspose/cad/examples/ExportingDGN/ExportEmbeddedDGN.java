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

public class ExportEmbeddedDGN
{
    public static void main(String[] args)
    {
        // Input and Output file paths
        String fileName = "BlockRefDgn.dwg";
       //ExStart:ExportEmbeddedDGN    
       	String dataDir = Utils.getDataDir(ExportEmbeddedDGN.class) + "ExportingDGN/";
		
       using (CadImage cadImage = (CadImage)Image.Load(fileName))
     {
       CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
       rasterizationOptions.Layouts = new[] { "Model" };

       PdfOptions pdfOptions = new PdfOptions();
       pdfOptions.VectorRasterizationOptions = rasterizationOptions;

       cadImage.Save(outDir + fileName + ".pdf", pdfOptions);
        }
        }
      //ExEnd:ExportEmbeddedDGN
    }
}
