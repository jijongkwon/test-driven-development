package study.chap1;

public class Franc extends Money {

    Franc(int amount){
        this.amount = amount;
    }

    Money times(int multiple){
        return new Franc(amount * multiple);
    }
}
