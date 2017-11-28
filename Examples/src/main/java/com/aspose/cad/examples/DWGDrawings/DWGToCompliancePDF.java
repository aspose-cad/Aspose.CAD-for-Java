package com.aspose.cad.examples.DWGDrawings;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class DWGToCompliancePDF {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(DWGToCompliancePDF.class) + "DWGDrawings/";
	    //ExStart:DWGToCompliancePDF
         	String srcFile = dataDir + "visualization_-_conference_room.dwg";
       		
		CadImage cadImage = (CadImage)Image.load(GetFileFromDesktop("example.dxf"));
        
           // Create an instance of PdfOptions
            PdfOptions pdfOptions = new PdfOptions();
            pdfOptions.setVectorRasterizationOptions(new CadRasterizationOptions());

            pdfOptions.setCorePdfOptions(new PdfDocumentOptions());

            pdfOptions.getCorePdfOptions().setCompliance(PdfCompliance.PdfA1a);
            cadImage.save(outPath, pdfOptions);

            pdfOptions.getCorePdfOptions().setCompliance(PdfCompliance.PdfA1b);
            cadImage.save(outPath, pdfOptions);
	   //ExEnd:DWGToCompliancePDF
        }

    }
