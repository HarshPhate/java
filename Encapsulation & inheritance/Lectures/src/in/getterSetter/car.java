package in.getterSetter;

public class car {
    private String color;     //public

    private String model;      //public

    private double fuellevel;

    private long costofPurchase;     //default

    public car(String color, String model, double fuellevel, long costofPurchase) {                 //we can apply access modifier on constructor also

        this.color = color;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costofPurchase = costofPurchase;
    }

    public String getcolor(){
        return color;
    }


    public void setColor(String color){
        if(color.equals("yellow")){
            System.out.printf("pagal hai kya ");
        }else{

        this.color = color;
        }
    }

   public String getModel(){
        return model;
    }


}
