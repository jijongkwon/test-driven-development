package study.chap1;

public class Dollar {
    int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiple){
        this.amount *= multiple;
        return new Dollar(amount);
    }
}
