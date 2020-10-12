package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Time;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Pattern;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.Action;
import javax.swing.JButton;
//import java.util.stream.Stream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import DAO.C100DAO;
import DAO.C170DAO;
import DAO.EntityManagerSingleton;
import acao.ImportaSpedAcao;
import acao.VisualizaFCEAcao;
import acao.VisualizaFCEAleatoriaAcao;
import efdUtil.ArquivoDiretorioUtil;
import efdUtil.ContaTiposDeRegistroStatic;
import efdUtil.ContaTiposDeRegistros;
import efdUtil.ImportaSped;
import efdUtil.RegistroAtivo;
import efdUtil.TextUtil;
import excelText.ApachePoi;
import excelText.MostraR000x;
import excelText.ToExcel_InCMV;
import excelText.ToTxtSPEDIPI;
import javassist.bytecode.Descriptor.Iterator;
import junit.framework.Test;
import modelBloco0.Bloco0;
import modelBloco0.R0000;
import modelBloco0.R0001;
import modelBloco0.R0005;
import modelBloco0.R0015;
import modelBloco0.R0100;
import modelBloco0.R0150;
import modelBloco0.R0175;
import modelBloco0.R0190;
import modelBloco0.R0200;
import modelBloco0.R0205;
import modelBloco0.R0206;
import modelBloco0.R0210;
import modelBloco0.R0220;
import modelBloco0.R0300;
import modelBloco0.R0305;
import modelBloco0.R0400;
import modelBloco0.R0450;
import modelBloco0.R0460;
import modelBloco0.R0500;
import modelBloco0.R0600;
import modelBlocoC.BlocoC;
import modelBlocoC.C001;
import modelBlocoC.C100;
import modelBlocoC.C101;
import modelBlocoC.C105;
import modelBlocoC.C110;
import modelBlocoC.C111;
import modelBlocoC.C112;
import modelBlocoC.C113;
import modelBlocoC.C114;
import modelBlocoC.C115;
import modelBlocoC.C116;
import modelBlocoC.C120;
import modelBlocoC.C130;
import modelBlocoC.C140;
import modelBlocoC.C141;
import modelBlocoC.C160;
import modelBlocoC.C165;
import modelBlocoC.C170;
import modelBlocoC.C171;
import modelBlocoC.C172;
import modelBlocoC.C173;
import modelBlocoC.C174;
import modelBlocoC.C175;
import modelBlocoC.C176;
import modelBlocoC.C177;
import modelBlocoC.C178;
import modelBlocoC.C179;
import modelBlocoC.C190;
import modelBlocoC.C195;
import modelBlocoC.C197;
import modelBlocoC.C300;
import modelBlocoC.C310;
import modelBlocoC.C320;
import modelBlocoC.C321;
import modelBlocoC.C350;
import modelBlocoC.C370;
import modelBlocoC.C390;
import modelBlocoC.C400;
import modelBlocoC.C405;
import modelBlocoC.C410;
import modelBlocoC.C420;
import modelBlocoC.C425;
import modelBlocoC.C460;
import modelBlocoC.C465;
import modelBlocoC.C470;
import modelBlocoC.C490;
import modelBlocoC.C495;
import modelBlocoC.C500;
import modelBlocoC.C510;
import modelBlocoC.C590;
import modelBlocoC.C600;
import modelBlocoC.C601;
import modelBlocoC.C610;
import modelBlocoC.C690;
import modelBlocoC.C700;
import modelBlocoC.C790;
import modelBlocoC.C791;
import modelBlocoC.C800;
import modelBlocoC.C850;
import modelBlocoC.C860;
import modelBlocoC.C890;
import modelBlocoD.*;
import modelBlocoE.*;
import modelBlocoG.*;
import modelBlocoH.*;
import modelFCE.FCE;
import modelFCE.FCEBasica;
import modelFCE.MovimentoESS;
import net.miginfocom.swing.MigLayout;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.lang.Exception;

public class TesteEFDIPI2 extends JFrame {

	JMenuBar barra;
	JMenu opcoes;
	JMenuItem jmImportarArquivo;	
	JMenuItem jmVisualizaFCE;
	JMenuItem jmVisualizaFCEAleatoria;
	JPanel panelCalcularListar;

	public TesteEFDIPI2() {

		super("TesteEFDIPI2");
		
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		barra = new JMenuBar();
		setJMenuBar(barra);
		opcoes = new JMenu("Opções");
		
		
		Action importar = new ImportaSpedAcao();
		jmImportarArquivo = new JMenuItem(importar);		
		opcoes.add(jmImportarArquivo);		
		
		Action visualizaFCE = new VisualizaFCEAcao();
		jmVisualizaFCE = new JMenuItem(visualizaFCE);		
		opcoes.add(jmVisualizaFCE);
		
		Action visualizaFCEAleatoria = new VisualizaFCEAleatoriaAcao();
		jmVisualizaFCEAleatoria = new JMenuItem(visualizaFCEAleatoria);		
		opcoes.add(jmVisualizaFCEAleatoria);
		
		
		barra.add(opcoes);
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {

		TesteEFDIPI2 t = new TesteEFDIPI2();

	}
	/*jmImportarArquivo.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {

		List<String> pastaMensal = ArquivoDiretorioUtil.listaArquivos();

		long inicio = System.currentTimeMillis();
		for (String pathOfFile : pastaMensal) {
			ImportaSped.parseArquivo2(pathOfFile);
		}
	}
});*/

	

}
