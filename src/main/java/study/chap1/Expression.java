package study.chap1;

/**
 *  핵심 : 객체가 다른 부분에 대헤서 될 수 있는 한 모르도록 노력
 *  -> 객체가 오랫 동안 유연, 테스트 하기 쉬움
 */
public interface Expression {

    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
