package minsang.toy.chat.hellocdpa;

import org.springframework.stereotype.Repository;

@Repository
public class ChatRoomRepository {
    public ChatRoomEntity findByRoomId(String roomId) {
        return ChatRoomEntity.toChatRoomEntity("방A", "roomId-A", "mementor");
    }
}
