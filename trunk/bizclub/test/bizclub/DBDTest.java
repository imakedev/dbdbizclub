package bizclub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import th.go.dbd.bizclub.service.BizClubService;

public class DBDTest {
	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");
		/*ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-data-test.xml");
		BizClubService bizClubService = (BizClubService) context
				.getBean("bizClubServiceImpl");*/
		DBDTest test=new DBDTest();
		//test.testLosList(bizClubService);
		System.out.println(test.genToken(8));
	}
	private String genToken(int number){
  		StringBuffer sb = new StringBuffer();
  	    for (int i = number; i > 0; i -= 12) {
  	      int  n= Math.min(12, Math.abs(i));
  	      sb.append(org.apache.commons.lang3.StringUtils.leftPad(Long.toString(Math.round(Math.random() * Math.pow(36, n)), 36), n, '0'));
  	    }
  	    return sb.toString();
	}
	public void testLosList(BizClubService bizClubService) {

		
		/* List va= (String[])list.get(0); */

	}
}
