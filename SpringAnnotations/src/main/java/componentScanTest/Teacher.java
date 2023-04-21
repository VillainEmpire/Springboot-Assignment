package componentScanTest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

    public String teach(){
        return "He is teaching spring boot.";
    }
}
