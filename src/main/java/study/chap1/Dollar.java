package study.chap1;

public class Dollar {
    int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiple){
        return new Dollar(amount * multiple);
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
