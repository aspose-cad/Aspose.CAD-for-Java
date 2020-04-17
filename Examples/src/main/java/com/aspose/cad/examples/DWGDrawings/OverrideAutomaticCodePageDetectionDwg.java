/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.CodePages;
import com.aspose.cad.Image;
import com.aspose.cad.LoadOptions;
import com.aspose.cad.MifCodePages;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;


public class OverrideAutomaticCodePageDetectionDwg {
    public static void main(String[] args) {
        //ExStart:1
        String SourceDir = Utils.getDataDir_DWGDrawings();
        String dwgPathToFile = SourceDir + "SimpleEntites.dwg";


        LoadOptions opts = new LoadOptions();
        opts.setSpecifiedEncoding(CodePages.Japanese);
        opts.setSpecifiedMifEncoding(MifCodePages.Japanese);
        opts.setRecoverMalformedCifMif(false);

        CadImage cadImage = (CadImage) Image.load(dwgPathToFile, opts);

        //do export or something else with cadImage

        //ExEnd:1
        System.out.println("OverrideAutomaticCodePageDetectionDwg executed successfully");
    }
}