package com.aspose.cad.examples.ExportingDGN;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.dgn.DgnElementType;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.fileformats.dgn.dgnelements.DgnDrawingElementBase;



public class SupportedDGNElements
{
    public static void main(String[] args)
    {
         
        // Input and Output file paths
        String fileName = "BlockRefDgn.dwg";
        String outPath = "BlockRefDgn.dwg.pdf";
       //ExStart:SupportedDGNElements
        String dataDir = Utils.getDataDir(SupportedDGNElements.class) + "ExportingDGN/";
        DgnImage dgnImage = (DgnImage)Image.load(dataDir);
        {
            for (DgnDrawingElementBase element : dgnImage.getElements())
            {
                switch (element.getMetadata().getType())
                {
                    case DgnElementType.Line:
                    case DgnElementType.Ellipse:
                    case DgnElementType.Curve:
                    case DgnElementType.BSplineCurveHeader:
                    case DgnElementType.Arc:
                    case DgnElementType.Shape:
                    case DgnElementType.PolyLine:
                    case DgnElementType.TextNode:
                    case DgnElementType.Text:
                    case DgnElementType.ComplexShapeHeader:
                    case DgnElementType.ComplexChainHeader:
                    {
                        //previously supported entities, now supported also for 3D
                        break;
                    }

                    case DgnElementType.SolidHeader3D:
                    case DgnElementType.Cone:
                    case DgnElementType.CellHeader:
                    {
                        //supported 3D entities
                        break;
                    }
                }
         //ExEnd:SupportedDGNElements   
         }
        }
    }
}
