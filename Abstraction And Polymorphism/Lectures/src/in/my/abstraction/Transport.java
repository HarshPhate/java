package in.my.abstraction;

public interface Transport {                          //interface ke ander sab publichona jaruri hai

//    public abstract void getsetho();            //interfce ke ander saare method public and abstarct hote hai
                                                  //can't define seperately like this


    void getsetho();                           //create direct method like this



    default void start() {                                  //default method
            System.out.println("Vehicle started");
        }
}
