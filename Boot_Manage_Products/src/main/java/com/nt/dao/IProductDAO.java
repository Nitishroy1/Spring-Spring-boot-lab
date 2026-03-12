package com.nt.dao;

import java.util.List;

import com.nt.data.ProductBean;

public interface IProductDAO {
  public String insert_Data(ProductBean pb)throws Exception;
  public String update_Data(ProductBean pb)throws Exception;
  public String delete_Data(String pcode)throws Exception;
  public List<ProductBean> retrive_Data()throws Exception;
}
