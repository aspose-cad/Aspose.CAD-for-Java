package com.aspose.cad.examples.ExportingCAD;

import com.aspose.cad.Image;
import com.aspose.cad.InterpolationMode;
import com.aspose.cad.SmoothingMode;
import com.aspose.cad.TextRenderingHint;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.ScaleType;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.imageoptions.TypeOfEntities;

public class ExportToPDF {

	public static void main(String[] args) {
		
		//ExStart:ExportToPDF
                 // The path to the resource directory.
		String dataDir = Utils.getDataDir(ExportToPDF.class) + "ExportingCAD/";
		
        String fileName = ("APFH Floor Plan.dwf");
        com.aspose.cad.Image image = com.aspose.cad.Image.load(fileName);
        {
            PdfOptions pdfOptions = new PdfOptions();
            CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
            pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
            rasterizationOptions.setCenterDrawing(true);
            rasterizationOptions.setPageHeight(500);
            rasterizationOptions.setPageWidth(500);
            rasterizationOptions.setLayouts(new String[] { "Model" });
            // export
            String outPath = fileName + ".pdf";
            image.save(outPath, pdfOptions);
        }		

	 //ExEnd:ExportToPDF
}
}
