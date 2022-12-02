package ProductUsecase;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import Bean.Product;
import UTILITY.EMUTILITY;


public class Main2 {

	public static void main(String[] args) {
		
		
		
		EntityManager em=EMUTILITY.provideEntityManager();
		Query query= em.createNamedQuery("findEmployeeName");
		query.setParameter("id", 15);
		
	 Product product=(Product) query.getSingleResult();
		
	 System.out.println(product);
	 
		
	} 
}
