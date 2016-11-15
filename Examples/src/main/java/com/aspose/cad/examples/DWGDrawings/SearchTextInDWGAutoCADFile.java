package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.CadLayoutDictionary;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadBlockEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadText;
import com.aspose.cad.fileformats.cad.cadtables.CadBlockTableObject;

public class SearchTextInDWGAutoCADFile {

	private static final String dataDir = Utils.getDataDir(SearchTextInDWGAutoCADFile.class) + "DWGDrawings/";

	public static void main(String[] args) {
		// Search Text In DWG AutoCAD File
		searchTextInDWGAutoCADFile();
		
		// Search For Text In Specific Layout
		searchForTextInSpecificLayout();
	}

	private static void searchTextInDWGAutoCADFile() {

		// Load an existing DWG file as CadImage.
		CadImage cadImage = (CadImage) CadImage.load(dataDir + "sample_file.dwg");

		// Search for text in the file
		for (CadBaseEntity entity : cadImage.getEntities()) {
			// Please note that we iterate through CadText entities here, but some other entities
			// may contain text also, e.g. CadMText and others
			if (entity.getClass() == CadText.class) {
				CadText text = (CadText) entity;
				System.out.println(text.getDefaultValue());
			}
		}
	}
	
	private static void searchForTextInSpecificLayout() {

        // Load an existing DWG file as CadImage.
        CadImage cadImage = (CadImage) CadImage.load(dataDir + "sample_file.dwg");
        
        // get all layout names and link each layout with corresponding block with entities
        CadLayoutDictionary layouts = cadImage.getLayouts();
        String[] layoutNames = new String[layouts.size()];
        int i = 0;
        
        for (com.aspose.cad.fileformats.cad.cadobjects.CadLayout layout : layouts.getValues()) {
            layoutNames[i++] = layout.getLayoutName();
            System.out.println("Layout " + layout.getLayoutName() + " is found");

            // find block, applicable for DWG only
            CadBlockTableObject blockTableObjectReference = null;
            for (CadBlockTableObject tableObject : cadImage.getBlocksTables()) {
                if (String.CASE_INSENSITIVE_ORDER.compare(tableObject.getHardPointerToLayout(), layout.getObjectHandle()) == 0) {
                    blockTableObjectReference = tableObject;
                    break;
                }
            }

            // Collection cadBlockEntity.Entities contains information about all entities on specific layout
            // if this collection has no elements it means layout is a copy of Model layout and contains the same entities
            // Below line of code is for reference
            CadBlockEntity cadBlockEntity = cadImage.getBlockEntities().get_Item(blockTableObjectReference.getBlockName());
        }
    }

}
