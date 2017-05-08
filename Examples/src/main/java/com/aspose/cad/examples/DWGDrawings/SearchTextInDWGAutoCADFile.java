package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.CadLayoutDictionary;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadBlockEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadText;
import com.aspose.cad.fileformats.cad.cadtables.CadBlockTableObject;

public class SearchTextInDWGAutoCADFile {

      ExStart:SearchTextInDWGAutoCADFile
	private static final String dataDir = Utils.getDataDir(SearchTextInDWGAutoCADFile.class) + "DWGDrawings/";

	public static void main(String[] args) {
		// Search Text In DWG AutoCAD File
		searchTextInDWGAutoCADFile();
		
		// Search For Text In Specific Layout
		searchForTextInSpecificLayout();
	}

	public static void searchTextInDWGAutoCADFile() 
{ 
    String  dataDir="Test_Apsose.CAD\\";
     // Load an existing DWG file as CadImage.
     CadImage cadImage = (CadImage) CadImage.load(dataDir + "sample_file3.dwg");
     for (CadBaseEntity entity : cadImage.getEntities()) 
     {
       IterateCADNodeEntities(entity); 
     } 

    // Search for text in the block section 
    for (CadBlockEntity blockEntity : cadImage.getBlockEntities().getValues())
    { 
        for (CadBaseEntity entity : blockEntity.getEntities())
        { 
            IterateCADNodeEntities(entity); 
        } 
    } 
} 
//Recursive function to iterate nodes inside nodes
private static void IterateCADNodeEntities(CadBaseEntity obj) 
{ 
    switch (obj.getTypeName())
    { 
        case CadEntityTypeName.TEXT: 
            CadText childObjectText = (CadText) obj; 

            System.out.println(childObjectText.getDefaultValue()); 

            break; 

        case CadEntityTypeName.MTEXT: 
            CadMText childObjectMText = (CadMText) obj; 

            System.out.println(childObjectMText.getText()); 

            break; 

        case CadEntityTypeName.INSERT: 
            CadInsertObject childInsertObject = (CadInsertObject) obj; 

            for (CadBaseEntity tempobj : childInsertObject.getChildObjects())
            { 
                IterateCADNodes(tempobj); 
            } 
            break; 

        case CadEntityTypeName.ATTDEF: 
            CadAttDef attDef = (CadAttDef) obj; 

            System.out.println(attDef.getDefaultString()); 
            break; 

        case CadEntityTypeName.ATTRIB: 
            CadAttrib attAttrib = (CadAttrib) obj; 

            System.out.println(attAttrib.getDefaultText()); 
            break; 
    } 
}

ExEnd:SearchTextInDWGAutoCADFile