import java.util.*;
class PrimeCalculator {
    boolean isPrimeNumber(int n){
        if(n<2)
            return false;
        if(n==2)
            return true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    int nth(int nth) {
        if(nth<=0)
            throw new IllegalArgumentException();
        ArrayList<Integer> primeNumberArray = new ArrayList<Integer>();          for(int i=2;primeNumberArray.size()<=nth;i++){
            if(isPrimeNumber(i)){
                primeNumberArray.add(i);
            }
        }
        return primeNumberArray.get(nth-1);
    }

}