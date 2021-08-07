package acao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import efdUtil.ArquivoDiretorioUtil;
import efdUtil.ImportaSped;

public class ImportaSpedAcao extends AbstractAction implements Serializable {
	
	private static final long serialVersionUID = 1L;
	JProgressBar barra = new JProgressBar();
	int numArquivos;
	AtomicInteger numArquivosLidos = new AtomicInteger(1);
	JFrame frameBarra; 
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		List<String> pastaMensal = ArquivoDiretorioUtil.listaArquivos();
		numArquivos = pastaMensal.size();
		//configurarJanela();
		//Temporizador temporizador = new Temporizador();
		//new Thread(temporizador).start();		
		for (String pathOfFile : pastaMensal) {
			try {
				ImportaSped.parseArquivo2(pathOfFile);
				//numArquivosLidos.incrementAndGet();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		//frameBarra.dispose();
	}

	public ImportaSpedAcao() {
		super("Importar");
	}
	
	public void configurarJanela() {
		frameBarra = new JFrame();
		frameBarra.setTitle("Barra de Progresso");
		frameBarra.setLayout(null);
		frameBarra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBarra.setSize(600,170);
		frameBarra.setLocationRelativeTo(null);
		barra.setBounds(40, 40, 500, 50);
		barra.setStringPainted(true);
		//barra.setValue(0);		
		barra.setForeground(new Color(50,200,50));
		barra.setMaximum(numArquivos);
		barra.setForeground(new Color(50,200,50));
		frameBarra.add(barra);
		barra.setVisible(true);
		frameBarra.setVisible(true);
	}
	
	public class Temporizador extends JPanel implements Runnable{
		
		private static final long serialVersionUID = 1L;

		public void run() {			
			
			while(barra.getValue() < numArquivos) {
				try {
					Thread.sleep(30);
					barra.setValue(numArquivosLidos.get());
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			//JOptionPane.showMessageDialog(null, "Importado");
		}
	}

}
