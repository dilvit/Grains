import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        BigDecimal grainCount = new BigDecimal(0);
        BigDecimal grainWeight = new BigDecimal(5000);
        for (int i = 0; i < 64; i++) {
            double number  = Math.pow(2, i);
            grainCount =  (grainCount.add(new BigDecimal(number)));
        }
        list.add(grainCount);
        System.out.println(grainCount + " grains");
        System.out.println(grainCount.divide(grainWeight) + " kg (1 grain = 0.2 gram)");
    }
}
