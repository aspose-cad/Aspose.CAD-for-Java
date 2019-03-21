/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DXFDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadconsts.CadEntityTypeName;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadText;
import com.aspose.cad.fileformats.cad.cadtables.CadStyleTableObject;
import java.io.File;
import static java.lang.System.in;

/**
 *
 * @author mfazi
 */
public class ExportImagesToDXF {
    
    public static void main(String[] args){
    
        //ExStart:ExportImagesToDXF
        // The path to the resource directory.
	String dataDir = Utils.getDataDir(RenderDXFAsPDF.class) + "DXFDrawings/";
        
        File[] files = new File(dataDir).listFiles();
        for (File file : files) {
            
            String extension = GetFileExtension(file);
            if(extension == ".dxf"){
            
                // ****************************
                //  Set new font per document
                // ****************************
                CadImage cadImage = (CadImage)Image.load(file.getName());
                 for (Object style : cadImage.getStyles()) {                     
                    //  Set font name
                    ((com.aspose.cad.fileformats.cad.cadtables.CadStyleTableObject)style).setPrimaryFontName("Broadway");
                }
                 cadImage.save(file.getName() + "_font.dxf");
                 
                // ****************************
                //  Hide all "straight" lines
                // ****************************
                 CadImage cadImageEntity = (CadImage)Image.load(file.getName());
                 for (CadBaseEntity entity : cadImageEntity.getEntities()) {
                    //  Make lines invisible
                    if ((entity.getTypeName() == CadEntityTypeName.LINE)) {
                        entity.setVisible((short)0);
                    }
                 }
                 cadImageEntity.save(file.getName() + "_lines.dxf");
                 
                // ****************************
                //  Manipulations with text
                // ****************************
                 
                CadImage cadImageText = (CadImage)Image.load(file.getName());
                for (CadBaseEntity entity : cadImageText.getEntities()) {
                    //  Make lines invisible
                    if ((entity.getTypeName() == CadEntityTypeName.TEXT)) {
                        ((CadText)entity).setDefaultValue("New text here!!! :)");
                            break;
                    }
                 }
                cadImageText.save(file.getName() + "_text.dxf");
                
            }//If extension = .dxf            
        }        
        
        //ExEnd:ExportImagesToDXF
        
    }
    
    //ExStart:GetFileExtension
    private static String GetFileExtension(File file) {
        String extension = "";
 
        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
            }
        } catch (Exception e) {
            extension = "";
        }
 
        return extension;
 
    }
    //ExEnd:GetFileExtension
}
