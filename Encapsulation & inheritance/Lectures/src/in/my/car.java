package in.my;

public class car {
    public String color;

    public String model;

    private double fuellevel;

     long costofPurchase;

    public car(){

    }

    public car(String color, String model, long costofPurchase, double fuellevel) {
        this.color = color;
        this.model = model;
        this.costofPurchase = costofPurchase;
        this.fuellevel = fuellevel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", fuellevel=").append(fuellevel);
        sb.append(", costofPurchase=").append(costofPurchase);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
