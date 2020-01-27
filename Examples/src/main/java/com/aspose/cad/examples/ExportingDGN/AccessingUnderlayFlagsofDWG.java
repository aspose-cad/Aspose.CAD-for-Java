package com.aspose.cad.examples.ExportingDGN;

import com.aspose.cad.examples.Utils.Utils;

public class AccessingUnderlayFlagsofDWG 
{
    public static void main(String[] args)
    {
        //ExStart:AccessingUnderlayFlagsofDWG
      String dataDir = Utils.getDataDir(AccessingUnderlayFlagsofDWG.class) + "DWGDrawings/";
        String fileName = dataDir + "BlockRefDgn.dwg";

        // Load an existing DWG file and convert it into CadImage 
        com.aspose.cad.fileformats.cad.CadImage image = (com.aspose.cad.fileformats.cad.CadImage) com.aspose.cad.Image.load(fileName);

        // Go through each entity inside the DWG file
        for (com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity entity : image.getEntities())
        {

           // Check if entity is of CadDgnUnderlay type
            if (entity instanceof com.aspose.cad.fileformats.cad.cadobjects.CadDgnUnderlay)
            {
                // Access different underlay flags
                com.aspose.cad.fileformats.cad.cadobjects.CadUnderlay underlay = (com.aspose.cad.fileformats.cad.cadobjects.CadUnderlay) entity;
                System.out.println(underlay.getUnderlayPath());
                System.out.println(underlay.getUnderlayName());
                System.out.println(underlay.getInsertionPoint().getX());
                System.out.println(underlay.getInsertionPoint().getY());
                System.out.println(underlay.getRotationAngle());
                System.out.println(underlay.getScaleX());
                System.out.println(underlay.getScaleY());
                System.out.println(underlay.getScaleZ());
                System.out.println((underlay.getFlags() & com.aspose.cad.fileformats.cad.cadobjects.UnderlayFlags.UnderlayIsOn) == com.aspose.cad.fileformats.cad.cadobjects.UnderlayFlags.UnderlayIsOn);
                System.out.println((underlay.getFlags() & com.aspose.cad.fileformats.cad.cadobjects.UnderlayFlags.ClippingIsOn) == com.aspose.cad.fileformats.cad.cadobjects.UnderlayFlags.ClippingIsOn);
                System.out.println((underlay.getFlags() & com.aspose.cad.fileformats.cad.cadobjects.UnderlayFlags.Monochrome) != com.aspose.cad.fileformats.cad.cadobjects.UnderlayFlags.Monochrome);
                break;
            }
        }
    //ExEnd:AccessingUnderlayFlagsofDWG
    }
}
