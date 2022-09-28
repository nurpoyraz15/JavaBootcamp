package classes;

public class Main {

	public static void main(String[] args) {
		CustemorManager custemorManager = new CustemorManager ();
		custemorManager.Add();
		custemorManager.Remove();
		custemorManager.Update();

		
		int sayi1 = 45;
		int sayi2 = 55;
		sayi2 = sayi1;
		sayi1 = 50;
		 System.out.println(sayi2);
		 
	  DortIslem dortIslem = new  DortIslem ();
	  int sonuc = dortIslem.Toplam (5,9);
	    System.out.println (sonuc);
	    
	    
	    Custemor custemor = new  Custemor ();
	    custemor.id = 548794;
	    System.out.println(custemor.id);
	    custemor.firstName= "Engin";
	    System.out.println(custemor.firstName);
	    custemor.phoneNumber = 364924924;
	     System.out.println( custemor.phoneNumber);
	      
	      
	    Employee employee = new  Employee ();
	   
	    employee.id = 5637249;
	      System.out.println(employee.id);
	    employee.firstName = "Nur";
	    System.out.println(employee.firstName);
	    employee.lastName = "Poyraz";
	    System.out.println( employee.lastName);
	    employee.age = 22;
	    System.out.println(employee.age);
	    employee.bulunduguSehir = "Konya";	
	    System.out.println(employee.bulunduguSehir);
	    
	}

}
