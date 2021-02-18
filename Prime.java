public class Prime {
    
    private int primeNumber;
    private int primeIndex;
    private static int primeCount;

    Prime(int primeNumber){

        if(check_is_prime(primeNumber)){

            this.primeNumber  = primeNumber;
            primeCount++;
            this.primeIndex = primeCount;

        }
        else {
            System.err.printf(" %d not prime number ",primeNumber);
        }
        
    }

    private static boolean check_is_prime(int prime){
        // check online
        return true; // if its prime
    }
    

    public int getPrimeNumber() {return primeNumber;}

    public int getPrimeIndex() {return primeIndex;}

    public void setPrimeNumber(int primeNumber){
        this.primeNumber = primeNumber;
    }

    public static int getPrimeCount(){return primeCount;}

    @Override
    public String toString(){
        return String.format("primeNumber is : %d  primeIndex is : %d ", primeNumber , primeIndex);
    }




}
