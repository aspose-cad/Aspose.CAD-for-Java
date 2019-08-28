/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.SvgOptions;
import com.aspose.cad.imageoptions.svgoptionsparameters.SvgColorMode;


public class ExportToSVG {
    
    public static void main(String[] args){ 
       //ExStart:ExportToSVG
        // The path to the resource directory.
       String dataDir = Utils.getDataDir(ExportToSVG.class) + "DWGDrawings/";
        Image image = Image.load(dataDir + "meshes.dwg");
        {
            SvgOptions options = new SvgOptions();
            options.setColorType(SvgColorMode.Grayscale);
            options.setTextAsShapes(true);
            image.save(dataDir + "meshes.svg");
        }
    //ExEnd:ExportToSVG
    }
    
}
