

package com.aspose.cad.examples.Features;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.PdfOptions;


public class CFFToPDF {

    public static void main(String[] args) 
    {
        
        //ExStart:CFFToPDF
        String dataDir = Utils.getDataDir(CFFToPDF.class) + "CFF/";
        // Path to source file
        String sourceFilePath = dataDir+"WineBottle_Die.cf2";
        
        Image image = Image.load(sourceFilePath);
        {
            PdfOptions options = new PdfOptions();
            image.save(dataDir + "WineBottle_Die_out.pdf",options);
        }
        
        
        //ExEnd:CFFToPDF
    }
    
}
