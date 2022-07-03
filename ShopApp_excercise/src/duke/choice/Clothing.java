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
public class Clothing {

    private String description;
    private String size = "M";
    private double price;
    private final double Min_price = 10.0;
    private final double Min_tax = 0.2;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

    /**
     * @return the price
     */
    public double getPrice() {
        return price * (price + Min_tax);
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
//        if (price < Min_price) {
//            this.price = price;
//        }
        this.price = (price < Min_price) ? price : Min_price;
    }

}
