package com.aspose.cad.examples.ExportingDGN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.Image;
import com.aspose.cad.ImageOptionsBase;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class ExportEmbeddedDGN
{
    public static void main(String[] args)
    {
        // Input and Output file paths
        String fileName = "BlockRefDgn.dwg";
       //ExStart:ExportEmbeddedDGN    
       	String dataDir = Utils.getDataDir(ExportEmbeddedDGN.class) + "ExportingDGN/";
		
     com.aspose.cad.Image objImage = com.aspose.cad.Image.load(fileName);
     {
       CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
       rasterizationOptions.getLayouts()
               Layouts = new[]{"Model"};
       PdfOptions pdfOptions = new PdfOptions();
       pdfOptions.getVectorRasterizationOptions();
      objImage.save(dataDir + fileName + ".pdf", pdfOptions);
        }
        }
      //ExEnd:ExportEmbeddedDGN
    }
