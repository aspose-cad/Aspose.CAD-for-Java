
package com.aspose.cad.examples.DXFDrawings;


import com.aspose.cad.Color;
import com.aspose.cad.Image;
import com.aspose.cad.examples.CADConversion.PenSupportInExport;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import java.io.File;
public class SaveDXFFiles {
    
public static void main(String[] args){
    //ExStart:SaveDXFFiles

        String dataDir = Utils.getDataDir(SaveDXFFiles.class) + "CADConversion/";
        String srcFile = dataDir + "conic_pyramid.dxf";    
        //String dir = GetFileFromDesktop("");
        File dirFile = new File(dataDir);
        
        for (final File fileEntry : dirFile.listFiles()) 
        {
            if (fileEntry.getAbsolutePath().toLowerCase().endsWith(".dxf"))
            {
                SaveDxf(fileEntry.getAbsolutePath(), dataDir + fileEntry.getName() + "_updated.dxf");
            }
        }

//ExEnd:SaveDXFFiles

}

    private static String GetFileFromDesktop(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void SaveDxf(String absolutePath, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}