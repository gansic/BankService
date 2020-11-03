package tech.itpark;

public class BankServise {
    double calculate (double cashback){

        double low = 5_000;
        double lowback = (cashback * 5) / 100;
        if (cashback <= low){
            return lowback;

        }

        double average = 10_000;
        double averback = (cashback * 10) / 100;
        if (cashback <= average) {
            return averback;
        }

        double extra = 20_000;
        double exback = (cashback * 15) / 100;
        if (cashback <= extra) {
            return exback;
        }


        return 0;




    }



}
