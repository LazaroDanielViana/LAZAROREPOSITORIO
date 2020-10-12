package excelText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;

import modelBlocoC.C100;
import modelBlocoC.C170;

public class ApachePoi {
	
	
private static final String fileName = "C:\\JavaCode\\Desktop\\APPOI.xls";
	
	
public static void writeToSSC100(List<C100> listC100, Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm){
		
		HSSFWorkbook workbook = new HSSFWorkbook();          
        
        
        
		HSSFSheet sheetC100 = workbook.createSheet("C100Lazaro");
        Row rowHeaderC100 = sheetC100.createRow(0);
        int cellNumHeaderC100 = 0;        
        String[] cabecalhosC100 = {"CNPJFILIAL/CNPJContrib",	"Razão Social", "IE Contribuinte",	"Leiaute", "COD_MODC100/Modelo", 
        		"SERC100/Serie",	"NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",	"DT_DOCC100/Data Emissão",	
        		"DT_E_SC100/Data","COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",	
        		"IND_EMITC100/Terceiros/Própria",	"VL_DOCC100/Valor Nota",	"Cliente/Fornecedor/COD_PARTC100",
        		"Nome Cliente/Fornecedor",	"Valor Desconto/VL_DESCC100" ,	"Frete/VL_FRTC100",	"Seguro/VL_SEGC100",	
        		"Despesas/VL_OUT_DAC100",	"IPI/VL_IPIC100",	"ICMS Subst/VL_ICMS_STC100",	"OBS",	"VL_ICMSC100"
        };
        for(String cabecalhoC100 : cabecalhosC100 ) {
        	Cell cellCabecalhoC100 = rowHeaderC100.createCell(cellNumHeaderC100++);
        	cellCabecalhoC100.setCellValue(cabecalhoC100);
        }
        
        
        
        
        HSSFSheet sheetC170 = workbook.createSheet("C170Lazaro");  
        Row rowHeaderC170 = sheetC170.createRow(0);
        int cellNumHeaderC170 = 0;
        String[] cabecalhosC170 =  {"CNPJFILIAL/CNPJContrib",	"Razão Social", "IE Contribuinte",	"Leiaute", "COD_MODC100/Modelo", 
        		"SERC100/Serie", "NUM_DOCC100/Nº da Nota",	"DT_DOCC100/Data Emissão",	
        		"DT_E_SC100/Data","NºItem/NUM_ITEMC170", "CFOP/CFOPC170",	"NCM/?", 	"COD_SITC100/Cancelada",	"IND_OPERC100/Entrada/Saída",	
        				"IND_EMITC100/Terceiros/Própria",	"Valor Item/VL_ITEMC170",	"Código da Mercadoria/Serviço//COD_ITEMC170",	"Descrição da Mercadoria/DESCR_COMPLC170",	
        				"Descrição Complementar da Mercadoria/DESCR_COMPLC170",	
        				"Cliente/Fornecedor/COD_PARTC100",	"Nome Cliente/Fornecedor",	"Valor Desconto/VL_DESCC170",	"IPI/VL_IPIC170",	"PIS/VL_PISC170",	"COFINS/VL_COFINSC170",	
        				"Quantidade/QTDC170",	"Unidade/UNIDC170", "VL_ICMS_C170", "VL_ICMS_ST_C170"
        };
        for(String cabecalhoC170 : cabecalhosC170 ) {
        	Cell cellCabecalhoC170 = rowHeaderC170.createCell(cellNumHeaderC170++);
        	cellCabecalhoC170.setCellValue(cabecalhoC170);
        }         
        
        
        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/mm/yyyy"));
        
        CellStyle cellStyleMoeda = workbook.createCellStyle();
        
        String formato = "[BLACK][$R$-416]#,##0.00;[RED]-[$R$-416]#,##0.00";
        
        cellStyleMoeda.setDataFormat(createHelper.createDataFormat().getFormat(formato));   
      
        
        int rownumC100 = 1;
        
        int rownumC170 = 1;        
        
        
        for (C100 c100 : listC100) {           

				Row rowC100 = sheetC100.createRow(rownumC100++);
				int cellnumC100 = 0;
				
				Cell cellCNPJFILIAL = rowC100.createCell(cellnumC100++);
				cellCNPJFILIAL.setCellValue(c100.getCNPJFILIAL());
				Cell cellRazaoSocial = rowC100.createCell(cellnumC100++);
				cellRazaoSocial.setCellValue(C100.razaoSocial);
				Cell cellIE = rowC100.createCell(cellnumC100++);
				cellIE.setCellValue(C100.inscricaoEstadual);
				Cell cellLayout = rowC100.createCell(cellnumC100++);
				cellLayout.setCellValue("SPED/EFD");
				Cell cellCOD_MODC100 = rowC100.createCell(cellnumC100++);
				cellCOD_MODC100.setCellValue(c100.getCOD_MODC100());

				Cell cellSERC100 = rowC100.createCell(cellnumC100++);
				cellSERC100.setCellValue(c100.getSERC100());

				Cell cellNUM_DOCC100 = rowC100.createCell(cellnumC100++);
				cellNUM_DOCC100.setCellValue(c100.getNUM_DOCC100());
				
				Cell cellCHV_NFEC100 = rowC100.createCell(cellnumC100++);
				cellCHV_NFEC100.setCellValue(c100.getCHV_NFEC100());
				
				Cell cellDT_DOCC100 = rowC100.createCell(cellnumC100++);				
				cellDT_DOCC100.setCellValue(c100.getDT_DOCC100());
				cellDT_DOCC100.setCellStyle(cellStyle);
				
				Cell cellDT_E_SC100 = rowC100.createCell(cellnumC100++);
				cellDT_E_SC100.setCellValue(c100.getDT_E_SC100());
				cellDT_E_SC100.setCellStyle(cellStyle);
				
				Cell cellCOD_SITC100 = rowC100.createCell(cellnumC100++);
				cellCOD_SITC100.setCellValue(c100.getCOD_SITC100());
				
				Cell cellIND_OPERC100 = rowC100.createCell(cellnumC100++);
				cellIND_OPERC100.setCellValue(c100.getIND_OPERC100());
				
				Cell cellIND_EMITC100 = rowC100.createCell(cellnumC100++);
				cellIND_EMITC100.setCellValue(c100.getIND_EMITC100());

				Cell cellVL_DOCC100 = rowC100.createCell(cellnumC100++);
				cellVL_DOCC100.setCellValue(c100.getVL_DOCC100());
				cellVL_DOCC100.setCellStyle(cellStyleMoeda);
				
				Cell cellCOD_PARTC100 = rowC100.createCell(cellnumC100++);
				cellCOD_PARTC100.setCellValue(c100.getCOD_PARTC100());

				Cell cellCliente = rowC100.createCell(cellnumC100++);				
				cellCliente.setCellValue(hashClienteFornecedor.get(c100.getCOD_PARTC100()));

				Cell cellVL_DESCC100 = rowC100.createCell(cellnumC100++);
				cellVL_DESCC100.setCellValue(c100.getVL_DESCC100());
				cellVL_DESCC100.setCellStyle(cellStyleMoeda);

				Cell cellVL_FRTC100 = rowC100.createCell(cellnumC100++);
				cellVL_FRTC100.setCellValue(c100.getVL_FRTC100());
				cellVL_FRTC100.setCellStyle(cellStyleMoeda);

				Cell cellVL_SEGC100 = rowC100.createCell(cellnumC100++);
				cellVL_SEGC100.setCellValue(c100.getVL_SEGC100());
				cellVL_SEGC100.setCellStyle(cellStyleMoeda);

				Cell cellVL_OUT_DAC100 = rowC100.createCell(cellnumC100++);
				cellVL_OUT_DAC100.setCellValue(c100.getVL_OUT_DAC100());
				cellVL_OUT_DAC100.setCellStyle(cellStyleMoeda);

				Cell cellVL_IPIC100 = rowC100.createCell(cellnumC100++);
				cellVL_IPIC100.setCellValue(c100.getVL_IPIC100());
				cellVL_IPIC100.setCellStyle(cellStyleMoeda);
				
				Cell cellVL_ICMS_STC100 = rowC100.createCell(cellnumC100++);
				cellVL_ICMS_STC100.setCellValue(c100.getVL_ICMS_STC100());
				cellVL_ICMS_STC100.setCellStyle(cellStyleMoeda);

				Cell cellOBS = rowC100.createCell(cellnumC100++);
				cellOBS.setCellValue("OBS");
				Cell cellVL_ICMSC100 = rowC100.createCell(cellnumC100++);
				cellVL_ICMSC100.setCellValue(c100.getVL_ICMSC100());
				cellVL_ICMSC100.setCellStyle(cellStyleMoeda);
				
				
							
			List<C170> c170l = c100.getListC170();
			for (C170 c170 : c170l) {
				Row rowC170 = sheetC170.createRow(rownumC170++);
				int cellnumC170 = 0;
				// Cell cellid = row.createCell(cellnum++);
				// cellid.setCellValue(c100.getIdC100());
				Cell cellCNPJFILIALC170 = rowC170.createCell(cellnumC170++);
				cellCNPJFILIALC170.setCellValue(c100.getCNPJFILIAL());
				Cell cellRazaoSocialC170 = rowC170.createCell(cellnumC170++);
				cellRazaoSocialC170.setCellValue(C100.razaoSocial);
				Cell cellIEC170 = rowC170.createCell(cellnumC170++);
				cellIEC170.setCellValue(C100.inscricaoEstadual);
				Cell cellLayoutC170 = rowC170.createCell(cellnumC170++);
				cellLayoutC170.setCellValue("SPED/EFD");
				Cell cellCOD_MODC100C170 = rowC170.createCell(cellnumC170++);
				cellCOD_MODC100C170.setCellValue(c100.getCOD_MODC100());

				Cell cellSERC100C170 = rowC170.createCell(cellnumC170++);
				cellSERC100C170.setCellValue(c100.getSERC100());

				Cell cellNUM_DOCC100C170 = rowC170.createCell(cellnumC170++);
				cellNUM_DOCC100C170.setCellValue(c100.getNUM_DOCC100());

				Cell cellDT_DOCC100C170 = rowC170.createCell(cellnumC170++);
				cellDT_DOCC100C170.setCellValue(c100.getDT_DOCC100());
				cellDT_DOCC100C170.setCellStyle(cellStyle);

				Cell cellDT_E_SC100C170 = rowC170.createCell(cellnumC170++);
				cellDT_E_SC100C170.setCellValue(c100.getDT_E_SC100());
				cellDT_E_SC100C170.setCellStyle(cellStyle);

				Cell cellNUM_ITEMC170 = rowC170.createCell(cellnumC170++);
				cellNUM_ITEMC170.setCellValue(c170.getNUM_ITEMC170());

				Cell cellCFOPC170 = rowC170.createCell(cellnumC170++);
				cellCFOPC170.setCellValue(c170.getCFOPC170());
				Cell cellNCMC170 = rowC170.createCell(cellnumC170++);
				cellNCMC170.setCellValue(hashCodItem_CodNcm.get(c170.getCOD_ITEMC170()));

				Cell cellCOD_SITC100C170 = rowC170.createCell(cellnumC170++);
				cellCOD_SITC100C170.setCellValue(c100.getCOD_SITC100());
				Cell cellIND_OPERC100C170 = rowC170.createCell(cellnumC170++);
				cellIND_OPERC100C170.setCellValue(c100.getIND_OPERC100());
				Cell cellIND_EMITC100C170 = rowC170.createCell(cellnumC170++);
				cellIND_EMITC100C170.setCellValue(c100.getIND_EMITC100());

				Cell cellVL_ITEMC170 = rowC170.createCell(cellnumC170++);
				cellVL_ITEMC170.setCellValue(c170.getVL_ITEMC170());
				Cell cellCOD_ITEMC170 = rowC170.createCell(cellnumC170++);
				cellCOD_ITEMC170.setCellValue(c170.getCOD_ITEMC170());

				Cell cellDESCR_COMPLC170 = rowC170.createCell(cellnumC170++);
				cellDESCR_COMPLC170.setCellValue(c170.getDESCR_COMPLC170());
				Cell cellDESCR_COMPLC1702 = rowC170.createCell(cellnumC170++);
				cellDESCR_COMPLC1702.setCellValue(c170.getDESCR_COMPLC170());

				Cell cellClienteC170 = rowC170.createCell(cellnumC170++);
				cellClienteC170.setCellValue(c100.getCOD_PARTC100());

				Cell cellNomeClienteC170 = rowC170.createCell(cellnumC170++);
				cellNomeClienteC170.setCellValue(hashClienteFornecedor.get(c100.getCOD_PARTC100()));

				Cell cellVL_DESCC170 = rowC170.createCell(cellnumC170++);
				cellVL_DESCC170.setCellValue(c170.getVL_DESCC170());
				cellVL_DESCC170.setCellStyle(cellStyleMoeda);

				Cell cellVL_IPIC170 = rowC170.createCell(cellnumC170++);
				cellVL_IPIC170.setCellValue(c170.getVL_IPIC170());
				cellVL_IPIC170.setCellStyle(cellStyleMoeda);

				Cell cellVL_PISC170 = rowC170.createCell(cellnumC170++);
				cellVL_PISC170.setCellValue(c170.getVL_PISC170());
				cellVL_PISC170.setCellStyle(cellStyleMoeda);

				Cell cellVL_COFINSC170 = rowC170.createCell(cellnumC170++);
				cellVL_COFINSC170.setCellValue(c170.getVL_COFINSC170());
				cellVL_COFINSC170.setCellStyle(cellStyleMoeda);

				Cell cellQTDC170 = rowC170.createCell(cellnumC170++);
				cellQTDC170.setCellValue(c170.getQTDC170());

				Cell cellUNIDC170 = rowC170.createCell(cellnumC170++);
				cellUNIDC170.setCellValue(c170.getUNIDC170());

				Cell cellVL_ICMS_C170 = rowC170.createCell(cellnumC170++);
				cellVL_ICMS_C170.setCellValue(c170.getVL_ICMSC170());
				cellVL_ICMS_C170.setCellStyle(cellStyleMoeda);

				Cell cellVL_ICMS_ST_C170 = rowC170.createCell(cellnumC170++);
				cellVL_ICMS_ST_C170.setCellValue(c170.getVL_BC_ICMS_STC170());
				cellVL_ICMS_ST_C170.setCellStyle(cellStyleMoeda);
			}
				
			

		}          
       
        try {
            FileOutputStream out =  new FileOutputStream(new File(ApachePoi.fileName));
            workbook.write(out);
            out.close();
            System.out.println("Arquivo Excel criado com sucesso!");
             
        } catch (FileNotFoundException e) {
            e.printStackTrace();
               System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            e.printStackTrace();
               System.out.println("Erro na edição do arquivo!");
        }
      

  }

/*public static void writeToSSC170(List<C100> listC100, Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm){
	
	HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheetC170 = workbook.createSheet("C170Lazaro");         
    
    
    //cabeçalho
    Row rowHeader = sheetC170.createRow(0);
    int cellNumHeader = 0;
    
    String[] cabecalhosC100 =  {"CNPJFILIAL/CNPJContrib",	"Razão Social", "IE Contribuinte",	"Leiaute", "COD_MODC100/Modelo", 
    		"SERC100/Serie", "NUM_DOCC100/Nº da Nota",	"DT_DOCC100/Data Emissão",	
    		"DT_E_SC100/Data","NºItem/NUM_ITEMC170", "CFOP/CFOPC170",	"NCM/?", 	"COD_SITC100/Cancelada",	"IND_OPERC100/Entrada/Saída",	
    				"IND_EMITC100/Terceiros/Própria",	"Valor Item/VL_ITEMC170",	"Código da Mrecadoria/Serviço//COD_ITEMC170",	"Descrição da Mercadoria/DESCR_COMPLC170",	
    				"Descrição Complementar da Mercadoria/DESCR_COMPLC170",	
    				"Cliente/Fornecedor/COD_PARTC100",	"Nome Cliente/Fornecedor",	"Valor Desconto/VL_DESCC170",	"IPI/VL_IPIC170",	"PIS/VL_PISC170",	"COFINS/VL_COFINSC170",	
    				"Quantidade/QTDC170",	"Unidade/UNIDC170", "VL_ICMS_C170", "VL_ICMS_ST_C170"};
    
   
    
    for(String cabecalho : cabecalhosC100 ) {
    	Cell cellCabecalho = rowHeader.createCell(cellNumHeader++);
    	cellCabecalho.setCellValue(cabecalho);
    }    
    
    CreationHelper createHelper = workbook.getCreationHelper();
    CellStyle cellStyle = workbook.createCellStyle();
    cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/mm/yyyy"));
    
    
    CellStyle cellStyleMoeda = workbook.createCellStyle();
    
    String formato = "[BLACK][$R$-416]#,##0.00;[RED]-[$R$-416]#,##0.00";
    
    cellStyleMoeda.setDataFormat(createHelper.createDataFormat().getFormat(formato));
    //Largura
    //sheetC170.setColumnWidth( 2, 5000);
    
    int rownum = 1;
    for (C100 c100 : listC100) {
    	
    	List<C170> c170l = c100.getListC170();
			for (C170 c170 : c170l) {
				Row row = sheetC170.createRow(rownum++);
				int cellnum = 0;
				// Cell cellid = row.createCell(cellnum++);
				// cellid.setCellValue(c100.getIdC100());
				Cell cellCNPJFILIAL = row.createCell(cellnum++);
				cellCNPJFILIAL.setCellValue(c100.getCNPJFILIAL());
				Cell cellRazaoSocial = row.createCell(cellnum++);
				cellRazaoSocial.setCellValue(C100.razaoSocial);
				Cell cellIE = row.createCell(cellnum++);
				cellIE.setCellValue(C100.inscricaoEstadual);
				Cell cellLayout = row.createCell(cellnum++);
				cellLayout.setCellValue("SPED/EFD");
				Cell cellCOD_MODC100 = row.createCell(cellnum++);
				cellCOD_MODC100.setCellValue(c100.getCOD_MODC100());

				Cell cellSERC100 = row.createCell(cellnum++);
				cellSERC100.setCellValue(c100.getSERC100());

				Cell cellNUM_DOCC100 = row.createCell(cellnum++);
				cellNUM_DOCC100.setCellValue(c100.getNUM_DOCC100());

				Cell cellDT_DOCC100 = row.createCell(cellnum++);
				cellDT_DOCC100.setCellValue(c100.getDT_DOCC100());
				cellDT_DOCC100.setCellStyle(cellStyle);
				
				Cell cellDT_E_SC100 = row.createCell(cellnum++);
				cellDT_E_SC100.setCellValue(c100.getDT_E_SC100());
				cellDT_E_SC100.setCellStyle(cellStyle);

				Cell cellNUM_ITEMC170 = row.createCell(cellnum++);
				cellNUM_ITEMC170.setCellValue(c170.getNUM_ITEMC170());

				Cell cellCFOPC170 = row.createCell(cellnum++);
				cellCFOPC170.setCellValue(c170.getCFOPC170());
				Cell cellNCM = row.createCell(cellnum++);
				cellNCM.setCellValue(hashCodItem_CodNcm.get(c170.getCOD_ITEMC170()));

				Cell cellCOD_SITC100 = row.createCell(cellnum++);
				cellCOD_SITC100.setCellValue(c100.getCOD_SITC100());
				Cell cellIND_OPERC100 = row.createCell(cellnum++);
				cellIND_OPERC100.setCellValue(c100.getIND_OPERC100());
				Cell cellIND_EMITC100 = row.createCell(cellnum++);
				cellIND_EMITC100.setCellValue(c100.getIND_EMITC100());

				Cell cellVL_ITEMC170 = row.createCell(cellnum++);
				cellVL_ITEMC170.setCellValue(c170.getVL_ITEMC170());
				Cell cellCOD_ITEMC170 = row.createCell(cellnum++);
				cellCOD_ITEMC170.setCellValue(c170.getCOD_ITEMC170());

				Cell cellDESCR_COMPLC170 = row.createCell(cellnum++);
				cellDESCR_COMPLC170.setCellValue(c170.getDESCR_COMPLC170());
				Cell cellDESCR_COMPLC1702 = row.createCell(cellnum++);
				cellDESCR_COMPLC1702.setCellValue(c170.getDESCR_COMPLC170());

				Cell cellCliente = row.createCell(cellnum++);
				cellCliente.setCellValue(c100.getCOD_PARTC100());

				Cell cellNomeCliente = row.createCell(cellnum++);
				cellNomeCliente.setCellValue(hashClienteFornecedor.get(c100.getCOD_PARTC100()));

				Cell cellVL_DESCC170 = row.createCell(cellnum++);
				cellVL_DESCC170.setCellValue(c170.getVL_DESCC170());
				cellVL_DESCC170.setCellStyle(cellStyleMoeda);
				
				Cell cellVL_IPIC170 = row.createCell(cellnum++);
				cellVL_IPIC170.setCellValue(c170.getVL_IPIC170());
				cellVL_IPIC170.setCellStyle(cellStyleMoeda);
				
				
				Cell cellVL_PISC170 = row.createCell(cellnum++);
				cellVL_PISC170.setCellValue(c170.getVL_PISC170());
				cellVL_PISC170.setCellStyle(cellStyleMoeda);
				
				Cell cellVL_COFINSC170 = row.createCell(cellnum++);
				cellVL_COFINSC170.setCellValue(c170.getVL_COFINSC170());
				cellVL_COFINSC170.setCellStyle(cellStyleMoeda);
				
				Cell cellQTDC170 = row.createCell(cellnum++);
				cellQTDC170.setCellValue(c170.getQTDC170());
				
				Cell cellUNIDC170 = row.createCell(cellnum++);
				cellUNIDC170.setCellValue(c170.getUNIDC170());

				Cell cellVL_ICMS_C170 = row.createCell(cellnum++);
				cellVL_ICMS_C170.setCellValue(c170.getVL_ICMSC170());
				cellVL_ICMS_C170.setCellStyle(cellStyleMoeda);
				
				Cell cellVL_ICMS_ST_C170 = row.createCell(cellnum++);
				cellVL_ICMS_ST_C170.setCellValue(c170.getVL_BC_ICMS_STC170());
				cellVL_ICMS_ST_C170.setCellStyle(cellStyleMoeda);
			}
    }
     
    try {
        FileOutputStream out =  new FileOutputStream(new File(ApachePoi.fileName));
        workbook.write(out);
        out.close();
        System.out.println("Arquivo Excel criado com sucesso!");
         
    } catch (FileNotFoundException e) {
        e.printStackTrace();
           System.out.println("Arquivo não encontrado!");
    } catch (IOException e) {
        e.printStackTrace();
           System.out.println("Erro na edição do arquivo!");
    }

}*/



}
		
	
