package com.aspose.cad.examples.ExportingCAD;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
//import com.aspose.cad.imageoptions.TypeOfEntities;

public class Export3DAutoCADImagesToPDF {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(Export3DAutoCADImagesToPDF.class) + "ExportingCAD/";
		//ExStart:Export3DAutoCADImagesToPDF
                
                String srcFile = dataDir + "conic_pyramid.dxf";
		
		Image cadImage = Image.load(srcFile);

		CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
		rasterizationOptions.setPageWidth(500);
		rasterizationOptions.setPageHeight(500);
//		rasterizationOptions.setTypeOfEntities(TypeOfEntities.Entities3D);

		rasterizationOptions.setLayouts(new String[] {"Model"});
		PdfOptions pdfOptions = new PdfOptions();
		pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
		cadImage.save(dataDir + "Export3DImagestoPDF_out_.pdf", pdfOptions);
                //ExStart:Export3DAutoCADImagesToPDF

	}

}
