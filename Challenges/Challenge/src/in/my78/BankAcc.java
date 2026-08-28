package in.my78;

 class BankAcc {
    private String AccountNumber;
    private String AccountHolderName;

    private double balance;

     public BankAcc(String accountNumber, String accountHolderName) {
         AccountNumber = accountNumber;
         AccountHolderName = accountHolderName;

     }

     public void deposit(double money){
         if(money <= 0){
             System.out.println("invlid deposit");
         }
        balance +=  money;
    }

    public double withdraw(double money){
        if(money <= 0){
            System.out.println("invlid withdraw");
        }else if(balance >= money){

        balance -= money;
        } else{
            money = balance;
            balance = 0;
        }
        return money;
    }
}
