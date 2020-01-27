
package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;


public class DWGToDWF {
    public static void main(String[] args){ 
        
     //ExStart:DWGToDWF       
      String dataDir = Utils.getDataDir(DWGToDWF.class) + "DWGDrawings/";
      String inputFile = dataDir+ "Line.dwg";
      String outFile = dataDir+ "Line.dwf";
      CadImage cadImage = (CadImage)Image.load(inputFile);
      cadImage.save(outFile);
     //ExEnd:DWGToDWF  
       }  
}
