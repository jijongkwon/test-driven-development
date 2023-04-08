package study.chap1;

public class Franc extends Money {

    Franc(int amount, String currency){
        super(amount, currency);
    }

    Money times(int multiple){
        return Money.franc(amount * multiple);
    }

    String currency(){
        return currency;
    }
}
