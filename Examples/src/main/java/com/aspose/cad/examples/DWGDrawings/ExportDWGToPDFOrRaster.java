package com.aspose.cad.examples.DWGDrawings;
import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import com.aspose.cad.imageoptions.UnitType;

public class ExportDWGToPDFOrRaster {

	public static void main(String[] args) {
		
		// The path to the resource directory.
		String dataDir = Utils.getDataDir(ExportDWGToPDFOrRaster.class) + "DWGDrawings/";
	    //ExStart:ExportDWGToPDFOrRaster
         	String srcFile = dataDir + "visualization_-_conference_room.dwg";
       		

                  com.aspose.cad.Image objImage = com.aspose.cad.Image.load("example.dxf");
                
                 Boolean currentUnitIsMetric = IsMetric(objImage.getUnitType());
                      
                Double currentUnitCoefficient = Coefficient(objImage.getUnitType());
                       // getUnitType());
                 
               if (currentUnitIsMetric)
            {
               double metersCoeff = 1 / 1000.0;
               double scaleFactor = metersCoeff / currentUnitCoefficient;
             CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
               rasterizationOptions.setPageWidth((float)(210 * scaleFactor));
               rasterizationOptions.setPageHeight((float)(297 * scaleFactor));
               rasterizationOptions.setUnitType(UnitType.Millimeter);
           }
        else
           {
               
              CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
              rasterizationOptions.setPageWidth((float)(8.27f / currentUnitCoefficient));
              rasterizationOptions.setPageHeight((float)(11.69f / currentUnitCoefficient));
              rasterizationOptions.setUnitType(UnitType.Inch);
            }



         public static Boolean IsMetric(int initial){
         
            Boolean isMetric = true;
		 
            switch (initial)
{
          case UnitType.Inch:
          case UnitType.MicroInch:
          case UnitType.Mil:
          case UnitType.Foot:
          case UnitType.Yard:
          case UnitType.Mile:
          case UnitType.Unitless:
          isMetric = false;
}
         	 
return isMetric;
}
	 
private Double Coefficient(int unitType)
{
         Double coefficient = 1.0;

         switch (unitType)
         {
             case UnitType.Parsec:
                 coefficient = 3.0857 * 10000000000000000.0;
                 break;
            case UnitType.LightYear:
                 coefficient = 9.4607 * 1000000000000000.0;
                 break;
             case UnitType.AstronomicalUnit:
                 coefficient = 1.4960 * 100000000000.0;
                 break;
             case UnitType.Gigameter:
                 coefficient = 1000000000.0;
                 break;
             case UnitType.Kilometer:
                 coefficient = 1000.0;
                 break;
             case UnitType.Decameter:
                 coefficient = 10.0;
                 break;
             case UnitType.Hectometer:
                 coefficient = 100.0;
                 break;
             case UnitType.Meter:
                 coefficient = 1.0;
                 break;
             case UnitType.Centimenter:
                 coefficient = 0.01;
                 break;
             case UnitType.Decimeter:
                 coefficient = 0.1;
                 break;
             case UnitType.Millimeter:
                 coefficient = 0.001;
                 break;
             case UnitType.Micrometer:
                 coefficient = 0.000001;
                 break;
             case UnitType.Nanometer:
                 coefficient = 0.000000001;
                 break;
             case UnitType.Angstrom:
                 coefficient = 0.0000000001;
                 break;
             case UnitType.Inch:
                 coefficient = 1.0;
                 break;
             case UnitType.MicroInch:
                 coefficient = 0.000001;
                 break;
             case UnitType.Mil:
                 coefficient = 0.001;
                 break;
             case UnitType.Foot:
                 coefficient = 12.0;
                 break;
             case UnitType.Yard:
                 coefficient = 36.0;
                 break;
             case UnitType.Mile:
                 coefficient = 63360.0;
                 break;
         }
         
         return coefficient;
        }
	   //ExEnd:ExportDWGToPDFOrRaster
        }

    
