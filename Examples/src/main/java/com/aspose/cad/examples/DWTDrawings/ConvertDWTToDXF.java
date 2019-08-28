package com.aspose.cad.examples.DWTDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;


public class ConvertDWTToDXF {
    
    public static void main(String[] args){ 
    
    String dataDir = Utils.getDataDir(ConvertDWTToDXF.class) + "DWTDrawings/";  
    
    CadImage cadImage = (CadImage)Image.load(dataDir + "sample.dwt");
    String outFile = dataDir+ "example.dxf";
    cadImage.save(outFile);
    
    }
    
    
}
