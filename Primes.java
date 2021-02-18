import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Primes {

    @XmlElement(name="prime")

    private List<Prime> primes = new ArrayList<>();

    public List<Prime> getPrimes() {return primes;}
    
}
