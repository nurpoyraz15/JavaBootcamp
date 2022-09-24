package oop1;

/**
 * @author Dell
 *
 */
public class Product {
	//PascalCase classların tutulma şekli.
//	String name;
	// fieldlar camelCase yazılır.
//	double unitPrice;
//	double discount;
//	String imageUrl;
//	int unitsInStock;
	
	// get okurken, set veri yazarken yapmış olduğumuz işlem olup yalnızca get ya da set işlemi yaptırılabilir.
	private String name;
	
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
   // private talnızca o cllas'ın içinde kullanilabilir demektir. kelime anlamı özel demek olup bu classa özel anlamı olur.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	

}
