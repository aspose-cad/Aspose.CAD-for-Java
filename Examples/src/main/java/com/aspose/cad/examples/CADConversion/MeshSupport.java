
package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;


public class MeshSupport {

    public static void main(String[] args) 
    {
       //ExStart:MeshSupport
       String dataDir = Utils.getDataDir(MeshSupport.class) + "CADConversion/";
       
       String sourceFilePath = dataDir +"meshes.dwg";
       String outPath = dataDir + "meshes.pdf";

       CadImage cadImage = (CadImage)Image.load(sourceFilePath);
       
       CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setPageWidth(1600);
        rasterizationOptions.setPageHeight(1600);
        rasterizationOptions.setLayouts( new String[] { "Model" });
        
        PdfOptions pdfOptions = new PdfOptions();
        pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
        
        cadImage.save(outPath, pdfOptions);
        
       //ExEnd:MeshSupport
    }
}
