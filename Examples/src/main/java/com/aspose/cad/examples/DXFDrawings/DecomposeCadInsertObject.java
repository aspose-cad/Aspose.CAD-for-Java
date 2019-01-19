package com.aspose.cad.examples.DXFDrawings;

import com.aspose.cad.Color;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadBlockEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadInsertObject;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadconsts.CadEntityTypeName;
import java.util.ArrayList;
import java.util.List;

public class DecomposeCadInsertObject {

	public static void main(String[] args) 
        {
		
            // The path to the resource directory.
            String dataDir = Utils.getDataDir(DecomposeCadInsertObject.class) + "DXFDrawings/";
            //ExStart:DecomposeCadInsertObject

            String srcFile = dataDir + "conic_pyramid.dxf";

            CadImage cadImage =(CadImage) Image.load(srcFile);
            
            try
            {
                for (int i=0; i<cadImage.getEntities().length;i++)
                {
                    if (cadImage.getEntities()[i].getTypeName() == CadEntityTypeName.INSERT)
                    {
                        CadBlockEntity block =
                            (CadBlockEntity)cadImage.getBlockEntities().get_Item(((CadInsertObject)cadImage.getEntities()[i]).getName());
                        for (CadBaseEntity blockChild : block.getEntities())
                        {
                            // process entities
                        }
                    }

                }
            }
            finally
            {
                cadImage.dispose();
            }
            //ExEnd:DecomposeCadInsertObject
      
	
	}
	
}
