package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.data.ProductBean;
@Repository("productDAO")
public class ProductDAO implements IProductDAO {
	private static final String INSERT_PRODUCT_DATA="INSERT INTO PRODUCT VALUES(?,?,?,?,?)"; 
	private static final String UPDATE_PRODUCT_DATA="UPDATE PRODUCT SET PNAME=?,PCOMPANY=?,PPRICE=?,PQTY=? WHERE PCODE=?"; 
	private static final String DELETE_PRODUCT_DATA="DELETE FROM PRODUCT WHERE PCODE=?"; 
	private static final String RETRIVE_PRODUCT_DATA="SELECT * FROM PRODUCT"; 
	@Autowired
	private DataSource ds;
   //insert
	@Override
	public String insert_Data(ProductBean pb)throws Exception {
		int count;
	    try(Connection con=ds.getConnection();
	    	PreparedStatement pstmt=con.prepareStatement(INSERT_PRODUCT_DATA)) {
			pstmt.setString(1, pb.getP_code());
			pstmt.setString(2, pb.getP_name());
			pstmt.setString(3, pb.getP_company());
			pstmt.setString(4, pb.getP_price());
			pstmt.setString(5, pb.getP_qty());
			count=pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
		return count==0?"Product Data Not Inserted":"Product Data Inserted Succesfully";
	}
	
//Update
	@Override
	public String update_Data(ProductBean pb)throws Exception {
		
		int count;
	    try(Connection con=ds.getConnection();
	    	PreparedStatement pstmt=con.prepareStatement(UPDATE_PRODUCT_DATA)) {
			pstmt.setString(5, pb.getP_code());
			pstmt.setString(1, pb.getP_name());
			pstmt.setString(2, pb.getP_company());
			pstmt.setString(3, pb.getP_price());
			pstmt.setString(4, pb.getP_qty());
			count=pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
		return count==0?"Product Data Not UPDATED":"Product Data UPDATED Succesfully";
	}
//delete
	@Override
	public String delete_Data(String pcode)throws Exception {
		int count;
		try(Connection con=ds.getConnection();
			PreparedStatement pstmt =con.prepareStatement(DELETE_PRODUCT_DATA)) {
			pstmt.setString(1,pcode);
			count=pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		}
		return count==0?"Product data not deleted":"product data deleted succesfully";
	}
//Retrieve
	@Override
	public List<ProductBean> retrive_Data()throws Exception {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection con=ds.getConnection();
			PreparedStatement pstmt =con.prepareStatement(RETRIVE_PRODUCT_DATA)) {
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductBean pb=new ProductBean();
				pb.setP_code(rs.getString(1));
				pb.setP_name(rs.getString(2));
				pb.setP_company(rs.getString(3));
				pb.setP_price(rs.getString(4));
				pb.setP_qty(rs.getString(5));
				list.add(pb);
			}
			
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

}
