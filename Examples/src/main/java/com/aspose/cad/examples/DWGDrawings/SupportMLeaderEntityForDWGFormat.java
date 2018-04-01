package com.aspose.cad.examples.DWGDrawings;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadobjects.CadMLeader;
import com.aspose.cad.fileformats.cad.cadobjects.CadMLeaderContextData;
import com.aspose.cad.fileformats.cad.cadobjects.CadMLeaderLine;
import com.aspose.cad.fileformats.cad.cadobjects.CadMLeaderNode;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class SupportMLeaderEntityForDWGFormat {

	public static void main(String[] args) 
        {
		
		// The path to the resource directory.
       
            String dataDir = Utils.getDataDir(SupportMLeaderEntityForDWGFormat.class) + "DWGDrawings/";
	    //ExStart:SupportMLeaderEntityForDWGFormat
       
            String file = "file path";
            Image image = Image.load(file);
            {
                // Test
                CadImage cadImage = (CadImage)image;

  
               Assert.areNotEqual(cadImage.getEntities().length, 0);
                CadMLeader cadMLeader = (CadMLeader)cadImage.getEntities()[0];

                Assert.areEqual(cadMLeader.getStyleDescription(), "Standard");
                Assert.areEqual(cadMLeader.getLeaderStyleId(), "12E");
                Assert.areEqual(cadMLeader.getArrowHeadId1(), "639");
                Assert.areEqual(cadMLeader.getLeaderLineTypeID(), "14");

                CadMLeaderContextData context = cadMLeader.getContextData();

                Assert.areEqual(context.getArrowHeadSize(), 30.0, 0.1);
                Assert.areEqual(context.getBasePoint().getX(), 481, 1);
                Assert.areEqual(context.getContentScale(), 1.0, 0.01);
                Assert.areEqual(context.getDefaultText().getValue(), "This is multileader with huge text\\P{\\H1.5x;6666666666666666666666666666\\P}bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
                Assert.areEqual(context.hasMText(), true);

                CadMLeaderNode mleaderNode = context.getLeaderNode();

                Assert.areEqual(mleaderNode.getLastLeaderLinePoint().getX(), 473, 1);
                CadMLeaderLine leaderLine = mleaderNode.getLeaderLine();

                Assert.areEqual(leaderLine.getBreakEndPoint().toString(), null);
                Assert.areEqual(Integer.toString(leaderLine.getBreakPointIndex().getValue()), Integer.toString(0));
                Assert.areEqual(leaderLine.getBreakStartPoint().toString(), null);
                Assert.areEqual(Integer.toString(leaderLine.getLeaderLineIndex().getValue()), Integer.toString(0));
                Assert.areEqual(Integer.toString(leaderLine.getLeaderPoints().size()), Integer.toString(4));

                Assert.areEqual(Integer.toString(mleaderNode.getBranchIndex()), Integer.toString(0));


                Assert.areEqual(mleaderNode.getDogLegLength(), 8.0, 0.1);

                Assert.areEqual(context.hasMText(), true);
                
              //  Assert.IsTrue((context.hasMText()==true , "Invalid Z value");
                Assert.areEqual(context.getTextAttachmentType().getValue(), (short)1);
                Assert.areEqual(context.getTextBackgroundColor().getValue(), 18);
                Assert.areEqual(context.getTextHeight(), 20.0, 0.1);
                Assert.areEqual(context.getTextStyleID().getValue(), "11");
                Assert.areEqual(context.getTextRotation().getValue(), 0.0, 0.01);

                Assert.areEqual(cadMLeader.getArrowHeadId1(), "639");
                Assert.areEqual(cadMLeader.getLeaderType(), 1);
                Assert.areEqual(cadMLeader.getBlockContentColor(), 0);
                Assert.areEqual(cadMLeader.getLeaderLineColor(), 0);
                Assert.areEqual(cadMLeader.getTextHeight(), 1.0, 0.01);

//ExEnd:SupportMLeaderEntityForDWGFormat
    }
}
}
         