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

	private static void searchTextInDWGAutoCADFile() {
      
        // Load an existing DWG file as CadImage.
       CadImage cadImage = (CadImage) CadImage.load(dataDir + "sample_file2.dwg");
        // Search for text in the file
        for (CadBaseEntity entity : cadImage.getEntities()) {
	// Please, note: we iterate through CadText entities here, but some other entities may contain text also, e.g. CadMText and others
             IterateCADNodes(entity);
        }
}
	
      public static void IterateCADNodes(CadBaseEntity obj)
{
    if (obj.getClass() == CadText.class)
 
     {
        CadText childObj = (CadText)obj;

        if (childObj.getChildObjects().size() != 0)
        {
            for (CadBaseEntity tempobj : childObj.getChildObjects())
            {
                IterateCADNodes(tempobj);
            }
        }
        else
        {
            System.out.println(childObj.getDefaultValue());
        }
    }
    else   if (obj.getClass() == CadMText.class)
    {
        CadMText childObj = (CadMText)obj;

        if (childObj.getChildObjects().size() != 0)
        {
            for (CadBaseEntity tempobj : childObj.getChildObjects())
            {
                IterateCADNodes(tempobj);
            }
        }                
        else
        {
            System.out.println(childObj.getText());
        }
    }
    else   if (obj.getClass() == CadInsertObject.class)
    {
        CadInsertObject childObj = (CadInsertObject)obj;
        if (childObj.getChildObjects().size() != 0)
        {
            for (CadBaseEntity tempobj : childObj.getChildObjects())
            {
                IterateCADNodes(tempobj);
            }
        }
        else
        {
            if (childObj.getTypeName() == CadEntityTypeName.ATTDEF)
            {
                System.out.println(((CadAttDef)((CadBaseEntity)childObj)).getDefaultString());
            }
            else if (childObj.getTypeName() == CadEntityTypeName.ATTRIB)
            {
                System.out.println(((CadAttrib)((CadBaseEntity)childObj)).getDefaultText());
            }
        }
    }
}

ExEnd:SearchTextInDWGAutoCADFile