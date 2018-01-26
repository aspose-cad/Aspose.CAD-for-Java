/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.IFCDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.ifc.IfcImage;
import com.aspose.cad.imageoptions.IfcRasterizationOptions;
import com.aspose.cad.imageoptions.PngOptions;


public class ExportIFCToPNG {
    
//ExStart:ExportIFCToPNG
String dataDir = Utils.getDataDir(ExportIFCToPNG.class) + "ExportingIFC/";
String fileName = "example.ifc";
IfcImage cadImage = (IfcImage)Image.load(fileName);
 
IfcRasterizationOptions rasterizationOptions = new IfcRasterizationOptions();
rasterizationOptions.setCenterDrawing(true);
rasterizationOptions.setPageWidth(100);
rasterizationOptions.setPageHeight(100);
 
PngOptions pngOptions = new PngOptions();
pngOptions.setVectorRasterizationOptions(rasterizationOptions);
String outPath = fileName + ".png";
cadImage.save(dataDir, pngOptions);


//ExEnd:ExportIFCToPNG
}
