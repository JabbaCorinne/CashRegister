public class Product {

    public void SetQuantity(int quaunt){

    }
    String name;
    String type;
    protected int code;
    protected boolean taxEligible;
    protected double price;
    int inventory;


    public Product(String newName, int newCode, boolean isTaxEligible, double newPrice, int newInventory, String newType) {

        name = newName;
        type = newType;
        code = newCode;
        taxEligible = isTaxEligible;
        price = newPrice;
        inventory = newInventory;

        System.out.printf("There are %d units of %s available. Each is priced at $%.2f. They are %s and can be found in our %s department.\n",inventory,name,price,isTaxEligible ? "tax eligible" : "not tax eligible",type);

        }

}

