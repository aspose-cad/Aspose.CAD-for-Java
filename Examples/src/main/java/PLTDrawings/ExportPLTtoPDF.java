/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLTDrawings;

import com.aspose.cad.examples.DWGDrawings.*;
import com.aspose.cad.Image;
import com.aspose.cad.examples.CADConversion.PenSupportInExport;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadDrawTypeMode;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadobjects.CadText;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import java.awt.Color;


public class ExportPLTtoPDF {
 

public static void main(String[] args){ 
   //ExStart:ExportPLTtoPDF  
    String dataDir = Utils.getDataDir(ExportPLTtoPDF.class) + "PLTDrawings\\";
    String PLTPathToFile = dataDir + "B747.plt";
    Image image = Image.load(PLTPathToFile);
  
    //Setting PDF Options
    PdfOptions pdfOptions = new PdfOptions();
    CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
    cadRasterizationOptions.setDrawType(CadDrawTypeMode.UseObjectColor);
    cadRasterizationOptions.setCenterDrawing(true);
    cadRasterizationOptions.setPageHeight(1600);
    cadRasterizationOptions.setPageWidth(1600);
    cadRasterizationOptions.setBackgroundColor(com.aspose.cad.Color.getBlack());
    pdfOptions.setVectorRasterizationOptions(cadRasterizationOptions);
   
    //Saving to PDF
    image.save(dataDir+"B747.pdf", pdfOptions);

//ExEnd:ExportPLTtoPDF
}
}