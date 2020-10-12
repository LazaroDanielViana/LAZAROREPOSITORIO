package DAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import modelBlocoC.C100;
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

public class C100DAO {
	
	public void insertC100(C100 c) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EFDPU");
		EntityManager manager = factory.createEntityManager();

		long timeInicial = 0, timeFinal = 0;

		/*
		 * List<C110> listC110 = new ArrayList<>(); List<C120> listC120 = new
		 * ArrayList<>(); List<C165> listC165 = new ArrayList<>();
		 * 
		 * List<C190> listC190 = new ArrayList<>(); List<C195> listC195 = new
		 * ArrayList<>();
		 */

		List<C170> listC170 = new LinkedList();

		timeInicial = System.currentTimeMillis();

		manager.getTransaction().begin();
		

		try {

			//for (C100 c : listC100) {

				manager.persist(c);
				/*contC100++;
				//if (contC100 % 30 == 0) {
					//manager.flush();
					manager.clear();
				//}*/
				
				/*
				 * if(c.getListC110().size() > 0) { listC110 = c.getListC110();
				 * 
				 * for(C110 c110 : listC110) { List<C111> listC111 = new ArrayList<>();
				 * if(c110.getListC111().size() > 0) { listC111 = c110.getListC111(); for(C111
				 * c111 : listC111) { manager.persist(c111); }
				 * 
				 * }//fim C111
				 * 
				 * List<C112> listC112 = new ArrayList<>(); if(c110.getListC112().size() > 0) {
				 * listC112 = c110.getListC112(); for(C112 c112 : listC112) {
				 * manager.persist(c112); }
				 * 
				 * }//fim C112
				 * 
				 * List<C113> listC113 = new ArrayList<>(); if(c110.getListC113().size() > 0) {
				 * listC113 = c110.getListC113(); for(C113 c113 : listC113) {
				 * manager.persist(c113); }
				 * 
				 * }//fim C113
				 * 
				 * List<C114> listC114 = new ArrayList<>(); if(c110.getListC114().size() > 0) {
				 * listC114 = c110.getListC114(); for(C114 c114 : listC114) {
				 * manager.persist(c114); }
				 * 
				 * }//fim C114
				 * 
				 * List<C115> listC115 = new ArrayList<>(); if(c110.getListC115().size() > 0) {
				 * listC115 = c110.getListC115(); for(C115 c115 : listC115) {
				 * manager.persist(c115); }
				 * 
				 * }//fim C115
				 * 
				 * List<C116> listC116 = new ArrayList<>(); if(c110.getListC116().size() > 0) {
				 * listC116 = c110.getListC116(); for(C116 c116 : listC116) {
				 * manager.persist(c116); }
				 * 
				 * }//fim C116
				 * 
				 * manager.persist(c110); }//for C110
				 * 
				 * }//fim listC110
				 */
				/*
				 * if(c.getListC120().size() > 0) { listC120 = c.getListC120(); for(C120 c120 :
				 * listC120) { manager.persist(c120); }
				 * 
				 * }
				 * 
				 * if(c.getC140() != null) {
				 * 
				 * if(c.getC140().getListC141().size() > 0) { List<C141> listC141 = new
				 * ArrayList<>(); listC141 = c.getC140().getListC141(); for(C141 c141 :
				 * listC141) { manager.persist(c141); }
				 * 
				 * } manager.persist(c.getC140());
				 * 
				 * }//fim C140
				 * 
				 * if(c.getListC165().size() > 0) { listC165 = c.getListC165(); for(C165 c165 :
				 * listC165) { manager.persist(c165); }
				 * 
				 * }
				 */
				if (c.getListC170().size() > 0) {
					try {
						listC170 = c.getListC170();
					}catch(Exception e){
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, "Pego pelo try C170! O tamanho de listC170 é: "+ listC170.size());
					}
					

					/*
					 * for(C170 c170 : listC170) {
					 * 
					 * List<C171> listC171 = new ArrayList<>(); if(c170.getListC171().size() > 0) {
					 * listC171 = c170.getListC171(); for(C171 c171 : listC171) {
					 * manager.persist(c171); }
					 * 
					 * }//fim C171
					 * 
					 * List<C173> listC173 = new ArrayList<>(); if(c170.getListC173().size() > 0) {
					 * listC173 = c170.getListC173(); for(C173 c113 : listC173) {
					 * manager.persist(c113); }
					 * 
					 * }//fim C173
					 * 
					 * List<C174> listC174 = new ArrayList<>(); if(c170.getListC174().size() > 0) {
					 * listC174 = c170.getListC174(); for(C174 c114 : listC174) {
					 * manager.persist(c114); }
					 * 
					 * }//fim C174
					 * 
					 * List<C175> listC175 = new ArrayList<>(); if(c170.getListC175().size() > 0) {
					 * listC175 = c170.getListC175(); for(C175 c115 : listC175) {
					 * manager.persist(c115); }
					 * 
					 * }//fim C175
					 * 
					 * List<C176> listC176 = new ArrayList<>(); if(c170.getListC176().size() > 0) {
					 * listC176 = c170.getListC176(); for(C176 c116 : listC176) {
					 * manager.persist(c116); }
					 * 
					 * }//fim C176 //c170.getC100().setIdC100(c.getIdC100());
					 */
					
					for (C170 c170Teste : listC170) {
						manager.persist(c170Teste);
						/*cont170++;
						if (cont170 % 50 == 0) {
							manager.flush();
							manager.clear();
						}*/
					}

				} // END FOR C170

			//} // END For C100

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Pego pelo try C100!");
		}

		/*
		 * 
		 * }//For C100E timeFinal = System.currentTimeMillis();
		 * 
		 * System.out.println("Tempo gasto em segundos no insertC100E de: " +
		 * (timeFinal-timeInicial)/1000);
		 */
		manager.getTransaction().commit();
		
		
		
		//getCurrentSession().flush();
		//sf.getCache().evictEntityRegions();
		manager.close();
		factory.close();

	}// end insertC100


	public void insertC100(List<C100> listC100) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EFDPU");
		EntityManager manager = factory.createEntityManager();

		long timeInicial = 0, timeFinal = 0;

		/*
		 * List<C110> listC110 = new ArrayList<>(); List<C120> listC120 = new
		 * ArrayList<>(); List<C165> listC165 = new ArrayList<>();
		 * 
		 * List<C190> listC190 = new ArrayList<>(); List<C195> listC195 = new
		 * ArrayList<>();
		 */

		List<C170> listC170 = new LinkedList();

		timeInicial = System.currentTimeMillis();

		manager.getTransaction().begin();
		int contC100 = 0;

		try {

			for (C100 c : listC100) {

				manager.persist(c);
				contC100++;
				if (contC100 % 30 == 0) {
					manager.flush();
					manager.clear();
				}
				/*
				 * if(c.getListC110().size() > 0) { listC110 = c.getListC110();
				 * 
				 * for(C110 c110 : listC110) { List<C111> listC111 = new ArrayList<>();
				 * if(c110.getListC111().size() > 0) { listC111 = c110.getListC111(); for(C111
				 * c111 : listC111) { manager.persist(c111); }
				 * 
				 * }//fim C111
				 * 
				 * List<C112> listC112 = new ArrayList<>(); if(c110.getListC112().size() > 0) {
				 * listC112 = c110.getListC112(); for(C112 c112 : listC112) {
				 * manager.persist(c112); }
				 * 
				 * }//fim C112
				 * 
				 * List<C113> listC113 = new ArrayList<>(); if(c110.getListC113().size() > 0) {
				 * listC113 = c110.getListC113(); for(C113 c113 : listC113) {
				 * manager.persist(c113); }
				 * 
				 * }//fim C113
				 * 
				 * List<C114> listC114 = new ArrayList<>(); if(c110.getListC114().size() > 0) {
				 * listC114 = c110.getListC114(); for(C114 c114 : listC114) {
				 * manager.persist(c114); }
				 * 
				 * }//fim C114
				 * 
				 * List<C115> listC115 = new ArrayList<>(); if(c110.getListC115().size() > 0) {
				 * listC115 = c110.getListC115(); for(C115 c115 : listC115) {
				 * manager.persist(c115); }
				 * 
				 * }//fim C115
				 * 
				 * List<C116> listC116 = new ArrayList<>(); if(c110.getListC116().size() > 0) {
				 * listC116 = c110.getListC116(); for(C116 c116 : listC116) {
				 * manager.persist(c116); }
				 * 
				 * }//fim C116
				 * 
				 * manager.persist(c110); }//for C110
				 * 
				 * }//fim listC110
				 */
				/*
				 * if(c.getListC120().size() > 0) { listC120 = c.getListC120(); for(C120 c120 :
				 * listC120) { manager.persist(c120); }
				 * 
				 * }
				 * 
				 * if(c.getC140() != null) {
				 * 
				 * if(c.getC140().getListC141().size() > 0) { List<C141> listC141 = new
				 * ArrayList<>(); listC141 = c.getC140().getListC141(); for(C141 c141 :
				 * listC141) { manager.persist(c141); }
				 * 
				 * } manager.persist(c.getC140());
				 * 
				 * }//fim C140
				 * 
				 * if(c.getListC165().size() > 0) { listC165 = c.getListC165(); for(C165 c165 :
				 * listC165) { manager.persist(c165); }
				 * 
				 * }
				 */
				if (c.getListC170().size() > 0) {
					try {
						listC170 = c.getListC170();
					}catch(Exception e){
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, "Pego pelo try C170! O tamanho de listC170 é: "+ listC170.size());
					}
					

					/*
					 * for(C170 c170 : listC170) {
					 * 
					 * List<C171> listC171 = new ArrayList<>(); if(c170.getListC171().size() > 0) {
					 * listC171 = c170.getListC171(); for(C171 c171 : listC171) {
					 * manager.persist(c171); }
					 * 
					 * }//fim C171
					 * 
					 * List<C173> listC173 = new ArrayList<>(); if(c170.getListC173().size() > 0) {
					 * listC173 = c170.getListC173(); for(C173 c113 : listC173) {
					 * manager.persist(c113); }
					 * 
					 * }//fim C173
					 * 
					 * List<C174> listC174 = new ArrayList<>(); if(c170.getListC174().size() > 0) {
					 * listC174 = c170.getListC174(); for(C174 c114 : listC174) {
					 * manager.persist(c114); }
					 * 
					 * }//fim C174
					 * 
					 * List<C175> listC175 = new ArrayList<>(); if(c170.getListC175().size() > 0) {
					 * listC175 = c170.getListC175(); for(C175 c115 : listC175) {
					 * manager.persist(c115); }
					 * 
					 * }//fim C175
					 * 
					 * List<C176> listC176 = new ArrayList<>(); if(c170.getListC176().size() > 0) {
					 * listC176 = c170.getListC176(); for(C176 c116 : listC176) {
					 * manager.persist(c116); }
					 * 
					 * }//fim C176 //c170.getC100().setIdC100(c.getIdC100());
					 */
					int cont170 = 0;
					for (C170 c170Teste : listC170) {
						manager.persist(c170Teste);
						cont170++;
						if (cont170 % 50 == 0) {
							manager.flush();
							manager.clear();
						}
					}

				} // END FOR C170

			} // END For C100

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Pego pelo try C100!");
		}

		/*
		 * 
		 * }//For C100E timeFinal = System.currentTimeMillis();
		 * 
		 * System.out.println("Tempo gasto em segundos no insertC100E de: " +
		 * (timeFinal-timeInicial)/1000);
		 */
		manager.getTransaction().commit();
		
		manager.flush();
		
		//getCurrentSession().flush();
		//sf.getCache().evictEntityRegions();
		manager.close();
		factory.close();

	}// end insertC100

	public static void listaC100(EntityManager manager) {
		// EntityManager manager = EntityManagerSingleton.getInstance();
		// manager.getTransaction().begin();
		System.out.println("Entrando em listaC100");
		// String jpql = "FROM C170 c inner join fetch c.C100 as b ";
		String nativeQuery = "SELECT *FROM c100";

		Query query = manager.createNativeQuery(nativeQuery);
		List<Object[]> results = query.getResultList();
		for (Object[] result : results) {
			System.out.println(result[0] + "\t" + result[1] + "\t" + result[2] + "\t" + result[3] + "\t" + result[4]
					+ "\t" + result[5] + "\t" + result[6] + "\t" + result[7] + "\t" + result[8] + "\t" + result[9]
					+ "\t" + result[10] + "\t" + result[11] + "\t" + result[12] + "\t" + result[13] + "\t" + result[14]
					+ "\t" + result[15] + "\t" + result[16] + "\t" + result[17] + "--" + result[18] + "\t" + result[18]
					+ "\t" + result[19] + "\t" + result[20] + "\t" + result[21] + "\t" + result[22] + "\t" + result[23]
					+ "\t" + result[24] + "\t" + result[25] + "\t" + result[26] + "\t" + result[27] + "\t" + result[28]
					+ "\t" + result[29] + "\t" + result[30] + "\t" + result[31] + "\t" + result[32] + "\t" + result[33]
					+ "\t" + result[34] + "\t" + result[35] + "\t" + result[36] + "\t" + result[37] + "\t" + result[38]
					+ "\t" + result[39] + "\t" + result[40] + "\t" + result[41] + "\t" + result[42] + "\t" + result[43]
					+ "\t" + result[44] + "\t" + result[45] + "\t" + result[46] + "\t" + result[47] + "\t" + result[48]
					+ "\t" + result[49] + "\t" + result[50] + "\t" + result[51] + "\t" + result[52] + "\t" + result[53]
					+ "\t" + result[54]);

		}

	}

}
