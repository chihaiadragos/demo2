package homework.task8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/api")
public class RandomBooleanProviderController {
    @Autowired
    private RandomBooleanProvider randomBooleanProvider;
    @GetMapping("/random-boolean")
    public @ResponseBody Integer getValue() {
        return randomBooleanProvider.getValue();
    }

}
