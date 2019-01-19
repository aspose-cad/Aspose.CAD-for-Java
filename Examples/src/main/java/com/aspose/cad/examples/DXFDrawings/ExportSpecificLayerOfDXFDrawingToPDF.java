package com.aspose.cad.examples.DXFDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class ExportSpecificLayerOfDXFDrawingToPDF {

	public static void main(String[] args) {
		
		// The path to the resource directory.
            String dataDir = Utils.getDataDir(ExportSpecificLayerOfDXFDrawingToPDF.class) + "DXFDrawings/";
            //ExStart:ExportSpecificLayerOfDXFDrawingToPDF
            String srcFile = dataDir + "conic_pyramid.dxf";
            
            Image image = Image.load(srcFile);
	    
            //  Create an instance of CadRasterizationOptions and set its various properties
	    CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
	    rasterizationOptions.setPageWidth(1600);
	    rasterizationOptions.setPageHeight(1600);
	    // Add desired layers
	     rasterizationOptions.setLayers(new String[]{"0"});
 

	    // Create an instance of PdfOptions
	    PdfOptions pdfOptions = new PdfOptions();
	    // Set the VectorRasterizationOptions property
	    pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
	    
	    // Export the DXF to PDF
	    image.save(dataDir + "conic_pyramid_layer_out_.pdf", pdfOptions);                
            //ExEnd:ExportSpecificLayerOfDXFDrawingToPDF
	}
}
