package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelBlocoC.C110;
import modelBlocoC.C111;
import modelBlocoC.C112;
import modelBlocoC.C113;
import modelBlocoC.C114;
import modelBlocoC.C115;
import modelBlocoC.C116;
import modelBlocoC.C120;
import modelBlocoC.C141;
import modelBlocoC.C165;
import modelBlocoC.C170;
import modelBlocoC.C171;
import modelBlocoC.C173;
import modelBlocoC.C174;
import modelBlocoC.C175;
import modelBlocoC.C176;
import modelBlocoC.C190;
import modelBlocoC.C195;

public class C170DAO {

	public static List<C170> getListC170() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EFDPU");
		EntityManager manager = factory.createEntityManager();
		String jpql = " SELECT p FROM C170 p";

		long timeInicial = 0, timeFinal = 0;
		timeInicial = System.currentTimeMillis();

		Query query = manager.createQuery(jpql);
		List<C170> listC170 = query.getResultList();

		timeFinal = System.currentTimeMillis();
		System.out.println("Tempo gasto em segundos no getListC170 de: " + (timeFinal - timeInicial) / 1000);
		manager.close();
		factory.close();
		return listC170;

	}

	// C100EC170.findAll

	// LEFT JOIN ON HIBERNATE
	/*
	 * public class Main {
	 * 
	 * public static void main(String[] args) { SessionFactory factory =
	 * HibernateUtility.getSessionFactory(); Session session =
	 * factory.openSession(); Query qry= session.
	 * createQuery("select c.customerName, c.customerCity, i.itemName,i.price from Customer c "
	 * + "left join c.items i"); List l = qry.list(); Iterator it=l.iterator();
	 * while(it.hasNext()) { Object rows[] = (Object[])it.next();
	 * System.out.println(rows[0]+ " -- " +rows[1] + "--"+rows[2]+"--"+rows[3]); }
	 * session.clear(); session.close(); }
	 * 
	 * }
	 */

	public static List<C170> getNamedListC170() {
		// EntityManagerFactory factory =
		// Persistence.createEntityManagerFactory("EFD_IPI_pu");
		// EntityManager manager = factory.createEntityManager();
		EntityManager manager = EntityManagerSingleton.getInstance();

		long timeInicial = 0, timeFinal = 0;
		timeInicial = System.currentTimeMillis();

		Query query = manager.createNamedQuery("C170.findAll");
		List<C170> listC170 = query.getResultList();

		timeFinal = System.currentTimeMillis();
		System.out.println("Tempo gasto em segundos no getNamedListC170 de: " + (timeFinal - timeInicial) / 1000);

		// manager.close();
		// factory.close();
		return listC170;
	}

	public void listaC100C170(EntityManager manager) {
		// EntityManager manager = EntityManagerSingleton.getInstance();
		// manager.getTransaction().begin();
		Query query = manager.createNamedQuery("C170.C100findAll");
		List<Object[]> results = query.getResultList();
		for (Object[] result : results) {
			System.out.println(result[0] + "--" + result[1] + "--" + result[2] + "--" + result[3] + "--" + result[4]
					+ "--" + result[5] + "--" + result[6] + result[7] + "--" + result[8] + "--" + result[9] + "--"
					+ result[10] + "--" + result[11] + "--" + result[12] + result[13] + "--" + result[14] + "--"
					+ result[15] + "--" + result[16] + "--" + result[17] + "--" + result[18]);

		}
		// manager.getTransaction().commit();
		// manager.close();
	}

	public static void listaC100C170D(EntityManager manager) {
		// EntityManager manager = EntityManagerSingleton.getInstance();
		// manager.getTransaction().begin();
		System.out.println("Entrando em listaC100C170d");
		// String jpql = "FROM C170 c inner join fetch c.C100 as b ";
		String jpql = "from C100 c, C170 d";
		String nativeQuery = "SELECT c.* FROM C100 c JOIN C170 c1 ON c.id = c1.id";
		
		String nativeQuery2 = "SELECT *FROM C100 AS c JOIN C170 AS c1 ON c.idC100 = c1.idC170";
		
		String nativeQuery3 = "SELECT *FROM c100_c170"
				+ " JOIN c100 ON c100.idC100 = c100_c170.c100_idC100"
				+ " JOIN c170 ON c170.idC170 = c100_c170.listC170_idC170";
		
		String nativeQuery4 = "SELECT *FROM c100"
				+ " JOIN c100_c170 ON c100.idC100 = c100_c170.c100_idC100"
				+ " JOIN c170 ON c170.idC170 = c100_c170.listC170_idC170";
		
		
		
		Query query = manager.createNativeQuery(nativeQuery4);
		List<Object[]> results = query.getResultList();
		for (Object[] result : results) {
			System.out.println(result[0] + "\t" + result[1] + "\t" + result[2] + "\t" + result[3] + "\t" + result[4]
					+ "\t" + result[5] + "\t" + result[6] + "\t" + result[7] + "\t" + result[8] + "\t" + result[9] + "\t"
					+ result[10] + "\t" + result[11] + "\t" + result[12] + "\t" + result[13] + "\t" + result[14] + "\t"
					+ result[15] + "\t" + result[16] + "\t" + result[17] + "--" + result[18] + "\t" + result[18] + "\t" + 
					result[19] + "\t" + result[20] + "\t" + result[21] + "\t" + result[22] + "\t" + result[23] + "\t" + 
					result[24] + "\t" + result[25] + "\t" + result[26] + "\t" + result[27] + "\t" + result[28] + "\t" + 
					result[29] + "\t" + result[30] + "\t" + result[31] + "\t" + result[32] + "\t" + result[33] + "\t" + 
					result[34] + "\t" + result[35] + "\t" + result[36] + "\t" + result[37] + "\t" + result[38] + "\t" + 
					result[39] + "\t" + result[40] + "\t" + result[41] + "\t" + result[42] + "\t" + result[43] + "\t" + 
					result[44] + "\t" + result[45] + "\t" + result[46] + "\t" + result[47] + "\t" + result[48] + "\t" + 
					result[49] + "\t" + result[50] + "\t" + result[51] + "\t" + result[52] + "\t" + result[53] + "\t" + 
					result[54] + "\t" + result[55] + "\t" + result[56] + "\t" + result[57] + "\t" + result[58] + "\t" + 
					result[59] + "\t" + result[60] + "\t" + result[61] + "\t" + result[62] + "\t" + result[63] + "\t" + 
					result[64] + "\t" + result[65] + "\t" + result[66] + "\t" + result[67] + "\t" + result[68] + "\t" + 
					result[69] + "\t" + result[70] + "\t" + result[71] + "\t" + result[72] + "\t" + result[73] + "\t" + 
					result[74] + "\t" + result[75] + "\t" + result[76] + "\t" + result[77] + "\t" + result[78] + "\t" +					
					result[79] + "\t" + result[80] + "\t" + result[81] + "\t" + result[82] + "\t" + result[83] + "\t" + 
					result[84] + "\t" + result[85] + "\t" + result[86] + "\t" + result[87] + "\t" + result[88] + "\t" + 
					result[89] + "\t" + result[90] + "\t" + result[91] + "\t" + result[92] + "\t" + result[93] + "\t" + 
					result[94] + "\t" + result[95] + "\t" + result[96] + "\t" + result[97] + "\t" + result[98] + "\t" + 
					result[99]+ "\t" + result[100] + "\t" + result[101] + "\t" + result[102] + "\t" + result[103] + "\t" +
					result[104] + "\t" + result[105] + "\t" + result[106] + "\t" + result[107] + "\t" + result[108] +
					"\t" + result[109] + "\t" + result[110] + "\t" + result[111] + "\t" + result[112] + "\t" + result[113]);

		}

	}
	
	public static void listaC170(EntityManager manager) {
		// EntityManager manager = EntityManagerSingleton.getInstance();
		// manager.getTransaction().begin();
		System.out.println("Entrando em listaC170");
		
		
		String nativeQuery = "SELECT *FROM c170";	
		
		
		Query query = manager.createNativeQuery(nativeQuery);
		List<Object[]> results = query.getResultList();
		for (Object[] result : results) {
			System.out.println(result[0] + "\t" + result[1] + "\t" + result[2] + "\t" + result[3] + "\t" + result[4]
					+ "\t" + result[5] + "\t" + result[6] + "\t" + result[7] + "\t" + result[8] + "\t" + result[9] + "\t"
					+ result[10] + "\t" + result[11] + "\t" + result[12] + "\t" + result[13] + "\t" + result[14] + "\t"
					+ result[15] + "\t" + result[16] + "\t" + result[17] + "--" + result[18] + "\t" + result[18] + "\t" + 
					result[19] + "\t" + result[20] + "\t" + result[21] + "\t" + result[22] + "\t" + result[23] + "\t" + 
					result[24] + "\t" + result[25] + "\t" + result[26] + "\t" + result[27] + "\t" + result[28] + "\t" + 
					result[29] + "\t" + result[30] + "\t" + result[31] + "\t" + result[32] + "\t" + result[33] + "\t" + 
					result[34] + "\t" + result[35] + "\t" + result[36] + "\t" + result[37] + "\t" + result[38] + "\t" + 
					result[39] + "\t" + result[40] + "\t" + result[41] + "\t" + result[42] + "\t" + result[43] + "\t" + 
					result[44] + "\t" + result[45] + "\t" + result[46] + "\t" + result[47] + "\t" + result[48] + "\t" + 
					result[49] + "\t" + result[50] + "\t" + result[51] + "\t" + result[52] + "\t" + result[53] + "\t" + 
					result[54] + "\t" + result[55] + "\t" + result[56]);

		}

	}
}
