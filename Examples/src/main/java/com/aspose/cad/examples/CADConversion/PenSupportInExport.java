/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.imageoptions.PenOptions;
import com.aspose.cad.internal.imaging.LineCap;

public class PenSupportInExport {

   public static void main(String[] args) {
//ExStart:PenSupportInExport
    String dataDir = Utils.getDataDir(PenSupportInExport.class) + "CADConversion/";
    String srcFile = dataDir + "conic_pyramid.dxf";
    CadImage cadImage = ((CadImage)(Image.load(srcFile)));
    CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
    rasterizationOptions.setPageWidth(cadImage.getWidth() * 100);
    rasterizationOptions.setPageHeight(cadImage.getHeight() * 100);
    PdfOptions pdfOptions = new PdfOptions();
    // Here user can change default start cap and end cap of pens when exporting CadImage object to
    // image. It can be using for all image formats: pdf, png, bmp, gif, jpeg2000, jpeg, psd, tiff, wmf.
    // If user doesn't use PenOptions, system will use its own default pens (different in defferent places).
    PenOptions penOts = new PenOptions();
    penOts.setStartCap(LineCap.Flat);
    penOts.setEndCap(LineCap.Flat);
    //rasterizationOptions.setPenOptions(penOts);
    pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
    cadImage.save((dataDir+"9LHATT-A56_generated.pdf"),pdfOptions);

//ExEnd:PenSupportInExport
}
}