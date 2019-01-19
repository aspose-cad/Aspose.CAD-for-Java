package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.*;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
//import java.awt.Image;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.Image;
import com.aspose.cad.fileformats.cad.cadconsts.CadEntityTypeName;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.polylines.CadPolyFaceMesh;
import com.aspose.cad.fileformats.cad.cadobjects.polylines.CadPolygonMesh;
import java.util.ArrayList;
import java.util.List;

public class MeshSupportForDWG {
    

    public static void main(String[] args) 
    {
        // The path to the resource directory.
        String dataDir = Utils.getDataDir(MeshSupportForDWG.class) + "DWGDrawings/";
        //ExStart:MeshSupportForDWG
        String srcFile = dataDir + "meshes.dwg";

        // com.aspose.cad. objImage = com.aspose.cad.CImage.load(srcFile);
        CadImage cadImage =(CadImage) com.aspose.cad.Image.load(srcFile);
         
        try
        {
            for (CadBaseEntity entity : cadImage.getEntities())
            {
                if (entity instanceof CadPolyFaceMesh)
                {
                  CadPolyFaceMesh asFaceMesh= (CadPolyFaceMesh)entity;

                  if (asFaceMesh != null)
                  {
                      System.out.println("Vetexes count: " + asFaceMesh.getMeshMVertexCount());
                  }
                }
                else if (entity instanceof CadPolygonMesh)
                {
                    CadPolygonMesh asPolygonMesh= (CadPolygonMesh)entity;

                    if (asPolygonMesh != null)
                    {
                      System.out.println("Vetexes count: " + asPolygonMesh.getMeshMVertexCount());
                   }
                }
            }
        }
        finally
        {
            cadImage.dispose();
        }
        //ExEnd:MeshSupportForDWG
    }
}
