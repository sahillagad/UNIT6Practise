package DAO;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;

import BEAN.PRODUCT;
import Utility.EMUtility;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String AddProducts(PRODUCT product) {
	
		EntityManager em=EMUtility.provideEntityManager();
		
         em.getTransaction().begin();
          
         
         em.persist(product);
          
          
          
		
		em.getTransaction().commit();
		
		
		return null;
	}

	@Override
	public PRODUCT getProductById(int productId) {

		PRODUCT product=null;
	 EntityManager em=EMUtility.provideEntityManager();
         
	  product= em.find(PRODUCT.class,productId);
	 
	 
	  em.close();
	 return product;
	 
	}
	
	

}
