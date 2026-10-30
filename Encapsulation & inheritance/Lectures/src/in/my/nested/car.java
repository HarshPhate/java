package in.my.nested;

public class car {
private  double noOfdoors;

    public void repair(){
      tire t = new tire();
    }

    protected class tire{
        private double width;
        private double pressure;

        private String material;

        public void inflate(){
            noOfdoors = 4;
        }
    }
}
