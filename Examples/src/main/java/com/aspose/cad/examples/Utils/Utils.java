package com.aspose.cad.examples.Utils;

import java.io.File;

public class Utils {

        public static String getDataDir(Class c) {
                File dir = new File(System.getProperty("user.dir"));
                dir = new File(dir, "src");
                dir = new File(dir, "main");
                dir = new File(dir, "resources");

                return dir.toString() + File.separator;
        }

        public static String getDataDir_Output() {
                File dir = new File(System.getProperty("user.dir"));
                dir = new File(dir, "src");
                dir = new File(dir, "main");
                dir = new File(dir, "resources");

                return dir.toString() + File.separator + "01_OutputDirectory" + File.separator;
        }

        public static String getDataDir_DWGDrawings() {
                File dir = new File(System.getProperty("user.dir"));
                dir = new File(dir, "src");
                dir = new File(dir, "main");
                dir = new File(dir, "resources");

                return dir.toString() + File.separator + "DWGDrawings" + File.separator;
        }

        public static String getDataDir_DXFDrawings() {
                File dir = new File(System.getProperty("user.dir"));
                dir = new File(dir, "src");
                dir = new File(dir, "main");
                dir = new File(dir, "resources");

                return dir.toString() + File.separator + "DXFDrawings" + File.separator;
        }

        public static String getDataDir_DWFXDrawings() {
                File dir = new File(System.getProperty("user.dir"));
                dir = new File(dir, "src");
                dir = new File(dir, "main");
                dir = new File(dir, "resources");

                return dir.toString() + File.separator + "DWFXDrawings" + File.separator;
        }
}
