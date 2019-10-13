

package com.aspose.cad.examples.Features;

import com.aspose.cad.Image;
import com.aspose.cad.SizeF;
import com.aspose.cad.examples.DWGDrawings.ExportOLEObjects;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.imageoptions.VectorRasterizationOptions;


public class SinglePDFWithDifferentLayouts {

    
    public static void main(String[] args){ 
   

    //ExStart:SinglePDFWithDifferentLayouts  
    String dataDir = Utils.getDataDir(SinglePDFWithDifferentLayouts.class) + "DWGDrawings/"; 
    
    CadImage cadImage = (CadImage)Image.load(dataDir + "City skyway map.dwg");
    
        CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setPageWidth(1000);
        rasterizationOptions.setPageHeight(1000);

        //custom sizes for several layouts
        rasterizationOptions.getLayoutPageSizes().addItem("ANSI C Plot", new SizeF(500, 1000));
        rasterizationOptions.getLayoutPageSizes().addItem("8.5 x 11 Plot", new SizeF(1000, 100));

        PdfOptions pdfOptions = new PdfOptions();
        pdfOptions.setVectorRasterizationOptions(rasterizationOptions);

        cadImage.save(dataDir + "singlePDF_out.pdf", pdfOptions);

    
    
    //ExEnd:SinglePDFWithDifferentLayouts  
    
    }
}
