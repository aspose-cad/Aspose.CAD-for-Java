
package com.aspose.cad.examples.OBJDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;


public class SupportOfOBJ {
    
     public static void main(String[] args)
    {
        //ExStart:SupportOfOBJ
        String dataDir = Utils.getDataDir(SupportOfOBJ.class) + "OBJDrawings/";
        
        Image cadDoc = Image.load(dataDir + "example-580-W.obj");
        CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setPageWidth(cadDoc.getSize().getWidth());
        rasterizationOptions.setPageHeight(cadDoc.getSize().getHeight());
        PdfOptions CADf = new PdfOptions();
        CADf.setVectorRasterizationOptions(rasterizationOptions);
        cadDoc.save(dataDir + "example-580-W_custom.pdf", CADf);
        
         //ExEnd:SupportOfOBJ
    }

}
