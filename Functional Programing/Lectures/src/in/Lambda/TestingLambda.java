package in.Lambda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestingLambda {
    public static void main(String[] args) {
  TestingLambda lam = new TestingLambda();



        System.out.println(lam.sum(4,5));

  lam.print("Hello");
        }

        public void print(String toprint){
            System.out.println(toprint);
        }

        public int sum(int a, int b){
        int sum = a+b;

        return sum;
        }
    }
