import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    public void Roots() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double[] x = quadraticEquation.Roots(1,-7,10);

        int n = x.length;

        if (n == 2){
            double x1 = x[0];
            double x2 = x[1];
            if (x1 >x2){
                double min = x1;
                x1 = x2;
                x2 = min;
            }
            assertEquals(2,x1);
            assertEquals(5,x2);
        }else{
            double x3 = x[0];
            assertEquals(-2, x3);
        }
    }
}