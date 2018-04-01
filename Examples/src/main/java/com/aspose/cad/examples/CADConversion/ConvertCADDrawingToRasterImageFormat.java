package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.ImageOptionsBase;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PngOptions;

public class ConvertCADDrawingToRasterImageFormat {

	public static void main(String[] args) {
		
		String dataDir = Utils.getDataDir(ConvertCADDrawingToRasterImageFormat.class) + "CADConversion/";
	//ExStart:ConvertCADDrawingToRasterImageFormat
        String srcFile = dataDir + "conic_pyramid.dxf";
		
		Image image = Image.load(srcFile); 
	    
		// Create an instance of CadRasterizationOptions
	    CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
	    // Set page width & height
	    rasterizationOptions.setPageWidth(1200);
	    rasterizationOptions.setPageHeight(1200);

	    // Create an instance of PngOptions for the resultant image
	    ImageOptionsBase options = new PngOptions();
	    //Set rasterization options
	    options.setVectorRasterizationOptions(rasterizationOptions);

	    // Save resultant image
	    image.save(dataDir + "conic_pyramid_raster_image_out_.png", options);
	//ExEnd:ConvertCADDrawingToRasterImageFormat
        
        }

}
