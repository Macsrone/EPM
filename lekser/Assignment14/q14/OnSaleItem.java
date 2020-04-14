package Assignment14.q14;


/**
 * SubClass of Item
 */
public class OnSaleItem extends Item {
    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    
    /**
     * getter for discount
     * @return
     */
   

    public OnSaleItem(String name, int catalogNumber, int quantity, double price) {
		super(name, catalogNumber, quantity, price);
		// TODO Auto-generated constructor stub
	}

	public double getDiscount() {
		return discount;
	}

	/**
     * setter for discount
     * @param discount
     */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "OnSaleItem [discount=" + discount + ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    
    }
