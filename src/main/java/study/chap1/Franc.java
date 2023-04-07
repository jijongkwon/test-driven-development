package study.chap1;

public class Franc {
    private int amount;

    Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiple){
        return new Franc(amount * multiple);
    }

    public boolean equals(Object object){
        Franc dollar = (Franc) object;
        return amount == dollar.amount;
    }
}
