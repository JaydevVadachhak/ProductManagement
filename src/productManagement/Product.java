/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productManagement;

/**
 *
 * @author jaydev
 */
public class Product {
    
    private int id;
    private String name;
    private Float price;
    private String addDate;
    private byte[] picture;

    public Product(int pid, String pname, Float pprice, String paddDate, byte[] pimg) {
        
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = paddDate;
        this.picture = pimg;
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public Float getPrice(){
        return price;
    }
    
    public String getAddDate(){
        return addDate;
    }
    
    public byte[] getImage(){
        return picture;
    }
}
