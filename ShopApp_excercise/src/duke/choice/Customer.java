/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author hp
 */
public class Customer {
    private String name;
    private String size;
    
    private Clothing[] items;
    
    
    
    public void addItem(Clothing[] someItem){
        items = someItem;
    }

    
    public Clothing[] getItem(){
        return items;
    }
    
    
    
    
    public double getTotalCost(){
        double total = 0.0;
        for (Clothing item : items) {
           // if (item.getSize().equals(CUS.getSize())) {
                //total += item.getPrice();
                System.out.println("Item is : " + item.getDescription() + "\n" + " with price : " + item.getPrice() + "\n" + " with size : " + item.getSize());
            
             //   total = total * (total + tax);
                System.out.println("Total = " + total);
            }
       // }
        return total;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement){
          switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("L");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("X");
        }
    }
}
