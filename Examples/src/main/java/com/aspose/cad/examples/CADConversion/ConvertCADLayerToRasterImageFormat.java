package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.DWGDrawings.ExportSpecificDWGLayoutToPDF;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;

public class ConvertCADLayerToRasterImageFormat {
	
	public static void main(String[] args) {
		
		// The path to the resource directory.
	        //String dataDir = Utils.getDataDir(ExportSpecificDWGLayoutToPDF.class) + "DWGDrawings/";
		//String srcFile = dataDir + "visualization_-_conference_room.dwg";
                
                String dataDir = Utils.getDataDir(ConvertCADLayerToRasterImageFormat.class) + "CADConversion/";
	//ExStart:ConvertCADLayerToRasterImageFormat
        	String srcFile = dataDir + "conic_pyramid.dxf";
		
		// Load a CAD drawing in an instance of Image
		Image image = Image.load(srcFile);

		// Create an instance of CadRasterizationOptions
		CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
		// Set image width & height
		rasterizationOptions.setPageWidth(500);
		rasterizationOptions.setPageHeight(500);

		// Set the drawing to render at the center of image
		rasterizationOptions.setCenterDrawing(true);

		// Add the layer name to the CadRasterizationOptions's layer list
		rasterizationOptions.getLayers().add("0"); //Most of the CAD drawings have a layer by name 0, you may specify any name

		// Create an instance of JpegOptions (or any ImageOptions for raster formats)
		JpegOptions options = new JpegOptions();
		// Set VectorRasterizationOptions property to the instance of CadRasterizationOptions
		options.setVectorRasterizationOptions(rasterizationOptions);
		// Export each layer to JPEG format
		image.save(dataDir + "CADLayersToRasterImageFormats_out_.jpg", options);
//ExEnd:ConvertCADLayerToRasterImageFormat
	}
}
