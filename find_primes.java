import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.Math;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.bind.JAXB;

public class find_primes
{
    public static void main(String[] args)
   {
    int N = 10000000;
    Primes primes = new Primes();
    Prime prime = new Prime(2); // first prime number
    primes.getPrimes().add(prime);

    for(int i=3 ; i <= N ; i++)
        {
            boolean flag = false; // false stands for prime number 
            for(Prime one_prime_of_list : primes.getPrimes())
                {
                    if(i%one_prime_of_list.getPrimeNumber() == 0)
                    {
                        flag = true;
                        break;
                    }
                    if(one_prime_of_list.getPrimeNumber() > Math.sqrt(i))
                    {
                        break;
                    }
                }
            if(flag == false)
                {
                    Prime prime_ = new Prime(i); // first prime number
                    primes.getPrimes().add(prime_);
                    i++; // becuse numers are decussate even
                }
        }
    /* for print 
    for(Prime one_prime_of_list : primes.getPrimes())
    {
        System.out.println(one_prime_of_list);
        // add to file
    }
    System.out.printf("list size is : %d \n",Prime.getPrimeCount());
    System.out.printf("what formula guess  is : %.4f\n", N/Math.log1p(N));
    System.out.printf("(list size - formula guess)/N  is : %.4f\n", (Prime.getPrimeCount() - N/Math.log1p(N))/N);
    */
    
    try
    {
        BufferedWriter output = Files.newBufferedWriter(Paths.get("prime_list.xml"));
        JAXB.marshal(primes, output);
    }
    catch (IOException ioException){

        System.out.println("Error opeinig file. terminating.");

    }

   }
}