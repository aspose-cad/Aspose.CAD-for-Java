package com.aspose.cad.examples.DWGDrawings;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadUnderlay;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class ReadXREEFMetaData {

	public static void main(String[] args) {
		
            // The path to the resource directory.
            String dataDir = Utils.getDataDir(ReadXREEFMetaData.class) + "DWGDrawings/";
	    //ExStart:ReadXREEFMetaData
            CadImage image = (CadImage)Image.load(dataDir+"Bottom_plate.dwg");
            {
                for (CadBaseEntity entity : image.getEntities())
                {
                    if (entity instanceof CadUnderlay)
                    {
                        //XREF entity with metadata
                        Cad3DPoint insertionPoint = ((CadUnderlay) entity).getInsertionPoint();
                        String path = ((CadUnderlay) entity).getUnderlayPath();
                    }
                }
            }	
	//ExEnd:ReadXREEFMetaData
       }
}
