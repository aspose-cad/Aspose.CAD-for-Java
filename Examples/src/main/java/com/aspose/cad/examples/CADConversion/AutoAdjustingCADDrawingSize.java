package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.ImageOptionsBase;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PngOptions;

public class AutoAdjustingCADDrawingSize 
{

    public static void main(String[] args) 
    {

        // Path to source file
        String sourceFilePath = "sample.dwg";

        // Load a CAD drawing in an instance of Image
        com.aspose.cad.Image objImage = com.aspose.cad.Image.load("sourceFilePath");

        // Create an instance of BmpOptions class
        com.aspose.cad.imageoptions.BmpOptions bmpOptions = new com.aspose.cad.imageoptions.BmpOptions();

        // Create an instance of CadRasterizationOptions and set its various properties
        com.aspose.cad.imageoptions.CadRasterizationOptions cadRasterizationOptions = 
                new com.aspose.cad.imageoptions.CadRasterizationOptions();

        bmpOptions.setVectorRasterizationOptions(cadRasterizationOptions);
        cadRasterizationOptions.setCenterDrawing(true);

        // Set the layouts property
        cadRasterizationOptions.setLayouts( new String[] { "Model" } );

        // Export layout to BMP format
        String outPath = sourceFilePath + ".bmp";
        objImage.save(outPath, bmpOptions);
    }

}
