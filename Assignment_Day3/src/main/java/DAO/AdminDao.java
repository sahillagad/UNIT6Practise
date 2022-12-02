package DAO;

import BEAN.PRODUCT;

public interface AdminDao {

	public String AddProducts(PRODUCT product);
	public PRODUCT getProductById(int productId);
	
	
}
