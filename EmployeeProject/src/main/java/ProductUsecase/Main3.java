package ProductUsecase;
import java. util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import Bean.Product;
import UTILITY.EMUTILITY;

public class Main3 {

	
	public static void main(String[] args) {
		
		
		
		EntityManager em=EMUTILITY.provideEntityManager();
		Query query=em.createNativeQuery("select * from  product",Product.class);
		List<Product> list=query.getResultList();
		
		  for(Product pro:list) {
			  
			  System.out.println(pro);
		  }
		
	}
	
	
}
