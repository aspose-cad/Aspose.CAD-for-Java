
package com.aspose.cad.examples.CADConversion;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.CadLayoutDictionary;
import com.aspose.cad.fileformats.cad.cadobjects.CadLayout;


public class ListLayouts {

    public static void main(String[] args) 
    {
       //ExStart:ListLayouts
       String dataDir = Utils.getDataDir(ListLayouts.class) + "CADConversion/";
       String sourceFilePath = dataDir + "conic_pyramid.dxf";
     
       Image image = Image.load(sourceFilePath);
       
       CadImage cadImage = (CadImage)image;
       
        CadLayoutDictionary layouts = cadImage.getLayouts();
        for (CadLayout layout : layouts.getValues())
        {
                    
            System.out.println("Layout " +layout.getLayoutName());
        }
       
       //ExEnd:ListLayouts
    }
}
