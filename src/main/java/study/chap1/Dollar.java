package study.chap1;

public class Dollar extends Money{

    Dollar(int amount, String currency){
        super(amount,currency);
    }

    Money times(int multiple){
        return Money.dollar(amount * multiple);
    }

    String currency(){
        return currency;
    }
}
