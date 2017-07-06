/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.STLDrawings;

public class ExportSTLToPNG {
    
String dataDir = Utils.getDataDir(ExportSTLToPNG.class) + "ExportingSTL/";
String fileName = "example.stl";
 
CadImage cadImage = (CadImage)Image.load(fileName);
CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
rasterizationOptions.setCenterDrawing(true);
rasterizationOptions.setPageWidth(100);
rasterizationOptions.setPageHeight(100);
 
PngOptions pngOptions = new PngOptions();
pngOptions.setVectorRasterizationOptions(rasterizationOptions);
String outPath = "galeon.stl.png";
cadImage.save(outPath, pngOptions);

}
