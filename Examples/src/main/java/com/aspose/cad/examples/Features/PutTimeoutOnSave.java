package com.aspose.cad.examples.Features;

import com.aspose.cad.Image;
import com.aspose.cad.InterruptionTokenSource;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

import java.util.concurrent.TimeUnit;

public class PutTimeoutOnSave {

    public static void main(String[] args) throws InterruptedException {
        //ExStart:1
        final String SourceDir = Utils.getDataDir_DWGDrawings();
        final String OutputDir = Utils.getDataDir_Output();
        final InterruptionTokenSource source = new com.aspose.cad.InterruptionTokenSource();
        try {
            final CadImage cadImageBig = (CadImage)Image.load(SourceDir + "Drawing11.dwg");
            try {
                CadRasterizationOptions rasterizationOptionsBig = new CadRasterizationOptions();
                rasterizationOptionsBig.setPageWidth(cadImageBig.getSize().getWidth() / 2);
                rasterizationOptionsBig.setPageHeight(cadImageBig.getSize().getHeight() / 2);

                final PdfOptions CADfBig = new PdfOptions();
                CADfBig.setVectorRasterizationOptions(rasterizationOptionsBig);
                CADfBig.setInterruptionToken(source.getToken());

                java.lang.Thread thread = new java.lang.Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            cadImageBig.save(OutputDir + "PutTimeoutOnSave_out.pdf", CADfBig);
                        } catch (Throwable th) {
                            System.out.println("interrupted !!!");
                        }
                    }
                });

                thread.start();
                TimeUnit.SECONDS.sleep(3);
                source.interrupt();
                thread.join();
            } finally {
                cadImageBig.dispose();
            }
        } finally {
            source.dispose();
        }
        //ExEnd:1
    }
}
