package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.data.ProductBean;
import com.nt.service.IProductService;

@Controller("productController")
public class ProductController {
	@Autowired
	private IProductService ps;
	 public String insert_Data(ProductBean pb)throws Exception{
		 String insert_Data = ps.insert_Data(pb);
		 return insert_Data;
	 }
	  
	 public String update_Data(ProductBean pb)throws Exception{
		 String update_Data = ps.update_Data(pb);
		 return update_Data;
	 }
	 public String delete_Data(String pcode)throws Exception{
		 String delete_Data = ps.delete_Data(pcode);
		 return delete_Data;
	 }
	 public List<ProductBean> retrive_Data()throws Exception{
		List<ProductBean> retrive_Data = ps.retrive_Data(); 
		return retrive_Data;
	} 
}
