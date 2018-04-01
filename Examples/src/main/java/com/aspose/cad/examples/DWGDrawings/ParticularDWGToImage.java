/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.cad.examples.DWGDrawings;

import com.aspose.cad.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadconsts.CadEntityTypeName;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ParticularDWGToImage {
    
public static void main(String[] args) {

    //ExStart:ParticularDWGToImage
        String dataDir = Utils.getDataDir(ParticularDWGToImage.class) + "DWGDrawings/";
        String srcFile = dataDir + "visualization_-_conference_room.dwg";
            //String sourceFilePath = ("BaseAltimetria.dwg");
        CadImage cadImage = ((CadImage)(Image.load(srcFile)));
        CadBaseEntity[] entities = cadImage.getEntities();
        List<CadBaseEntity> filteredEntities = new List<CadBaseEntity>() {
                    @Override
                    public int size() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean isEmpty() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean contains(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public Iterator<CadBaseEntity> iterator() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public Object[] toArray() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public <T> T[] toArray(T[] a) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean add(CadBaseEntity e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean remove(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean containsAll(Collection<?> c) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean addAll(Collection<? extends CadBaseEntity> c) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean addAll(int index, Collection<? extends CadBaseEntity> c) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean removeAll(Collection<?> c) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean retainAll(Collection<?> c) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void clear() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public CadBaseEntity get(int index) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public CadBaseEntity set(int index, CadBaseEntity element) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void add(int index, CadBaseEntity element) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public CadBaseEntity remove(int index) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public int indexOf(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public int lastIndexOf(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public ListIterator<CadBaseEntity> listIterator() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public ListIterator<CadBaseEntity> listIterator(int index) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public List<CadBaseEntity> subList(int fromIndex, int toIndex) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
        for (CadBaseEntity baseEntity : entities) {
        // selection or filtration of entities
        if ((baseEntity.getTypeName() == CadEntityTypeName.TEXT)) {
        filteredEntities.add(baseEntity);
        }

        }

        CadBaseEntity[] arr = new CadBaseEntity[filteredEntities.size()];
        cadImage.setEntities(filteredEntities.toArray(arr));
        // Create an instance of CadRasterizationOptions and set its various properties
        CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setPageWidth(1600);
        rasterizationOptions.setPageHeight(1600);
        // Set Auto Layout Scaling
        rasterizationOptions.setAutomaticLayoutsScaling(true);
        // Create an instance of PdfOptions
        PdfOptions pdfOptions = new PdfOptions();
        // Set the VectorRasterizationOptions property
        pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
        String outFile = (dataDir+"result_out_generated.pdf");
        // Export the CAD to PDF
        cadImage.save(outFile, pdfOptions);
        //ExEnd:ParticularDWGToImage
    }
}