package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;
    boolean isExtracheese;

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public boolean isExtracheese() {
        return isExtracheese;
    }

    public void setExtracheese(boolean extracheese) {
        isExtracheese = extracheese;
    }

    public boolean isExtratopping() {
        return isExtratopping;
    }

    public void setExtratopping(boolean extratopping) {
        isExtratopping = extratopping;
    }

    public boolean isBill() {
        return isBill;
    }

    public void setBill(boolean bill) {
        isBill = bill;
    }

    public boolean isBag() {
        return bag;
    }

    public void setBag(boolean bag) {
        this.bag = bag;
    }

    boolean isExtratopping;
    boolean isBill;
    boolean bag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }else{
            this.price = 400;
            this.toppings = 120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtracheese){
            this.price +=80;
            isExtracheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtratopping){
            this.price += this.toppings;
            isExtratopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bag){
            this.price+=20;
            bag = true;
        }
    }

    public String getBill(){
        // your code goes here
            if(isExtracheese){
                this.bill += "Extra Cheese Added: 80"+"\n";
            }
            if(isExtratopping){
                this.bill +="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(bag){
                this.bill +="Paperbag Added: 20"+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";

            return this.bill;
    }
}
