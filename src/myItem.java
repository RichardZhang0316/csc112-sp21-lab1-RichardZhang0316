// simple class to hold an item an its price
//
// Richard Zhang
// Feb 2ed 2021

public class myItem {

    // store item name and store item unit price
    private String itemName;
    private double itemPrice;

    public myItem(){
    itemName="none";
    itemPrice=0.0;
    }

    public myItem(String name, double price){
        itemPrice=price;
        itemName=name;
    }

    public void setItemPrice(double price){
        itemPrice=price;
    }

    public void setItemName(String name){
        itemName=name;
    }

    public String getItemName(){
        return itemName;
    }

    public double getItemPrice(){
        return itemPrice;
    }

    // Override Object methods:  toString() and equals(Object)
    //
    // David John
    // January 2021

    @Override
    public String toString(){
        return itemName + "  " + itemPrice;
    }

    @Override
    public boolean equals(Object other){

        // if the two objects are the same object then they are equal
        if (this == other) return true;

        // if other is not a myItem object then they are not equal
        if (!(other instanceof myItem)) return false;

        myItem temp = (myItem)other;
        return this.itemName.equalsIgnoreCase(temp.itemName);
    }
}

