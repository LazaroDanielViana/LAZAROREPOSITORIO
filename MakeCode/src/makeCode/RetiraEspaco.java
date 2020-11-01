package makeCode;

public class RetiraEspaco {

	
	RetiraEspaco re = new RetiraEspaco();
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String espaco = "<p style =\" text - align : c e n t e r \" >\r\n" + 
				"< img src =\" img / cat . png \" style =\" p o s i t i o n : r e l a t i v e \" >\r\n" + 
				"</p >\r\n" + 
				"< script >\r\n" + 
				"var cat = d o c u m e n t . q u e r y S e l e c t o r (\" img \") ;\r\n" + 
				"var angle = 0 , l a s t T i m e = null ;\r\n" + 
				"f u n c t i o n a n i m a t e ( time ) {\r\n" + 
				"if ( l a s t T i m e != null )\r\n" + 
				"angle += ( time - l a s t T i m e ) * 0 . 0 0 1 ;\r\n" + 
				"l a s t T i m e = time ;\r\n" + 
				"cat . style . top = ( Math . sin ( angle ) * 20) + \" px \";\r\n" + 
				"cat . style . left = ( Math . cos ( angle ) * 200) + \" px \";\r\n" + 
				"r e q u e s t A n i m a t i o n F r a m e ( a n i m a t e ) ;\r\n" + 
				"}\r\n" + 
				"r e q u e s t A n i m a t i o n F r a m e ( a n i m a t e ) ;\r\n" + 
				"</ script >";				
				
				
		char[] espaco2 = espaco.toCharArray();
		String result = "";
		
		for(int i = 0; i < espaco2.length; i++)
			if(espaco2[i] != ' ') {
				result += "" + espaco2[i];
			}

		System.out.println(result);
	}

}
