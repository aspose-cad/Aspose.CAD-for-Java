/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.IFCDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.ifc.IfcImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PngOptions;


public class ExportIFCToPNG {
     public static void main(String[] args)
     {
        String dataDir = Utils.getDataDir(ExportIFCToPNG.class) + "ExportingIFC/";
        //ExStart:ExportIFCToPNG
        String fileName = "example.ifc";
        IfcImage cadImage = (IfcImage)Image.load(fileName);

        CadRasterizationOptions vectorOptions = new CadRasterizationOptions();
        vectorOptions.setPageWidth(1500);
        vectorOptions.setPageHeight(1500);
//        vectorOptions.setCenterDrawing(true);
        PngOptions pngOptions = new PngOptions();
        pngOptions.setVectorRasterizationOptions(vectorOptions);
        String outPath = fileName + ".png";
        cadImage.save(dataDir, pngOptions);


        //ExEnd:ExportIFCToPNG
    }
}