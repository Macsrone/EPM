package Assignment14.q14;


public class Item {
  
   //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    public Item(String name, int catalogNumber, int quantity, double price) {
		super();
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = quantity;
		this.price = price;
	}

	/**
     * public constructor with:
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */
   

    public void setName(String name) {
		this.name = name;
	}

	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getCatalogNumber() {
		return catalogNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", catalogNumber=" + catalogNumber + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

	/**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    
  
}