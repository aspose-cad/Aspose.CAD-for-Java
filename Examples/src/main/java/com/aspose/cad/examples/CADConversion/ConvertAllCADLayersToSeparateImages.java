package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadtables.CadLayerTable;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;

public class ConvertAllCADLayersToSeparateImages {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ConvertAllCADLayersToSeparateImages.class) + "CADConversion/";
//ExStart:ConvertAllCADLayersToSeparateImages
                String srcFile = dataDir + "conic_pyramid.dxf";
		
		// Load a CAD drawing in an instance of CadImage
		CadImage image = (CadImage) Image.load(srcFile);

		// Create an instance of CadRasterizationOptions
		CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();

		// Set image width & height
		rasterizationOptions.setPageWidth(500);
		rasterizationOptions.setPageHeight(500);

		// Set the drawing to render at the center of image
		rasterizationOptions.setCenterDrawing(true);
		
		// Get the layers in an instance of CadLayersDictionary. 
		// Iterate over the layers
		for (String layer : image.getLayers().getLayersNames())
                {
                    // Display layer name for tracking
                    System.out.println("Start with " +layer);

                    // Add the layer name to the CadRasterizationOptions's layer list
                    rasterizationOptions.setLayers(new String[]{layer});
 
                    // Create an instance of JpegOptions (or any ImageOptions for raster formats)
                    JpegOptions options = new JpegOptions();
                    // Set VectorRasterizationOptions property to the instance of CadRasterizationOptions
                    options.setVectorRasterizationOptions(rasterizationOptions);
                    // Export each layer to JPEG format
                    image.save(dataDir + layer + "_out_.jpg", options);
		}
//ExEnd:ConvertAllCADLayersToSeparateImages
	}

}
