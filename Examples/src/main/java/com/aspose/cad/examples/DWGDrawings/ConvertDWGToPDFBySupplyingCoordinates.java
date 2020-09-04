package com.aspose.cad.examples.DWGDrawings;
import com.aspose.cad.Image;
import com.aspose.cad.Point;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadparameters.CadStringParameter;
import com.aspose.cad.fileformats.cad.cadtables.CadVportTableObject;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class ConvertDWGToPDFBySupplyingCoordinates {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ConvertDWGToPDFBySupplyingCoordinates.class) + "DWGDrawings/";
	    //ExStart:1
		String srcFile = dataDir + "visualization_-_conference_room.dwg";
       		
		CadImage cadImage = (CadImage)Image.load(srcFile);

		CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
		rasterizationOptions.setLayouts(new String[]{"Model"});
		rasterizationOptions.setNoScaling(true);

		// note: preserving some empty borders around part of image is the responsibility of customer
		// top left point of region to draw
		Point topLeft = new Point(500, 1000);
		double width = 3108;
		double height = 2489;

		CadVportTableObject newView = new CadVportTableObject();
		CadStringParameter cadStringParameter = new CadStringParameter();
		cadStringParameter.init("*Active");
		newView.setName(cadStringParameter);
		newView.getCenterPoint().setX(topLeft.getX() + width / 2f);
		newView.getCenterPoint().setY(topLeft.getY() - height / 2f);
		newView.getViewHeight().setValue(height);;
		newView.getViewAspectRatio().setValue(width / height);

		for (int i = 0; i < cadImage.getViewPorts().size(); i++)
		{
			CadVportTableObject currentView = (CadVportTableObject)(cadImage.getViewPorts().get_Item(i));
			if (cadImage.getViewPorts().size() == 1 || currentView.getName().getValue().equalsIgnoreCase("*active"))
			{
				cadImage.getViewPorts().set_Item(i, newView);
				break;
			}
		}

		// Create an instance of PdfOptions
		PdfOptions pdfOptions = new PdfOptions();
		// Set the VectorRasterizationOptions property
		pdfOptions.setVectorRasterizationOptions(rasterizationOptions);

		dataDir = dataDir + "ConvertDWGToPDFBySupplyingCoordinates_out.pdf";
		//Export the DWG to PDF
		cadImage.save(dataDir, pdfOptions);
            
		//ExEnd:1
		System.out.println("ConvertDWGToPDFBySupplyingCoordinates executed successfully");
       }
}
