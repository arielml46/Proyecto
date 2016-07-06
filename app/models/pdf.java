/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

/**
 *
 * @author usuario
 */
public class pdf {
    
    Document documento = new Document();  

    FileOutputStream ficheroPdf;

    try{
    
    ficheroPdf = new FileOutputStream("/Luarka/PDFs/pedido.PDF");
 
    PdfWriter.getInstance(
        documento, 
        ficheroPdf
        ).setInitialLeading(20);
    }


    catch (Exception ex){
    
      System.out.println(ex.toString());
    }

    try{
        
    documento.open();
    
    documento.add(new Paragraph("LUARKA"));

    Paragraph parrafo2 = new Paragraph("Productos pedidos");
    
    parrafo2.setAlignment(1);
    
        documento.add(parrafo2);
    
        documento.add(new Paragraph(" "));

    Paragraph parrafo3 = new Paragraph("@routes.")

            documento.add(parrafo3);

    documento.close();

}catch(Exception ex){
    
    System.out.println(ex.toString());
}
}
