/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;

/**
 *
 * @author mfazi
 */
public class DWGToDXF {
    
    public static void main(String[] args){ 
  //ExStart:DWGToDXF
    // The path to the resource directory.
   String dataDir = Utils.getDataDir(DWGToDXF.class) + "DWGDrawings/";
   String inputFile = dataDir+ "Line.dwg";
   String outFile = dataDir+ "Line.dxf";
   CadImage cadImage = (CadImage)Image.load(inputFile);
    
    cadImage.save(outFile);
  //ExEnd:DWGToDXF  
    }  
    
}
 

