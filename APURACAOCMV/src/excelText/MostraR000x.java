package excelText;

import modelBloco0.R0001;
import modelBloco0.R0015;
import modelBloco0.R0150;
import modelBloco0.R0200;
import modelBloco0.R0205;

public class MostraR000x {
	
	public static void mostraR0001(R0001 r0001) {
		
		System.out.println(r0001.getREG_R0001());
		System.out.println(r0001.getR0005().getREG_R0005());
		
		
		for(R0015 r0015 : r0001.getListR0015()) {
			System.out.println(r0015.getREG_R0015());
			System.out.println(r0015.getUF_ST_R0015());
		}
		
		System.out.println(r0001.getR0100().getREG_R0100());
		System.out.println(r0001.getR0100().getNOME_R0100());
		
		
		for(R0150 r0150 : r0001.getListR0150()) {
			System.out.println(r0150.getREG_R0150());
			System.out.println(r0150.getCOD_PART_R0150());
		}
		
		for(R0200 r0200 : r0001.getListR0200()) {
			System.out.println(r0200.getREG_R0200());
			System.out.println(r0200.getCOD_ITEM_R0200());
			System.out.println(r0200.getDESCR_ITEM_R0200());
			
			if( r0200.getListR0205().size() > 0 ) {
				for(R0205 r0205 : r0200.getListR0205()) {
					System.out.println(r0205.getREG_R0205());
					System.out.println(r0205.getCOD_ANT_ITEM_R0205());
					System.out.println(r0205.getDESCR_ANT_ITEM_R0205());
					System.out.println(r0205.getDT_INI_R0205());
				}
			
			}
			if(r0200.getR0206() == null) {
				System.out.println("R0206 é nulo!");
				System.out.println(r0200.getR0206().getREG_R0206());
				
			}	
			else
				System.out.println("R0206 não é nulo!");
			
			
		}
		
		
		
		
		
		
	}

}
