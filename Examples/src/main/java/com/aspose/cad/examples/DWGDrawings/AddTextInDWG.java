/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.CADConversion.PenSupportInExport;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadDrawTypeMode;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadobjects.CadText;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;


public class AddTextInDWG {
 

public static void main(String[] args){ 
   //ExStart:AddTextInDWG  
String dataDir = Utils.getDataDir(AddTextInDWG.class) + "DWGDrawings;/";
String dwgPathToFile = dataDir + "conic_pyramid.dwg";
Image image = Image.load(dwgPathToFile);
CadText cadText = new CadText();
cadText.setStyleType("Standard");
cadText.setDefaultValue("Some custom text");
cadText.setColorId(256);
cadText.setLayerName("0");
cadText.getFirstAlignment().setX(47.9);
cadText.getFirstAlignment().setY(5.56);
cadText.setTextHeight(0.8);
cadText.setScaleX(0);
CadImage cadImage = ((CadImage)(image));
cadImage.getBlockEntities().get_Item("*Model_Space").addEntity(cadText);
PdfOptions pdfOptions = new PdfOptions();
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
pdfOptions.setVectorRasterizationOptions(cadRasterizationOptions);
cadRasterizationOptions.setDrawType(CadDrawTypeMode.UseObjectColor);
cadRasterizationOptions.setCenterDrawing(true);
cadRasterizationOptions.setPageHeight(1600);
cadRasterizationOptions.setPageWidth(1600);
cadRasterizationOptions.setLayouts(new String[] {"Model"});
image.save(dataDir+"SimpleEntites_generated.dwg.pdf", pdfOptions);

//ExEnd:AddTextInDWG
}
}