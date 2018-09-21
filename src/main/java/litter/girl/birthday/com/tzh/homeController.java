package litter.girl.birthday.com.tzh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @RequestMapping("/birthday")
    @ResponseBody
    public String happyBirthday(){
        return "Happy Birthday To You ,  My Darling !";
    }
}

