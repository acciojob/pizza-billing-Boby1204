package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    static int bagPrice = 20;
    boolean isCheeseAdded = false;
    boolean isToppingsAdded = false;
    boolean isBagAdded = false;
    boolean isBillGenerated = false;
    private int totalPrice;

    public Pizza(Boolean isVeg){

        if (isVeg){
            price =300;
            cheesePrice =80;
            toppingsPrice = 70;
        }
        else {
            price = 400;
            cheesePrice =80;
            toppingsPrice = 120;

        }
        bill = "Base Price Of The Pizza:"+price+"\n";
    }

    public int getPrice(){

        return this.totalPrice;
    }

    public void addExtraCheese(){
        if (isCheeseAdded == false){
            this.totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;
            // to prevent it from adding again cheese
        }

    }

    public void addExtraToppings(){
        if(isToppingsAdded == false){
           this.totalPrice = totalPrice +toppingsPrice;
           isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if (isBagAdded == false){
            toppingsPrice = totalPrice + bagPrice;
            isBagAdded = true;
        }

    }

    public String getBill(){
        if (isBillGenerated == false){
              if (isCheeseAdded == true)
              {
                  bill = bill+ "Extra Cheese Added:" + cheesePrice+"\n";
              }
              if(isToppingsAdded){
                  bill = bill +"Extra Toppings Added:"+ toppingsPrice+"\n";
              }
              if(isBagAdded== true){
                  bill = bill + "Paperbag Added:"+bagPrice+"\n";
              }
              bill = bill + "Total Price:"+totalPrice+"\n";
              isBillGenerated = true;
              return  bill;
        }
        return this.bill;
    }
}
