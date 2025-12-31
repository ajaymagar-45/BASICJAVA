package Logic;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class FactorialOfGivenNumber {

    public static void main(String[] args) {
        int a=5;
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;

        }
        System.out.println(fact);
        FactorialOfGivenNumber s=new FactorialOfGivenNumber();

    }
}
