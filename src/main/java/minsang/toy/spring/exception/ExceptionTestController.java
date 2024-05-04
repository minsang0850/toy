package minsang.toy.spring.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExceptionTestController {

    @GetMapping("/exception")
    public String showExcpetion(@RequestParam("exceptionName") String exceptionName) {
        if("NOT_FOUND".equals(exceptionName)) {
            throw new NotFoundException();
        }
        return "";
    }
}
