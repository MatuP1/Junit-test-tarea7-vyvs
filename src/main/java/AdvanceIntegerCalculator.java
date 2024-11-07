public class AdvanceIntegerCalculator {

    public int IntegerSquareRoot(int x){
        int squareRoot = 0;
        if (x == 0)
            return squareRoot;
        if (x < 0)
            return -1;

        int i = x / 2;
        int j = 0;
        while (j<=i){
            j++;
            int square = j*j;
            if(square==x)
                return j;
            if(square>x)
                return -1;
        }
        return squareRoot;
    }
    public int IntegerModulo(int x,int y){
        int q = x/y;
        if (q == 0){
            return x;
        }
        return x - q*y;
    }
}
