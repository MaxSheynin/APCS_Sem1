package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;
    
    public ShoppingCartItem(){
        itemName = "Nothing";
        itemCost = 0;
        quantity = 0;
    }
    public ShoppingCartItem(String a, double b, int c){
        itemName = a;
        itemCost = b;
        quantity = c;
    }
    public void cartToString(){
        System.out.println("You have " + quantity + " of " + itemName + " for $" + itemCost + " each");
    }
    public String getItemName(){
        return itemName;
    }
    public double getTotalCost(){
        return (quantity*itemCost);
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotalWithTax(){
        return (quantity*itemCost)*(1.12);
    }
    public double quantityToCostCalculator(int a){
        return (itemCost*a);
    }
    public boolean compareItemCost(ShoppingCartItem a){
        if(itemCost<a.itemCost){
            return true;
        }
        else{
            return false;
        }
    }
    public ShoppingCartItem copyCart(){
        ShoppingCartItem ItemX = new ShoppingCartItem(itemName, itemCost, quantity);
        return ItemX;
    }
}
