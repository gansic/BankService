package tech.itpark;

public class Main {
    public static void main(String[] args) {
        BankServise servise = new BankServise();
        double result = servise.calculate(4000);
        System.out.println(result);

        BankDeposit percent = new BankDeposit();
        float cash = percent.save(44_500);
        System.out.println(cash);



    }



}
