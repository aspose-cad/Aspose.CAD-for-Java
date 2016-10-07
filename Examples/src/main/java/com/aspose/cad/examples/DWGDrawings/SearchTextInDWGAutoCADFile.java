package com.aspose.cad.examples.DWGDrawings;

import java.util.ArrayList;
import java.util.HashMap;

import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.CadLayoutDictionary;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.CadLayout;
import com.aspose.cad.fileformats.cad.cadobjects.CadText;

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
		CadImage cadImage = (CadImage) CadImage.load(dataDir + "sample.dwg");

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
		CadImage cadImage = (CadImage) CadImage.load(dataDir + "sample.dwg");

		// Get all layout names and separate entities between layouts by their soft owners
		CadLayoutDictionary layoutsDxf = cadImage.getLayouts();
		String[] layoutDxfNames = new String[layoutsDxf.size()];
		int j = 0;

		HashMap<String, ArrayList<CadBaseEntity>> entitiesOnLayouts = new HashMap<String, ArrayList<CadBaseEntity>>();

		for (CadLayout layout : layoutsDxf.getValues()) {
			layoutDxfNames[j++] = layout.getLayoutName();
			System.out.println("Layout " + layout.getLayoutName() + " is found");
			entitiesOnLayouts.put(layout.getBlockTableRecordHandle(), new ArrayList<CadBaseEntity>());
		}

		for (CadBaseEntity entity : cadImage.getEntities()) {
			entitiesOnLayouts.get(entity.getSoftOwner()).add(entity);
		}
		
		cadImage.save (dataDir + "SearchForTextInSpecificLayout_Out.dwg");
	}

}
