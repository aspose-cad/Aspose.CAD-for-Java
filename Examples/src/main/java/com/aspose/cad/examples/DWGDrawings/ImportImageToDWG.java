/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.DXFDrawings.RenderDXFAsPDF;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadDrawTypeMode;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadobjects.*;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;


public class ImportImageToDWG {
    
public static void main(String[] args) {


        String dataDir = Utils.getDataDir(ImportImageToDWG.class) + "DWGDrawings/";
        //ExStart:ImportImageToDWG
        String srcFile = dataDir + "Drawing11.dwg";

        Image image = Image.load(srcFile);

        CadRasterImageDef cadRasterImageDef = new CadRasterImageDef("road-sign-custom.png", 640, 562);
        cadRasterImageDef.setObjectHandle("A3B4");

        Cad3DPoint insertionPoint = new Cad3DPoint(26.77, 22.35);
        Cad3DPoint uVector = new Cad3DPoint(0.0061565450840500831, 0);
        Cad3DPoint vVector = new Cad3DPoint(0, 0.0061565450840500822);

        CadRasterImage cadRasterImage = new CadRasterImage(cadRasterImageDef, insertionPoint, uVector, vVector);
        cadRasterImage.setImageDefReference("A3B4");
        cadRasterImage.setDisplayFlags((short)7);
        cadRasterImage.setClippingState((short)0);
        cadRasterImage.getClipBoundaryVertexList().add(new Cad2DPoint(-0.5, 0.5));
        cadRasterImage.getClipBoundaryVertexList().add(new Cad2DPoint(639.5, 561.5));

        CadImage cadImage = ((CadImage)(image));
        cadImage.getBlockEntities().get_Item("*Model_Space").addEntity(cadRasterImage);
        CadBaseObject[] objs = cadImage.getObjects();
        CadBaseObject[] arr = new CadBaseObject[objs.length + 1];
        int ind = 0;

        for (CadBaseObject obj : objs)
        {
            arr[ind] = obj;
            ind++;
        }

        arr[ind] = cadRasterImageDef;
        cadImage.setObjects(arr);
        PdfOptions pdfOptions = new PdfOptions();
        CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
        pdfOptions.setVectorRasterizationOptions(cadRasterizationOptions);
        cadRasterizationOptions.setDrawType(CadDrawTypeMode.UseObjectColor);
 
        cadRasterizationOptions.setPageHeight(1600);
        cadRasterizationOptions.setPageWidth(1600);
        cadRasterizationOptions.setLayouts(new String[] {"Model"});

        image.save((srcFile + "_generated.pdf"), pdfOptions);
        //ExEnd:ImportImageToDWG
    }
}