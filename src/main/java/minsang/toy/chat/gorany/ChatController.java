package minsang.toy.chat.gorany;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class ChatController {

    @GetMapping("/chat")
    public String chatGET(@RequestParam("userName") String userName, Model model){

        log.info("@ChatController, chat GET()");
        model.addAttribute("userName", userName);
        return "gorany/chat";
    }
}
