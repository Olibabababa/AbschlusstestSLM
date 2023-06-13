package at.technikum.abschlusstestslm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DigitSumApplication{

    private static int usage = 0;

    @GetMapping("/api/digitsum")
    public static int getDigitSum(@RequestParam int number){
        int digit;
        int sum = 0;

        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        usage++;
        return sum;
    }

    @GetMapping("/api/digitsum/usage")
    public static int usage(){
        return usage;
    }
}
