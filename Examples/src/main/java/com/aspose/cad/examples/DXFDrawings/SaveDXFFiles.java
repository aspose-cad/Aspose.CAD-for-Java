
package com.aspose.cad.examples.DXFDrawings;


import com.aspose.cad.Color;
import com.aspose.cad.Image;
import com.aspose.cad.examples.CADConversion.PenSupportInExport;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import java.io.File;
public class SaveDXFFiles {
    
public static void main(String[] args){
    //ExStart:SaveDXFFiles

        String dataDir = Utils.getDataDir(SaveDXFFiles.class) + "CADConversion/";
        String srcFile = dataDir + "conic_pyramid.dxf";    
        
        CadImage cadImage = (CadImage)Image.load(srcFile);
        cadImage.save(dataDir+"conic.dxf");

//ExEnd:SaveDXFFiles

}

}