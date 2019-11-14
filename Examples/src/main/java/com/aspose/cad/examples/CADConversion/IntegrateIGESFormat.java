
package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;


public class IntegrateIGESFormat {
public static void main(String[] args) 
    {
       //ExStart:IntegrateIGESFormat
       String dataDir = Utils.getDataDir(IntegrateIGESFormat.class) + "CADConversion/";
       
       String sourceFilePath = dataDir + "figa2.igs";
       String outPath = dataDir +"meshes.pdf";
       
       
       Image igesImage = Image.load(sourceFilePath);
               
       PdfOptions pdf = new PdfOptions();
        CadRasterizationOptions vectorOptions = new CadRasterizationOptions();
        vectorOptions.setPageHeight(1000) ;
        vectorOptions.setPageWidth(1000);
        
        pdf.setVectorRasterizationOptions(vectorOptions);
        
        igesImage.save(outPath, pdf);
       //ExEnd:IntegrateIGESFormat
    }
}
