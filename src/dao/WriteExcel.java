/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Daniel
 */
public class WriteExcel extends DAO {

  private static final String FILE_NAME = "diario";
    public WriteExcel() throws Exception, Exception, Exception{
      
      super();
      
      
  }
  
    public void buscar() throws Exception{
        
        String query =  "select a.NOME, n.NOTA1, n.NOTA2, n.MEDIA, n.NOTAF \n" +
                        "from aluno a join nota n \n" +
                        "on a.ID = n.FK_ALUNO \n" +
                        "order by a.NOME;";
        
        ResultSet res= this.getDb().executeQuery(query);
            
        
        res.last();
        
        Object[][] datatypes = new Object[7][res.getRow()];
             int count=0;
             res.first();
             
        while(res.next()){
            datatypes[count][0]=res.getString("NOME");
            datatypes[count][1]=res.getInt("NOTA1");
            datatypes[count][2]=res.getInt("NOTA2");
            datatypes[count][2]=res.getInt("NOTAF");
           // datatypes[count][3]=res.getInt("faltas");
            //datatypes[count][4]=res.getInt("media");
            //datatypes[count][5]=res.getInt("final");
            //datatypes[count][6]=res.getInt("situacao");
            count++;
        }
        criarExcel(datatypes);
    }
    
    
    public static void criarExcel( Object[][] datatypes) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Alunos");
//        Object[][] datatypes = {
//            {"Daniel","10","9","8","Aprovado"},
//            {"Jose","10","9","8","Aprovado"},
//            {"Antoniop","10","9","8","Aprovado"},
//            {"Daniel","10","9","8","Aprovado"},
//            {"Daniel","10","9","8","Aprovado"},
//            {"Daniel","10","9","8","Aprovado"},
//            {"Daniel","10","9","8","Aprovado"},
//            
//        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer)
                            field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(new File(FILE_NAME));
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
    

}
