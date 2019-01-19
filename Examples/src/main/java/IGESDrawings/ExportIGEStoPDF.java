/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLTDrawings;

import PLTDrawings.*;
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


public class ExportIGEStoPDF {
 

public static void main(String[] args)
{ 
   //ExStart:ExportIGEStoPDF  
    String dataDir = Utils.getDataDir(ExportIGEStoPDF.class) + "IGESDrawings/";
    String PLTPathToFile = dataDir + "figa2.igs";
    Image image = Image.load(PLTPathToFile);
  
    //Setting PDF Options
    PdfOptions pdfOptions = new PdfOptions();
    CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
    cadRasterizationOptions.setDrawType(CadDrawTypeMode.UseObjectColor);
    cadRasterizationOptions.setPageHeight(1000);
    cadRasterizationOptions.setPageWidth(1000);
  
    pdfOptions.setVectorRasterizationOptions(cadRasterizationOptions);
   
    //Saving to PDF
    image.save(dataDir+"figa2.pdf", pdfOptions);

//ExEnd:ExportIGEStoPDF
}
}