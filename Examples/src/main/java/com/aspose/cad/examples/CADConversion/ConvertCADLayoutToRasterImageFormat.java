package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.ImageOptionsBase;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.tiff.enums.TiffExpectedFormat;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.TiffOptions;

public class ConvertCADLayoutToRasterImageFormat {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ConvertCADLayoutToRasterImageFormat.class) + "CADConversion/";
		String srcFile = dataDir + "conic_pyramid.dxf";
		
		Image image = Image.load(srcFile);

		// Create an instance of CadRasterizationOptions
		CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();

		// Set page width & height
		rasterizationOptions.setPageWidth(1200);
		rasterizationOptions.setPageHeight(1200);

		// Specify a list of layout names
		rasterizationOptions.setLayouts(new String[] {"Model", "Layout1"});

		// Create an instance of TiffOptions for the resultant image
		ImageOptionsBase options = new TiffOptions(TiffExpectedFormat.Default);

		// Set rasterization options
		options.setVectorRasterizationOptions(rasterizationOptions);

		// Save resultant image
		image.save(dataDir + "conic_pyramid_layoutstorasterimage_out_.tiff", options);
	}

}
