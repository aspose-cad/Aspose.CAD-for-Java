package com.aspose.cad.examples.ApplyLicense;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadtables.CadLayerTable;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;

public class MeteredLicensing 
{

	public static void main(String[] args) 
        {
		
		// Create an instance of OCR Metered class
        com.aspose.cad.Metered metered = new com.aspose.cad.Metered();

        // Access the setMeteredKey property and pass public and private keys as parameters
        metered.setMeteredKey("<valid pablic key>", "<valid private key>");
        
        // Get consumed qantity value before accessing API
        double quantityOld = com.aspose.cad.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantityOld);

        // DO PROCESSING
        //com.aspose.cad.fileformats.cad.CadImage image = 
        //        (com.aspose.cad.fileformats.cad.CadImage)com.aspose.cad.Image.load("BlockRefDgn.dwg");
        
        
        // Get consumed qantity value after accessing API
        double quantity = com.aspose.cad.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantity());
		

	}

}
