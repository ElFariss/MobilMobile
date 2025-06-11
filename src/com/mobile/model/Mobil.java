/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mobile.model;

import javax.swing.Icon;
/**
 *
 * @author parasite
 */
public class Mobil {
    private int ID;
    private int stok;
    private String merek;
    private String description;
    private double price;
    private String carName;
    private Icon image;
    public Mobil (int ID, int stok, String merek, String description, double price, String carName, Icon image) {
        this.ID = ID;
        this.stok = stok;
        this.merek = merek;
        this.description = description;
        this.price = price;
        this.carName = carName;
        this.image = image;
    }
    /**
     * @return the itemID
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }

    /**
     * @return the itemName
     */
    public String getmerek() {
        return merek;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setmerek(String merek) {
        this.merek = merek;
    }

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
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the brandName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setCarName(String brandName) {
        this.carName = brandName;
    }

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
}
