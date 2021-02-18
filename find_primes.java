import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
public class find_primes
{
    public static void main(String[] args)
   {
    List<Integer> list = new ArrayList<>();
    int N = 10000000;
    list.add(2);
    for(int i=3 ; i <= N ; i++)
        {
            boolean flag = false; // false stands for prime number 
            for(int one_prime_of_list : list)
                {
                    if(i%one_prime_of_list == 0)
                    {
                        flag = true;
                        break;
                    }
                    if(one_prime_of_list > Math.sqrt(i))
                    {
                        break;
                    }
                }
            if(flag == false)
                {
                    list.add(i);
                    i++; // becuse numers are decussate even
                }
        }
    for(int a : list)
    {
        System.out.println(a);
        // add to file
    }
    System.out.printf("list size is : %d \n",list.size());
    System.out.printf("what formula guess  is : %.4f\n", N/Math.log1p(N));
    System.out.printf("(list size - formula guess)/N  is : %.4f\n", (list.size() - N/Math.log1p(N))/N);

   }
}