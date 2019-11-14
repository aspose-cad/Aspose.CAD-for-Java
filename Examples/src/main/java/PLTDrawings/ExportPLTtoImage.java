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
import com.aspose.cad.imageoptions.JpegOptions;
import com.aspose.cad.ImageOptionsBase;

import java.awt.Color;


public class ExportPLTtoImage {
 

public static void main(String[] args){ 
    String dataDir = Utils.getDataDir(ExportPLTtoImage.class) + "PLTDrawings\\";
     
    //ExStart:ExportPLTtoImage  
    
    String PLTPathToFile = dataDir + "50states.plt";
    Image image = Image.load(PLTPathToFile);
  
    //Setting PDF Options
    ImageOptionsBase imageOptions = new JpegOptions();

    CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
    cadRasterizationOptions.setDrawType(CadDrawTypeMode.UseObjectColor);
    cadRasterizationOptions.setPageHeight(1600);
    cadRasterizationOptions.setPageWidth(1600);
    cadRasterizationOptions.setBackgroundColor(com.aspose.cad.Color.getBlack());
    imageOptions.setVectorRasterizationOptions(cadRasterizationOptions);
   
    //Saving to Image
    image.save(dataDir+"50states.jpeg", imageOptions);

//ExEnd:ExportPLTtoImage
}
}