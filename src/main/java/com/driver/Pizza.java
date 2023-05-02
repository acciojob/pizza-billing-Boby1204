package com.driver;

public class Pizza {

    private int price;
    private  Boolean isVeg;

    public String bill;
    private boolean isExtraTopping;
    private boolean isExtraCheese;
    private boolean isTakeAway;
    private boolean isBillGenerated;
    int vegPizzaPrice = 300;
    int nonVegPizzaPrice  =400;
    int cheese;
    int paper_bag;
    int topping;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraTopping  = false;
        this.isExtraCheese = false;
        this.isTakeAway = false;
        this.isBillGenerated = false;
        this.bill = "";
        if(isVeg){
            this.price = this.vegPizzaPrice;
            this.topping = 70;
        }
        else{
            this.price = this.nonVegPizzaPrice;
            this.topping = 120;
        }
        this.cheese = 80;
        this.paper_bag = 20;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price += cheese;
            isExtraCheese = true;

        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopping){
            this.price += topping;
            isExtraTopping = true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += paper_bag;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            if (isExtraCheese) {
                this.bill +=  "Extra Cheese Added : "+this.cheese+"\n";
            }
            if (isExtraTopping){
                this.bill += "Extra Toppings Added: " +this.topping+"\n";
            }

            if(isTakeAway){
                this.bill+= "Paperbag Added: "+this.paper_bag+"\n";
            }

            this.bill  += "Total Price: " +this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}