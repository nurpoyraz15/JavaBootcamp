package oop1;

public class Main {

	public static void main(String[] args) {
		// Nesne Yönelimli Programlamaya Giriş:
		// OOP: Object Oriented Programming = Nesne güdümlü (yönelimli) programlama
		 Product product1= new Product ();
		    //set value yapmış olduğumuz değer atama işlemi.
		//    product1.name = "Delongi Kahve Makinesi";
		//     product1.unitPrice = 7500;
		//    product1.discount = 7;
		//     product1.unitsInStock = 3;
		//    product1.imageUrl = "bilmemne.jpg";
		 // yukardıdaki product1 işlemleri ile içerisinde birçok özelliği barındıran tek bir nesne belirlemiş olduk.
		 // classları array içinde tutabiliriz. içine product cinsinde bir şeyler yazabiliriz. String, integer yazamayız.
		    
		    //get=> yapmış olduğumuz okuma işlemi
		//   System.out.println(product1.name);
		 product1.setName("Delonghi Kahve Makinesi");
		 product1.setDiscount(7);
		 product1.setUnitPrice(7500);
		 product1.setUnitsInStock(3);
		 product1.setImageUrl("image1.jpg");
             //set=> yapmış olduğumuz yazma işlemi
		 
		 
		    Product product2= new Product ();  
		 //    product2.name = "Sneg Kahve Makinesi";
		 //   product2.unitPrice = 6500;
		 //    product2.discount = 8;
		 //    product2.unitsInStock = 2;
		 //    product2.imageUrl = "bilmemne2.jpg";
		    product2.setName("Smeg Kahve Makinesi");
			 product2.setDiscount(7);
			 product2.setUnitPrice(7500);
			 product2.setUnitsInStock(3);
			 product2.setImageUrl("image2.jpg");
		    
		    
		    Product product3= new Product ();
		 //    product3.name = "Kitchen Kahve Makinesi";
		 //   product3.unitPrice = 4500;
		 //    product1.discount = 9;
		 //   product3.unitsInStock = 4;
		 //    product3.imageUrl = "bilmemne3.jpg";
		    product3.setName("Kitchen Aid Kahve Makinesi");
			 product3.setDiscount(7);
			 product3.setUnitPrice(7500);
			 product3.setUnitsInStock(3);
			 product3.setImageUrl("image3.jpg");
		   
		    //üst kısımda yazmış olduğumuz veriler bir datadır. ve tek tek şimdi olduğu gibi yazılmaz.veri tabanından (database) gelir.
		    // ancak bizim mevcut db'miz oomadığı için elle yazıyoruz.
		    
		// 	Product[] products =  {product1, product2, product3};
		// 	for (Product product: products) {
		// 	System.out.println(product.name);
			
	Product [] products = {product1, product2, product3};
		//html haline getirmek için; yani ekrana çizmek için;
		System.out.println("<ul>");
		
		//<ul> açılış, </ul> kapanış. <ul> html etiketidir.
		//<li> açılış, </li> kapanış
		// for döngüsü ile productları tek tek gezmesimi istemiş oluyoruz.
   for (Product product: products) {
	// 	System.out.println("<li>" +product.name+ "</li>"); set işlemi yapmadan önceki hali. artık name değil getName() demeliyiz.
	   System.out.println("<li>" +product.getName()+ "</li>");
	   
	}
    
   // bir banka sitesinde bireysel ve kurumsal müşteri sayfaları oluşturmak için ilk önce custemor classı ardından da individualCustomer ve corporateCustomer olarak iki ayrı class oluşturduk.
	
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		 individualCustomer.setId(1);
		 individualCustomer.setPhone("052222222");
		 individualCustomer.setCustomerNumber("12345");
		 // bireysel müşterinin adı soyadı için  indivualCustomer classına private yapıp sourch ettik.
	     // individualCustomer classında işlem yaptıktan sonra burada da istediğimiz verileri giriyoruz.
		 individualCustomer.setFirstName("Engin");
		 individualCustomer.setLastName("Demiroğ");
		 
		 // kurumsal müşteriler için CorporateCustomer isimli yeni bir class açtık. ve o classta da extends ve private işlemleri yaptık
		 CorporateCustomer corporateCustomer = new  CorporateCustomer ();
		 corporateCustomer.setId(2);
		 corporateCustomer.setCustomerNumber("05333333");
		 corporateCustomer.setCompanyName("Kodlama.io");
		 corporateCustomer.setPhone("54367");
		 corporateCustomer.setTaxNumber("11111");
		 
		 // custemorların hepsini bir yerde tutmk için suctomer arrayi oluşturduk:
		 Customer[] custemors = {individualCustomer, corporateCustomer}	;
	
		 // individualCustemor ve corporateCustemor bir custemor (müşteri) olduğu için custemor tipinde array tutmamız halinde hata almayız.
	}
	
}	
					
				
				
		
		
	


