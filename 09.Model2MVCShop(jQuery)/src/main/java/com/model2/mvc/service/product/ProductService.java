package com.model2.mvc.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


/*
 * ��ǰ������ �߻�ȭ ĸ��ȭ�� ProductService Interface
 */

public interface ProductService {
	
	// ��ǰ ���
	public void addProduct(Product product) throws Exception;
	
	// ��ǰ ��ȸ
	public Product findProduct(int prodNo) throws Exception;
	
	// ��ǰ ��� ��ȸ
	public Map<String,Object> getProductList(Search search) throws Exception;
	
	// ��ǰ ����
	public void updateProduct(Product product) throws Exception;
	
}