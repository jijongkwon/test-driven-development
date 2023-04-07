package study.chap1;

public class Dollar extends Money{
    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiple){
        return new Dollar(amount * multiple);
    }
}
