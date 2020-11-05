package tech.itpark;

public class BankDeposit {
    float save(float percentageCash) {
        int percent = 5;
        int deposit = 10_000;
        float get = (percentageCash * percent) / 100 / 12;
        if (percentageCash >= deposit) {
            return get;
        }
        return 0;
    }



}
