package modelFCE;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class FCEBasicaTableModel extends AbstractTableModel {

	private FCEBasica fceBasica;
	private List<FCEBasica> listFceBasica;
	private FCEBasica bigFceBasica;
	Class<?> classe;

	public static int NUM_COLUNAS = 20;
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Locale localeBR = new Locale("pt", "BR");
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

	public FCEBasicaTableModel(FCEBasica fceBasica) {
		this.fceBasica = fceBasica;
		this.classe = this.fceBasica.getMovimentos().get(0).getClass();
	}

	public FCEBasicaTableModel(List<FCEBasica> listFceBasica) {
		this.listFceBasica = listFceBasica;
		this.classe = listFceBasica.get(0).getMovimentos().get(0).getClass();
		bigFceBasica = new FCEBasica();
		for(FCEBasica f : listFceBasica) {
			bigFceBasica.getMovimentos().addAll(f.getMovimentos());
		}
	}

	@Override
	public int getRowCount() {
		int numLinhas = 0;
		if(this.fceBasica != null) {
			numLinhas = this.fceBasica.getMovimentos().size();
		}
		else if(this.listFceBasica != null) {
			numLinhas = this.bigFceBasica.getMovimentos().size();
		}
		
		
		return numLinhas;
	
	}

	public int getColumnCount2() {
		// TODO Auto-generated method stub
		return NUM_COLUNAS;
	}

	@Override
	public int getColumnCount() {
		int colunas = 0;
		
		Object objeto;
		if(this.fceBasica != null) {
			objeto = this.fceBasica.getMovimentos().get(0);
		}
		else {
			objeto = this.listFceBasica.get(0).getMovimentos().get(0);
		}
		Class<?> classe = objeto.getClass();
		
		for (Method metodo : classe.getDeclaredMethods()) {
			if (metodo.isAnnotationPresent(Coluna.class)) {
				colunas++;
			}
		}	
		
		return colunas;
	}

	@Override
	public String getColumnName(int coluna) {
		// for(Method metodo : this.classe.getDeclaredMethods())
		String nomeColuna = "No name";
		for (Method metodo : MovimentoESS.class.getDeclaredMethods()) {

			if (metodo.isAnnotationPresent(Coluna.class)) {
				Coluna anotacao = metodo.getAnnotation(Coluna.class);
				if (anotacao.posicao() == coluna) {
					nomeColuna = anotacao.nome();
					break;
				}
			}
		}
		return nomeColuna;
	}

	/*
	 * public String getColumnName(int column) { String result = ""; for (; column
	 * >= 0; column = column / 26 - 1) { result = (char)((char)(column%26)+'A') +
	 * result; } return result; }
	 */
	/*
	 * @Override public Object getValueAt(int rowIndex, int columnIndex) {
	 * 
	 * try { Object objeto = this.fceBasica.getMovimentos().get(rowIndex); for
	 * (Method metodo : this.classe.getDeclaredMethods()) { if
	 * (metodo.isAnnotationPresent(Coluna.class)) { Coluna anotacao =
	 * metodo.getAnnotation(Coluna.class); if (anotacao.posicao() == columnIndex) {
	 * return metodo.invoke(objeto); } }
	 * 
	 * }
	 * 
	 * } catch (Exception e) { return "Erro"; } return ""; }
	 */

	// @Override
	public Object getValueAt2(int rowIndex, int columnIndex) {
		MovimentoESS mov = this.fceBasica.getMovimentos().get(rowIndex);
		switch (columnIndex) {
		case 0:
			return df.format(mov.getData().getTime());

		case 1:
			return mov.getHistorico();

		case 2:
			return mov.getCodigoMercadoria();

		case 3:
			return mov.getDescricao();

		case 4:
			return mov.getNCM();

		case 5:
			return mov.getNumNotaFiscal();

		case 6:
			return mov.getCFOP();

		case 7:
			return mov.getQuantidadeUnitario();

		case 8:
			return dinheiro.format(mov.getCustoUnitario());

		case 9:
			return dinheiro.format(mov.getTotalUnitario());

		case 10:
			return dinheiro.format(mov.getVlItem());

		case 11:
			return mov.getVlICMS();

		case 12:
			return mov.getVlICMSST();

		case 13:
			return mov.getCEST();

		case 14:
			return dinheiro.format(mov.getVlCOFINS());
		case 15:
			return dinheiro.format(mov.getVlPIS());

		case 16:
			return mov.getQuantidadeSaldo();
		case 17:
			return dinheiro.format(mov.getCustoSaldo());
		case 18:
			return dinheiro.format(mov.getTotalSaldo());

		default:
			return -2;

		}

	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		try {
			Object objeto;
			if(this.fceBasica != null) {
				objeto = this.fceBasica.getMovimentos().get(0);
			}
			else {
				objeto = this.bigFceBasica.getMovimentos().get(linha);
			}
			
			
			Class<?> classe = objeto.getClass();
			for (Method metodo : classe.getDeclaredMethods()) {
				if (metodo.isAnnotationPresent(Coluna.class)) {
					Coluna anotacao = metodo.getAnnotation(Coluna.class);
					if (anotacao.posicao() == coluna) {
						return String.format(anotacao.formato(), metodo.invoke(objeto));
					}
				}
			}
			return "";
		} catch (Exception e) {
			return "Erro" +e;
		}
	}

	public FCEBasica getFceBasica() {
		return fceBasica;
	}

	public void setFceBasica(FCEBasica fceBasica) {
		this.fceBasica = fceBasica;
	}

	/*
	 * public List<FCEBasica> getListFceBasica() { return listFceBasica; }
	 * 
	 * public void setListFceBasica(List<FCEBasica> listFceBasica) {
	 * this.listFceBasica = listFceBasica; }
	 */
	public void ordenaTabela(FCEBasica fceBasica) {
		// DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(this); // Adiciona dados aqui...
		table.setAutoCreateColumnsFromModel(false);// Ordena todas as linhas de forma decrescente de acordo com os
		// valores da segunda coluna do modelo
		sortAllRowsBy(fceBasica, this, 0, false);// Os valores nulos de qualquer ordenação(crescente/decrescente) sempre
		// aparecerão por último. colIndex especifica a coluna no modelos.
	}

	public void sortAllRowsBy(FCEBasica fceBasica, AbstractTableModel model, int colIndex, boolean ascending) {
		// Vector data = model.getDataVector();
		Collections.sort(getDataVector(fceBasica), new ColumnSorter(colIndex, ascending));
		model.fireTableStructureChanged();
	} // Este comparador é usado classificar vetores dos dados

	public Vector getDataVector(FCEBasica fceBasica) {
		Vector returnVector = new Vector();
		for (MovimentoESS mov : fceBasica.getMovimentos()) {
			returnVector.add(mov);
		}
		return returnVector;

	}

	public class ColumnSorter implements Comparator {

		int colIndex;
		boolean ascending;

		ColumnSorter(int colIndex, boolean ascending) {
			this.colIndex = colIndex;
			this.ascending = ascending;
		}

		public int compare(Object a, Object b) {
			Vector v1 = (Vector) a;
			Vector v2 = (Vector) b;
			Object o1 = v1.get(colIndex);
			Object o2 = v2.get(colIndex);

			if (o1 instanceof String && ((String) o1).length() == 0) {
				o1 = null;
			}
			if (o2 instanceof String && ((String) o2).length() == 0) {
				o2 = null;
			}

			if (o1 == null && o2 == null) {
				return 0;
			} else if (o1 == null) {
				return 1;
			} else if (o2 == null) {
				return -1;
			} else if (o1 instanceof Comparable) {
				if (ascending) {
					return ((Comparable) o1).compareTo(o2);
				} else {
					return ((Comparable) o2).compareTo(o1);
				}
			} else {
				if (ascending) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o2.toString().compareTo(o1.toString());
				}
			}
		}
	}

}
