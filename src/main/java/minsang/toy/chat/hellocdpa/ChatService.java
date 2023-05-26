package minsang.toy.chat.hellocdpa;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ChatService {
    public List<ChatMessageDetailDTO> findAllChatByRoomId(String roomId) {
        return Collections.emptyList();
    }
}
