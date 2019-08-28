
package com.aspose.cad.examples.DWFDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SupportOfLayers {
    
    public static void main(String[] args) {
        
        
            //ExStart:SupportOfLayers
            // The path to the resource directory.
            String dataDir = Utils.getDataDir(SupportOfLayers.class) + "DWFDrawings/";
            
            String srcFile = dataDir + "for_layers_test.dwf";
            String outFile = dataDir + "for_layers_test.jpg";
            
            Image image = Image.load(srcFile); 
            
            /// Create an instance of CadRasterizationOptions and set its various properties
	    CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
	    rasterizationOptions.setPageWidth(1600);
	    rasterizationOptions.setPageHeight(1600);   
	    
            // Add desired layers
            List<String> stringList = new ArrayList<>(Arrays.asList("LayerA"));
	    rasterizationOptions.setLayers(stringList);
            
            
            JpegOptions jpegOptions = new JpegOptions();
            jpegOptions.setVectorRasterizationOptions(rasterizationOptions);
            
            // Export the DXF to JPG
           image.save(outFile, jpegOptions);
            //ExEnd:SupportOfLayers
            
    }
}
