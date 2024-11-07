import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexCalculatorTest {

    private final AdvanceIntegerCalculator complexCalculator = new AdvanceIntegerCalculator();

    @Test
    public void squareRootOfOne(){
        assertEquals(1,complexCalculator.IntegerSquareRoot(1));
    }
    @Test
    public void squareRootOfZero(){
        assertEquals(0,complexCalculator.IntegerSquareRoot(0));
    }
    @Test
    public void squareRootOfANegativeNumber(){
        assertEquals(-1,complexCalculator.IntegerSquareRoot(-5));
    }
    @Test
    public void squareRootOfFour(){
        assertEquals(2,complexCalculator.IntegerSquareRoot(4));
    }
    @Test
    public void squareRootOfThree(){
        assertEquals(-1,complexCalculator.IntegerSquareRoot(3));
    }
    @Test
    public void squareRootOfBigNumberWithIntegerSquareRoot(){
        assertEquals(16000,complexCalculator.IntegerSquareRoot(256000000));
    }
    @Test
    public void squareRootOfBigNumberWithoutIntegerSquareRoot(){
        assertEquals(-1,complexCalculator.IntegerSquareRoot(256000001));
    }

    @Test
    public void IntegerModuloOfZeroModX(){
        assertEquals(0,complexCalculator.IntegerModulo(0, 25));
    }
    @Test
    public void IntegerModuloOfXModX(){
        assertEquals(0,complexCalculator.IntegerModulo(25, 25));
    }
    @Test
    public void IntegerModuloOfXModOne(){
        assertEquals(0,complexCalculator.IntegerModulo(25, 1));
    }
    @Test
    public void IntegerModuloOfOneModX(){
        assertEquals(1,complexCalculator.IntegerModulo(1, 25));
    }
    @Test
    public void IntegerModuloOfXModY(){
        assertEquals(10,complexCalculator.IntegerModulo(250, 24));
    }


}
