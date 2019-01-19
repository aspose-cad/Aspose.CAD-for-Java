package com.aspose.cad.examples.DXFDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.fileformats.dwf.whip.objects.DwfWhipLayer;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.dwf.DwfImage;
import com.aspose.cad.imageoptions.JpegOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExportSpecificDXFLayoutToImage {

	public static void main(String[] args) {
		
		// The path to the resource directory.
            String dataDir = Utils.getDataDir(ExportSpecificDXFLayoutToPDF.class) + "DXFDrawings\\";
            //ExStart:ExportSpecificDXFLayoutToImage
            String srcFile = dataDir + "for_layers_test.dwf";
	
            DwfImage image =(DwfImage)Image.load(srcFile); 
	    
            List<String> layersNames=image.getLayers().getLayersNames();
            
            DwfWhipLayer layer = image.getLayers().getLayerByName("0");
            for (DwfWhipLayer lr : image.getLayers())
            {
                //...
            }
            
		// Create an instance of CadRasterizationOptions and set its various properties
	    CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
	    rasterizationOptions.setPageWidth(1600);
	    rasterizationOptions.setPageHeight(1600);  
            rasterizationOptions.setCenterDrawing(true);
          
            String[] stringArray = Arrays.copyOf(layersNames.toArray(), layersNames.toArray().length, String[].class);
            // Add desired layers
            rasterizationOptions.setLayers(stringArray);

            JpegOptions jpegOptions = new JpegOptions();
            jpegOptions.setVectorRasterizationOptions(rasterizationOptions);
            String output = dataDir+"for_layers_test.jpg";
	    // Export the DXF to Image
            image.save(output, jpegOptions);
	   
            //ExEnd:ExportSpecificDXFLayoutToImage
	}
}
