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
import com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseObject;
import com.aspose.cad.fileformats.cad.cadobjects.CadRasterImage;
import com.aspose.cad.fileformats.cad.cadobjects.CadRasterImageDef;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;


public class ImportImageToDWG {
    
public static void main(String[] args) {


        String dataDir = Utils.getDataDir(ImportImageToDWG.class) + "DWGDrawings/";
        //ExStart:ImportImageToDWG
        String srcFile = dataDir + "conic_pyramid.dxf";

        Image image = Image.load(srcFile);

        CadRasterImageDef cadRasterImageDef = new CadRasterImageDef();
        cadRasterImageDef.setObjectHandle("A3B4");
        cadRasterImageDef.setFileName("road-sign-custom.png");
        CadRasterImage cadRasterImage = new CadRasterImage();
        cadRasterImage.setImageDefReference("A3B4");
        cadRasterImage.getInsertionPoint().setX(26.77);
        cadRasterImage.getInsertionPoint().setY(22.35);
        cadRasterImage.setDisplayFlags((short)7);
        cadRasterImage.setImageSizeU(640);
        cadRasterImage.setImageSizeV(562);
        cadRasterImage.getUVector().setX(0.0061565450840500831);
        cadRasterImage.getUVector().setY(0);
        cadRasterImage.getVVector().setX(0);
        cadRasterImage.getVVector().setY(0.0061565450840500822);
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
//        cadRasterizationOptions.setCenterDrawing(true);
        cadRasterizationOptions.setPageHeight(1600);
        cadRasterizationOptions.setPageWidth(1600);
        cadRasterizationOptions.setLayouts(new String[] {"Model"});

        image.save((srcFile + "_generated.pdf"), pdfOptions);
        //ExEnd:ImportImageToDWG
    }
}