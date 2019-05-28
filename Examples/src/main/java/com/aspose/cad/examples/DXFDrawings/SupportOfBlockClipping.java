/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DXFDrawings;

import com.aspose.cad.Color;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadDrawTypeMode;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

/**
 *
 * @author mfazi
 */
public class SupportOfBlockClipping {
    
    public static void main(String[] args){
        
        //ExStart:SupportOfBlockClipping
        
        // The path to the resource directory.
	String dataDir = Utils.getDataDir(RenderDXFAsPDF.class) + "DXFDrawings/";
        String inputFile = dataDir + "SLS-CW-CD-CE001-R01_blockClip.dxf";
        String outputFile = dataDir + "SLS-CW-CD-CE001-R01_blockClip.pdf";
        
        CadImage cadImage = (CadImage)Image.load(inputFile);
        
        CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setBackgroundColor(Color.getWhite());
        rasterizationOptions.setDrawType(CadDrawTypeMode.UseObjectColor);
        rasterizationOptions.setPageWidth(1200);
        rasterizationOptions.setPageHeight(1600);
        rasterizationOptions.setBorderX(30);
        rasterizationOptions.setBorderY(5);
//        rasterizationOptions.setCenterDrawing(true);
        rasterizationOptions.setLayouts( new String[] { "Model" } );
        
        
        
        PdfOptions pdfOptions = new PdfOptions();
        pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
        
        cadImage.save(outputFile, pdfOptions);
        
        //ExEnd:SupportOfBlockClipping
        
    }
    
}
