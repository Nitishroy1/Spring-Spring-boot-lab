package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IProductDAO;
import com.nt.data.ProductBean;
@Service("productService")
public class ProductService implements IProductService {
    @Autowired
	private IProductDAO pdao;
	@Override
	public String insert_Data(ProductBean pb) throws Exception {
		// TODO Auto-generated method stub
		String insert_Data = pdao.insert_Data(pb);
		return insert_Data;
	}

	@Override
	public String update_Data(ProductBean pb) throws Exception {
		// TODO Auto-generated method stub
		String update_Data = pdao.update_Data(pb);
		return update_Data;
	}

	@Override
	public String delete_Data(String pcode) throws Exception {
		// TODO Auto-generated method stub
		String delete_Data = pdao.delete_Data(pcode);
		return delete_Data;
	}

	@Override
	public List<ProductBean> retrive_Data() throws Exception {
		// TODO Auto-generated method stub
		List<ProductBean> retrive_Data = pdao.retrive_Data();
		return retrive_Data;
	}

}
