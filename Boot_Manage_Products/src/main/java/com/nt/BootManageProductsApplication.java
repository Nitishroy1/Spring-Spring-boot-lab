package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.ProductController;
import com.nt.data.ProductBean;

@SpringBootApplication
public class BootManageProductsApplication {

    private final ProductController productController;

    BootManageProductsApplication(ProductController productController) {
        this.productController = productController;
    }

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx=SpringApplication.run(BootManageProductsApplication.class, args);
		   Scanner sc=new Scanner(System.in))
		{
			while(true) {
			System.out.println("What You Want: ");
			System.out.println("1) INSERT PRODUCT DATA:");
			System.out.println("2) UPDATE PRODUCT DATA: ");
			System.out.println("3) DELETE PRODUCT DATA: ");
			System.out.println("4) VIEW PRODUCT DATA");
			System.out.println("5) EXIT...");
			System.out.print("Enter Your Choice: ");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1 ->{
				ProductBean pb=new ProductBean();
				System.out.print("Enter Product Code: ");
				pb.setP_code(sc.nextLine());
				System.out.print("Enter Product Name: ");
				pb.setP_name(sc.nextLine());
				System.out.print("Enter Product Company: ");
				pb.setP_company(sc.nextLine());
				System.out.print("Enter Product Price: ");
			    pb.setP_price(sc.nextLine());
				System.out.print("Enter Product qty: ");
				pb.setP_qty(sc.nextLine());
				ProductController bean = ctx.getBean("productController",ProductController.class);
				String insert_Data = bean.insert_Data(pb);
				System.out.println(insert_Data);
				System.out.println("--------------------End----------------------------");
			}
			case 2 ->{
				ProductBean pb=new ProductBean();
				System.out.print("Enter Product Code: ");
				pb.setP_code(sc.nextLine());
				System.out.print("Enter Product Name: ");
				pb.setP_name(sc.nextLine());
				System.out.print("Enter Product Company: ");
				pb.setP_company(sc.nextLine());
				System.out.print("Enter Product Price: ");
			    pb.setP_price(sc.nextLine());
				System.out.print("Enter Product qty: ");
				pb.setP_qty(sc.nextLine());
				ProductController bean = ctx.getBean("productController",ProductController.class);
				String insert_Data = bean.update_Data(pb);
				System.out.println(insert_Data);
				System.out.println("--------------------End----------------------------");
			}
			case 3->{
				System.out.print("Enter Product Code: ");
				String p_code=sc.nextLine();
				ProductController bean = ctx.getBean("productController",ProductController.class);
				String delete_Data = bean.delete_Data(p_code);
				System.out.println(delete_Data);
				System.out.println("--------------------End----------------------------");
				
			}
			case 4 ->{
				System.out.println("---------------All Product Data------------------------ :");
				ProductController bean = ctx.getBean("productController",ProductController.class);
				List<ProductBean> retrive_Data = bean.retrive_Data();
				retrive_Data.forEach(product-> {
				System.out.println(product);});
				System.out.println("--------------------End----------------------------");
			}
			case 5->{
				System.out.println("Thanks to used Our Services....");
				System.out.println("--------------------End----------------------------");
				System.exit(0);
			}
			}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
