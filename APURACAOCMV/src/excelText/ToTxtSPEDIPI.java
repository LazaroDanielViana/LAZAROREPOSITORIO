package excelText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import efdUtil.EscreveEmArquivo;
import modelBloco0.R0000;
import modelBlocoC.C100;
import modelBlocoC.C170;
import modelBlocoC.C300;
import modelBlocoC.C350;
import modelBlocoC.C500;
import modelBlocoC.C510;
import modelBlocoC.C600;
import modelBlocoC.C610;
import modelBlocoC.C700;
import modelBlocoC.C800;
import modelBlocoC.CXXX;
import modelBlocoD.D100;

public class ToTxtSPEDIPI {

	

	public static void exportaListaC(List<C100> list, String pathOfFile) throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		/*
		 * String[] cabecalhosC100 = {"CNPJFILIAL/CNPJContrib", "Razão Social",
		 * "IE Contribuinte", "Leiaute", "COD_MODC100/Modelo", "SERC100/Serie",
		 * "NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe", "DT_DOCC100/Data Emissão",
		 * "DT_E_SC100/Data","COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",
		 * "IND_EMITC100/Terceiros/Própria", "VL_DOCC100/Valor Nota",
		 * "Cliente/Fornecedor/COD_PARTC100", "Nome Cliente/Fornecedor",
		 * "Valor Desconto/VL_DESCC100" , "Frete/VL_FRTC100", "Seguro/VL_SEGC100",
		 * "Despesas/VL_OUT_DAC100", "IPI/VL_IPIC100", "ICMS Subst/VL_ICMS_STC100",
		 * "OBS", "VL_ICMSC100", "VL_PIS", "VL_COFINS" };
		 */

		/*
		 * for (int i = 0; i < cabecalhosC100.length; i++) { if(i<cabecalhosC100.length
		 * - 1){ writer.write(cabecalhosC100[i] + "|"); }else{
		 * writer.write(cabecalhosC100[i]+"\n"); } }
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C100 c100 : list) {
			writer.write(c100.toString() + "\n");
			List<C170> listC170 = c100.getListC170();
			for (C170 c170 : listC170) {
				writer.write(c170.toString() + "\n");
			}

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

	public static void exportaListaC100(List<CXXX> listC100, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC100 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCC100/Data Emissão", "DT_E_SC100/Data", "COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",
				"IND_EMITC100/Terceiros/Própria", "VL_DOCC100/Valor Nota", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC100", "Frete/VL_FRTC100", "Seguro/VL_SEGC100",
				"Despesas/VL_OUT_DAC100", "IPI/VL_IPIC100", "ICMS Subst/VL_ICMS_STC100", "OBS", "VL_ICMSC100", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosC100.length; i++) {
			if (i < cabecalhosC100.length - 1) {
				writer.write(cabecalhosC100[i] + "|");
			} else {
				writer.write(cabecalhosC100[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (CXXX c100 : listC100) {
			/*
			 * writer.write(r0000.getCNPJ_R0000() + "|"); writer.write(r0000.getNOME_R0000()
			 * + "|"); writer.write(r0000.getIE_R0000() + "|"); writer.write("SPED/EFD" +
			 * "|"); writer.write(c100.getCOD_MODC100() + "|");
			 * 
			 * writer.write(c100.getSERC100() + "|"); writer.write(c100.getNUM_DOCC100() +
			 * "|"); writer.write(c100.getCHV_NFEC100() + "|");
			 * writer.write(sdf.format(c100.getDT_DOCC100().getTime()) + "|");
			 * 
			 * writer.write(sdf.format(c100.getDT_E_SC100().getTime()) + "|");
			 * writer.write(c100.getCOD_SITC100() + "|");
			 * writer.write(c100.getIND_OPERC100() + "|");
			 * 
			 * writer.write(c100.getIND_EMITC100() + "|"); writer.write(c100.getVL_DOCC100()
			 * + "|"); writer.write(c100.getCOD_PARTC100() + "|");
			 * 
			 * writer.write(hashClienteFornecedor.get(c100.getCOD_PARTC100()) + "|");
			 * writer.write(c100.getVL_DESCC100() + "|"); writer.write(c100.getVL_FRTC100()
			 * + "|"); writer.write(c100.getVL_SEGC100() + "|");
			 * 
			 * writer.write(c100.getVL_OUT_DAC100() + "|");
			 * writer.write(c100.getVL_IPIC100() + "|");
			 * writer.write(c100.getVL_BC_ICMS_STC100() + "|"); writer.write("OBS" + "|");
			 * writer.write(c100.getVL_ICMSC100() + "|"); writer.write(c100.getVL_PISC100()
			 * + "|"); writer.write(c100.getVL_COFINSC100() + "|"); writer.write("\n");
			 */

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

	public static void exportaLog(String pathOfFile, int size) throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);

		writer.write(size + "|");

		writer.write("\n");

		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

	public static void exportaListaC170(List<C170> listC170, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC170 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "DT_DOCC100/Data Emissão",
				"DT_E_SC100/Data", "NºItem/NUM_ITEMC170", "CFOP/CFOPC170", "NCM/?", "COD_SITC100/Cancelada",
				"IND_OPERC100/Entrada/Saída", "IND_EMITC100/Terceiros/Própria", "Valor Item/VL_ITEMC170",
				"Código da Mercadoria/Serviço//COD_ITEMC170", "Descrição da Mercadoria/DESCR_COMPLC170",
				"Descrição Complementar da Mercadoria/DESCR_COMPLC170", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC170", "IPI/VL_IPIC170", "PIS/VL_PISC170",
				"COFINS/VL_COFINSC170", "Quantidade/QTDC170", "Unidade/UNIDC170", "VL_ICMS_C170", "VL_ICMS_ST_C170" };

		for (int i = 0; i < cabecalhosC170.length; i++) {
			if (i < cabecalhosC170.length - 1) {
				writer.write(cabecalhosC170[i] + "|");
			} else {
				writer.write(cabecalhosC170[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C170 c170 : listC170) {

			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(c170.getC100().getCOD_MODC100() + "|");
			writer.write(c170.getC100().getSERC100() + "|");
			writer.write(c170.getC100().getNUM_DOCC100() + "|");
			writer.write(sdf.format(c170.getC100().getDT_DOCC100().getTime()) + "|");
			writer.write(sdf.format(c170.getC100().getDT_E_SC100().getTime()) + "|");
			writer.write(c170.getNUM_ITEMC170() + "|");
			writer.write(c170.getCFOPC170() + "|");
			writer.write("NCM" + "|");
			writer.write(c170.getC100().getCOD_SITC100() + "|");
			writer.write(c170.getC100().getIND_OPERC100() + "|");
			writer.write(c170.getC100().getIND_EMITC100() + "|");

			writer.write(c170.getVL_ITEMC170() + "|");
			writer.write(c170.getCOD_ITEMC170() + "|");
			writer.write(c170.getDESCR_COMPLC170() + "|");
			writer.write(c170.getDESCR_COMPLC170() + "|");

			writer.write(c170.getC100().getCOD_PARTC100() + "|");
			writer.write(hashClienteFornecedor.get(c170.getC100().getCOD_PARTC100()) + "|");

			writer.write(c170.getVL_DESCC170() + "|");
			writer.write(c170.getVL_IPIC170() + "|");
			writer.write(c170.getVL_PISC170() + "|");
			writer.write(c170.getVL_COFINSC170() + "|");

			writer.write(c170.getQTDC170() + "|");
			writer.write(c170.getUNIDC170() + "|");
			writer.write(c170.getVL_ICMSC170() + "|");
			writer.write(c170.getVL_ICMS_STC170() + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

	public static void exportaListaC170(List<C170> list, String pathOfFile) throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C170 c170 : list) {
			writer.write(c170.toString());

		}
		writer.close();
		excel.close();

	}

	public static void exportaListaC300(List<C300> listC300, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC100 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCC100/Data Emissão", "DT_E_SC100/Data", "COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",
				"IND_EMITC100/Terceiros/Própria", "VL_DOCC100/Valor Nota", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC100", "Frete/VL_FRTC100", "Seguro/VL_SEGC100",
				"Despesas/VL_OUT_DAC100", "IPI/VL_IPIC100", "ICMS Subst/VL_ICMS_STC100", "OBS", "VL_ICMSC100", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosC100.length; i++) {
			if (i < cabecalhosC100.length - 1) {
				writer.write(cabecalhosC100[i] + "|");
			} else {
				writer.write(cabecalhosC100[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C300 c300 : listC300) {
			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write("C300" + "|");// c300.getCOD_MODC100()

			writer.write(c300.getSER_C300() + "|");
			writer.write(c300.getNUM_DOC_INI_C300() + "-" + c300.getNUM_DOC_FIN_C300() + "|");// c100.getNUM_DOCC100()
			writer.write("C300" + "|");
			writer.write(sdf.format(c300.getDT_DOC_C300().getTime()) + "|");

			writer.write("C300" + "|");
			writer.write("C300" + "|");
			writer.write("C300" + "|"); // c300.getIND_OPERC100()

			writer.write("C300" + "|"); // c300.getIND_EMITC100()
			writer.write(c300.getVL_DOC_C300() + "|");
			writer.write("C300" + "|");

			writer.write("C300" + "|"); // hashClienteFornecedor.get(c300.getCOD_PARTC100())
			writer.write("C300" + "|");// c300.getVL_DESCC100()
			writer.write("C300" + "|");// c300.getVL_FRTC100()
			writer.write("C300" + "|");// c300.getVL_SEGC100()

			writer.write("C300" + "|");// c300.getVL_OUT_DAC100()
			writer.write("C300" + "|");// c300.getVL_IPIC100()
			writer.write("C300" + "|");// c300.getVL_BC_ICMS_STC100()
			writer.write("OBS" + "|");
			writer.write("C300" + "|");// c300.getVL_ICMSC100()
			writer.write(c300.getVL_PIS_C300() + "|");
			writer.write(c300.getVL_COFINS_C300() + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file); }

	}

	public static void exportaListaC350(List<C350> listC350, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC100 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCC100/Data Emissão", "DT_E_SC100/Data", "COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",
				"IND_EMITC100/Terceiros/Própria", "VL_DOCC100/Valor Nota", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC100", "Frete/VL_FRTC100", "Seguro/VL_SEGC100",
				"Despesas/VL_OUT_DAC100", "IPI/VL_IPIC100", "ICMS Subst/VL_ICMS_STC100", "OBS", "VL_ICMSC100", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosC100.length; i++) {
			if (i < cabecalhosC100.length - 1) {
				writer.write(cabecalhosC100[i] + "|");
			} else {
				writer.write(cabecalhosC100[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C350 c350 : listC350) {
			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write("C350" + "|");// c300.getCOD_MODC100()

			writer.write(c350.getSER_C350() + "|");
			writer.write(c350.getNUM_DOC_C350() + "|");
			writer.write("C350" + "|");// c100.getCHV_NFEC100()
			writer.write(sdf.format(c350.getDT_DOC_C350().getTime()) + "|");

			writer.write("C350" + "|");// sdf.format(c100.getDT_E_SC100().getTime() )
			writer.write("C350" + "|");// c100.getCOD_SITC100()
			writer.write("C350" + "|"); // c350.getIND_OPERC100()

			writer.write("C350" + "|"); // c350.getIND_EMITC100()
			writer.write(c350.getVL_DOC_C350() + "|");
			writer.write("C350" + "|");// c100.getCOD_PARTC100()

			writer.write("C350" + "|"); // hashClienteFornecedor.get(c350.getCOD_PARTC100())
			writer.write(c350.getVL_DESC_C350() + "|");// c350.getVL_DESCC100()
			writer.write("C350" + "|");// c350.getVL_FRTC100()
			writer.write("C350" + "|");// c350.getVL_SEGC100()

			writer.write("C350" + "|");// c350.getVL_OUT_DAC100()
			writer.write("C350" + "|");// c350.getVL_IPIC100()
			writer.write("C350" + "|");// c350.getVL_BC_ICMS_STC100()
			writer.write("OBS" + "|");
			writer.write("C350" + "|");// c350.getVL_ICMSC100()
			writer.write(c350.getVL_PIS_C350() + "|");
			writer.write(c350.getVL_COFINS_C350() + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file); }

	}

	public static void exportaListaC500(List<C500> listC500, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC100 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCC100/Data Emissão", "DT_E_SC100/Data", "COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",
				"IND_EMITC100/Terceiros/Própria", "VL_DOCC100/Valor Nota", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC100", "Frete/VL_FRTC100", "Seguro/VL_SEGC100",
				"Despesas/VL_OUT_DAC100", "IPI/VL_IPIC100", "ICMS Subst/VL_ICMS_STC100", "OBS", "VL_ICMSC100", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosC100.length; i++) {
			if (i < cabecalhosC100.length - 1) {
				writer.write(cabecalhosC100[i] + "|");
			} else {
				writer.write(cabecalhosC100[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C500 c500 : listC500) {
			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(c500.getCOD_MOD_C500() + "|");// c300.getCOD_MODC100()

			writer.write(c500.getSER_C500() + "|");
			writer.write(c500.getNUM_DOC_C500() + "|");
			writer.write("C350" + "|");// c100.getCHV_NFEC100()
			writer.write(sdf.format(c500.getDT_DOC_C500().getTime()) + "|");

			writer.write(sdf.format(c500.getDT_E_S_C500().getTime()) + "|");// sdf.format(c100.getDT_E_SC100().getTime()
																			// )
			writer.write(c500.getCOD_SIT_C500() + "|");// c100.getCOD_SITC100()
			writer.write(c500.getIND_OPER_C500() + "|"); // c500.getIND_OPERC100()

			writer.write(c500.getIND_EMIT_C500() + "|"); // c500.getIND_EMITC100()
			writer.write(c500.getVL_DOC_C500() + "|");
			writer.write(c500.getCOD_PART_C500() + "|");// c100.getCOD_PARTC100()

			writer.write(hashClienteFornecedor.get(c500.getCOD_PART_C500()) + "|"); // hashClienteFornecedor.get(c500.getCOD_PARTC100())
			writer.write(c500.getVL_DESC_C500() + "|");// c500.getVL_DESCC100()
			writer.write("C350" + "|");// c500.getVL_FRTC100()
			writer.write("C350" + "|");// c500.getVL_SEGC100()

			writer.write(c500.getVL_DA_C500() + "|");// c500.getVL_OUT_DAC100()
			writer.write("C350" + "|");// c500.getVL_IPIC100()
			writer.write(c500.getVL_BC_ICMS_C500() + "|");// c500.getVL_BC_ICMS_STC100()
			writer.write("OBS" + "|");
			writer.write(c500.getVL_ICMS_C500() + "|");// c500.getVL_ICMSC100()
			writer.write(c500.getVL_PIS_C500() + "|");
			writer.write(c500.getVL_COFINS_C500() + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file); }

	}

	public static void exportaListaC510(List<C510> listC510, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC170 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "DT_DOCC100/Data Emissão",
				"DT_E_SC100/Data", "NºItem/NUM_ITEMC170", "CFOP/CFOPC170", "NCM/?", "COD_SITC100/Cancelada",
				"IND_OPERC100/Entrada/Saída", "IND_EMITC100/Terceiros/Própria", "Valor Item/VL_ITEMC170",
				"Código da Mercadoria/Serviço//COD_ITEMC170", "Descrição da Mercadoria/DESCR_COMPLC170",
				"Descrição Complementar da Mercadoria/DESCR_COMPLC170", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC170", "IPI/VL_IPIC170", "PIS/VL_PISC170",
				"COFINS/VL_COFINSC170", "Quantidade/QTDC170", "Unidade/UNIDC170", "VL_ICMS_C170", "VL_ICMS_ST_C170" };

		for (int i = 0; i < cabecalhosC170.length; i++) {
			if (i < cabecalhosC170.length - 1) {
				writer.write(cabecalhosC170[i] + "|");
			} else {
				writer.write(cabecalhosC170[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C510 c510 : listC510) {

			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(c510.getC500().getCOD_MOD_C500() + "|");
			writer.write(c510.getC500().getSER_C500() + "|");
			writer.write(c510.getC500().getNUM_DOC_C500() + "|");
			writer.write(sdf.format(c510.getC500().getDT_DOC_C500().getTime()) + "|");
			writer.write(sdf.format(c510.getC500().getDT_E_S_C500().getTime()) + "|");
			writer.write(c510.getNUM_ITEM_C510() + "|");
			writer.write(c510.getCFOP_C510() + "|");
			writer.write("NCM" + "|");
			writer.write("COD_sit");// c510.getC100().getCOD_SITC100() + "|"
			writer.write("IND_OPER");// c510.getC100().getIND_OPERC100() + "|"
			writer.write("IND_EMITC510");// c510.getC100().getIND_EMITC100() + "|"

			writer.write(c510.getVL_ITEM_C510() + "|");
			writer.write(c510.getCOD_ITEM_C510() + "|");
			writer.write("DESCR COMP C510");// c510.getDESCR_COMP) + "|"
			writer.write("DESCR COMP C510");// c510.getDESCR_COMPLC170() + "|"

			writer.write(c510.getC500().getCOD_PART_C500() + "|");
			writer.write(hashClienteFornecedor.get(c510.getC500().getCOD_PART_C500()) + "|");

			writer.write(c510.getVL_DESC_C510() + "|");
			writer.write("no IPI");// c510.getVL_IPIC170() + "|"
			writer.write(c510.getVL_PIS_C510() + "|");
			writer.write(c510.getVL_COFINS_C510() + "|");

			writer.write(c510.getQTD_C510() + "|");
			writer.write(c510.getUNID_C510() + "|");
			writer.write(c510.getVL_ICMS_C510() + "|");
			writer.write(c510.getVL_BC_ICMS_ST_C510() + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

	public static void exportaListaC600(List<C600> listC600, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC100 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCC100/Data Emissão", "DT_E_SC100/Data", "COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",
				"IND_EMITC100/Terceiros/Própria", "VL_DOCC100/Valor Nota", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC100", "Frete/VL_FRTC100", "Seguro/VL_SEGC100",
				"Despesas/VL_OUT_DAC100", "IPI/VL_IPIC100", "ICMS Subst/VL_ICMS_STC100", "OBS", "VL_ICMSC100", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosC100.length; i++) {
			if (i < cabecalhosC100.length - 1) {
				writer.write(cabecalhosC100[i] + "|");
			} else {
				writer.write(cabecalhosC100[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C600 C600 : listC600) {
			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(C600.getCOD_MOD_C600() + "|");// c300.getCOD_MODC100()

			writer.write(C600.getSER_C600() + "|");
			writer.write("C600" + "|");// C600.getNUM_DOC_C600()
			writer.write("C600" + "|");// c100.getCHV_NFEC100()
			writer.write(sdf.format(C600.getDT_DOC_C600().getTime()) + "|");

			writer.write(sdf.format(C600.getDT_DOC_C600().getTime()) + "|");// sdf.format(c100.getDT_E_SC100().getTime()
																			// )
			writer.write("C600" + "|");// c100.getCOD_SITC100()
			writer.write("C600" + "|"); // C600.getIND_OPERC100()

			writer.write("C600" + "|"); // C600.getIND_EMITC100()
			writer.write(C600.getVL_DOC_C600() + "|");
			writer.write("C600" + "|");// c100.getCOD_PARTC100()

			writer.write("C600" + "|");// hashClienteFornecedor.get(C600.getCOD_PARTC100())
			writer.write(C600.getVL_DESC_C600() + "|");// C600.getVL_DESCC100()
			writer.write("C350" + "|");// C600.getVL_FRTC100()
			writer.write("C350" + "|");// C600.getVL_SEGC100()

			writer.write(C600.getVL_DA_C600() + "|");// C600.getVL_OUT_DAC100()
			writer.write("C350" + "|");// C600.getVL_IPIC100()
			writer.write(C600.getVL_BC_ICMS_ST_C600() + "|");// C600.getVL_BC_ICMS_STC100()
			writer.write("OBS" + "|");
			writer.write(C600.getVL_ICMS_C600() + "|");// C600.getVL_ICMSC100()
			writer.write(C600.getVL_PIS_C600() + "|");
			writer.write(C600.getVL_COFINS_C600() + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file); }

	}

	public static void exportaListaC610(List<C610> listC610, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC170 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "DT_DOCC100/Data Emissão",
				"DT_E_SC100/Data", "NºItem/NUM_ITEMC170", "CFOP/CFOPC170", "NCM/?", "COD_SITC100/Cancelada",
				"IND_OPERC100/Entrada/Saída", "IND_EMITC100/Terceiros/Própria", "Valor Item/VL_ITEMC170",
				"Código da Mercadoria/Serviço//COD_ITEMC170", "Descrição da Mercadoria/DESCR_COMPLC170",
				"Descrição Complementar da Mercadoria/DESCR_COMPLC170", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC170", "IPI/VL_IPIC170", "PIS/VL_PISC170",
				"COFINS/VL_COFINSC170", "Quantidade/QTDC170", "Unidade/UNIDC170", "VL_ICMS_C170", "VL_ICMS_ST_C170" };

		for (int i = 0; i < cabecalhosC170.length; i++) {
			if (i < cabecalhosC170.length - 1) {
				writer.write(cabecalhosC170[i] + "|");
			} else {
				writer.write(cabecalhosC170[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C610 C610 : listC610) {

			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(C610.getC600().getCOD_MOD_C600() + "|");
			writer.write(C610.getC600().getSER_C600() + "|");
			writer.write("C610" + "|");// C610.getC600().getNUM_DOC_C600()
			writer.write(sdf.format(C610.getC600().getDT_DOC_C600().getTime()) + "|");
			writer.write("C610" + "|");// sdf.format(C610.getC500().getDT_E_S_C500().getTime())
			writer.write("C610" + "|");// C610.getNUM_ITEM_C610()
			writer.write(C610.getCFOP_C610() + "|");
			writer.write("NCM" + "|");
			writer.write("COD_sit");// C610.getC100().getCOD_SITC100() + "|"
			writer.write("IND_OPER");// C610.getC100().getIND_OPERC100() + "|"
			writer.write("IND_EMITC610");// C610.getC100().getIND_EMITC100() + "|"

			writer.write(C610.getVL_ITEM_C610() + "|");
			writer.write(C610.getCOD_ITEM_C610() + "|");
			writer.write("DESCR COMP C610");// C610.getDESCR_COMP) + "|"
			writer.write("DESCR COMP C610");// C610.getDESCR_COMPLC170() + "|"

			writer.write("C610" + "|");// C610.getC600().getCOD_PART_C500()
			writer.write("C610" + "|");// hashClienteFornecedor.get(C610.getC500().getCOD_PART_C500())

			writer.write(C610.getVL_DESC_C610() + "|");
			writer.write("no IPI");// C610.getVL_IPIC170() + "|"
			writer.write(C610.getVL_PIS_C610() + "|");
			writer.write(C610.getVL_COFINS_C610() + "|");

			writer.write(C610.getQTD_C610() + "|");
			writer.write(C610.getUNID_C610() + "|");
			writer.write(C610.getVL_ICMS_C610() + "|");
			writer.write(C610.getVL_BC_ICMS_ST_C610() + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

	public static void exportaListaC700(List<C700> listC700, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC100 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC100/Modelo", "SERC100/Serie", "NUM_DOCC100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCC100/Data Emissão", "DT_E_SC100/Data", "COD_SITC100/Cancelada", "IND_OPERC100/Entrada/Saída",
				"IND_EMITC100/Terceiros/Própria", "VL_DOCC100/Valor Nota", "Cliente/Fornecedor/COD_PARTC100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC100", "Frete/VL_FRTC100", "Seguro/VL_SEGC100",
				"Despesas/VL_OUT_DAC100", "IPI/VL_IPIC100", "ICMS Subst/VL_ICMS_STC100", "OBS", "VL_ICMSC100", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosC100.length; i++) {
			if (i < cabecalhosC100.length - 1) {
				writer.write(cabecalhosC100[i] + "|");
			} else {
				writer.write(cabecalhosC100[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C700 C700 : listC700) {
			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(C700.getCOD_MOD_C700() + "|");// c300.getCOD_MODC100()

			writer.write(C700.getSER_C700() + "|");
			writer.write(C700.getNRO_ORD_INI_C700() + "|");// C700.getNUM_DOC_C700()
			writer.write(C700.getNRO_ORD_FIN_C700() + "|");// c100.getCHV_NFEC100()
			writer.write(sdf.format(C700.getDT_DOC_INI_C700().getTime()) + "|");

			writer.write(sdf.format(C700.getDT_DOC_FIN_C700().getTime()) + "|");// sdf.format(c100.getDT_E_SC100().getTime()
																				// )
			writer.write(C700.getNOM_MEST_C700() + "|");// c100.getCOD_SITC100()
			writer.write(C700.getCHV_COD_DIG_C700() + "|"); // C700.getIND_OPERC100()

			writer.write("C700" + "|"); // C700.getIND_EMITC100()
			writer.write("C700" + "|"); // C700.getVL_DOC_C700()
			writer.write("C700" + "|");// c100.getCOD_PARTC100()

			writer.write("C700" + "|");// hashClienteFornecedor.get(C700.getCOD_PARTC100())
			writer.write("C700" + "|");// C700.getVL_DESCC100()
			writer.write("C350" + "|");// C700.getVL_FRTC100()
			writer.write("C700" + "|");// C700.getVL_SEGC100()

			writer.write("C700" + "|");// C700.getVL_OUT_DAC100()
			writer.write("C700" + "|");// C700.getVL_IPIC100()
			writer.write("C700" + "|");// C700.getVL_BC_ICMS_STC100()
			writer.write("OBS" + "|");
			writer.write("C700" + "|");// C700.getVL_ICMSC100()
			writer.write("C700" + "|");
			writer.write("C700" + "|");

			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file); }

	}

	public static void exportaListaC800(List<C800> listC800, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosC800 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODC800/Modelo", "SERC800/Serie", "NUM_DOCC800/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCC800/Data Emissão", "DT_E_SC800/Data", "COD_SITC800/Cancelada", "IND_OPERC800/Entrada/Saída",
				"IND_EMITC800/Terceiros/Própria", "VL_DOCC800/Valor Nota", "Cliente/Fornecedor/COD_PARTC800",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCC800", "Frete/VL_FRTC800", "Seguro/VL_SEGC800",
				"Despesas/VL_OUT_DAC800", "IPI/VL_IPIC800", "ICMS Subst/VL_ICMS_STC800", "OBS", "VL_ICMSC800", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosC800.length; i++) {
			if (i < cabecalhosC800.length - 1) {
				writer.write(cabecalhosC800[i] + "|");
			} else {
				writer.write(cabecalhosC800[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (C800 C800 : listC800) {
			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(C800.getCOD_MOD_C800() + "|");

			writer.write("C800" + "|"); // C800.getSER_C800()
			writer.write(C800.getNUM_CFE_C800() + "|");
			writer.write("C800" + "|");// C800.getCHV_NFEC800()
			writer.write(sdf.format(C800.getDT_DOC_C800().getTime()) + "|");

			writer.write("C800" + "|");// sdf.format(C800.getDT_E_SC800().getTime() )
			writer.write(C800.getCOD_SIT_C800() + "|");
			writer.write("C800" + "|");// C800.getIND_OPERC800()

			writer.write("C800" + "|");// C800.getIND_EMITC800()
			writer.write(C800.getVL_CFE_C800() + "|");
			writer.write("C800" + "|");// C800.getCOD_PARTC800()

			writer.write(hashClienteFornecedor.get("C800" + "|"));// C800.getCOD_PART_C800())
			writer.write(C800.getVL_DESC_C800() + "|");
			writer.write("C800" + "|");// C800.getVL_FRTC800()
			writer.write("C800" + "|");// C800.getVL_SEGC800()

			writer.write(C800.getVL_OUT_DA_C800() + "|");
			writer.write("C800" + "|");// C800.getVL_IPIC800()
			writer.write("C800" + "|");// C800.getVL_BC_ICMS_STC800()
			writer.write("OBS" + "|");
			writer.write(C800.getVL_ICMS_C800() + "|");
			writer.write(C800.getVL_PIS_C800() + "|");
			writer.write(C800.getVL_COFINS_C800() + "|");
			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

	public static void exportaListaD100(List<D100> listD100, String pathOfFile,
			Hashtable<String, String> hashClienteFornecedor, Hashtable<String, String> hashCodItem_CodNcm, R0000 r0000)
			throws IOException {

		FileWriter excel = new FileWriter(pathOfFile, true);

		BufferedWriter writer = new BufferedWriter(excel);
		String[] cabecalhosD100 = { "CNPJFILIAL/CNPJContrib", "Razão Social", "IE Contribuinte", "Leiaute",
				"COD_MODD100/Modelo", "SERD100/Serie", "NUM_DOCD100/Nº da Nota", "CHV_NFEC10/ Chave Nfe",
				"DT_DOCD100/Data Emissão", "DT_E_SD100/Data", "COD_SITD100/Cancelada", "IND_OPERD100/Entrada/Saída",
				"IND_EMITD100/Terceiros/Própria", "VL_DOCD100/Valor Nota", "Cliente/Fornecedor/COD_PARTD100",
				"Nome Cliente/Fornecedor", "Valor Desconto/VL_DESCD100", "Frete/VL_FRTD100", "Seguro/VL_SEGD100",
				"Despesas/VL_OUT_DAD100", "IPI/VL_IPID100", "ICMS Subst/VL_ICMS_STD100", "OBS", "VL_ICMSD100", "VL_PIS",
				"VL_COFINS" };

		for (int i = 0; i < cabecalhosD100.length; i++) {
			if (i < cabecalhosD100.length - 1) {
				writer.write(cabecalhosD100[i] + "|");
			} else {
				writer.write(cabecalhosD100[i] + "\n");
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formater.setMinimumFractionDigits(2);

		// escrever os dados necessários
		for (D100 D100 : listD100) {
			writer.write(r0000.getCNPJ_R0000() + "|");
			writer.write(r0000.getNOME_R0000() + "|");
			writer.write(r0000.getIE_R0000() + "|");
			writer.write("SPED/EFD" + "|");
			writer.write(D100.getCOD_MOD_D100() + "|");

			writer.write(D100.getSER_D100() + "|");
			writer.write(D100.getNUM_DOC_D100() + "|");
			writer.write(D100.getCHV_CTE_D100() + "|");
			writer.write(sdf.format(D100.getDT_DOC_D100().getTime()) + "|");

			writer.write(sdf.format(D100.getDT_A_P_D100().getTime()) + "|");
			writer.write(D100.getCOD_SIT_D100() + "|");
			writer.write(D100.getIND_OPER_D100() + "|");

			writer.write(D100.getIND_EMIT_D100() + "|");
			writer.write(D100.getVL_DOC_D100() + "|");
			writer.write(D100.getCOD_PART_D100() + "|");

			writer.write(hashClienteFornecedor.get(D100.getCOD_PART_D100()) + "|");
			writer.write(D100.getVL_DESC_D100() + "|");
			writer.write("D100" + "|");// D100.getVL_FRTD100()
			writer.write("D100" + "|");// D100.getVL_SEGD100()

			writer.write("D100" + "|");// D100.getVL_OUT_DAD100()
			writer.write("D100" + "|");// D100.getVL_IPID100()
			writer.write("D100" + "|");// D100.getVL_BC_ICMS_STD100()
			writer.write("OBS" + "|");
			writer.write(D100.getVL_ICMS_D100() + "|");
			writer.write("D100" + "|");// D100.getVL_PISD100()
			writer.write("D100" + "|");// D100.getVL_COFINSD100()
			writer.write("\n");

		}
		writer.close();
		excel.close();
		// System.out.println("write out to: " + file);

	}

}
