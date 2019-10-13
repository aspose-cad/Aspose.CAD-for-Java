

package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PngOptions;


public class ExportOLEObjects {

    
    public static void main(String[] args){ 
   

    //ExStart:ExportOLEObjects  
    String dataDir = Utils.getDataDir(ExportOLEObjects.class) + "DWGDrawings/";    
    
    String[] files = new String[] { "D ZD junior D10m H2m.dwg", "ZD - Senior D6m H2m45.dwg" };
    
    PngOptions pngOptions = new PngOptions();
    CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
    pngOptions.setVectorRasterizationOptions(rasterizationOptions);
    rasterizationOptions.setLayouts(new String[] { "Layout1" });
    
            for(String file : files)
            {
                CadImage cadImage = (CadImage)Image.load(dataDir + file);
                
                    cadImage.save(dataDir + file + "_out.png", pngOptions);
                
            }
    
    
    //ExEnd:ExportOLEObjects  
    
    }
}
