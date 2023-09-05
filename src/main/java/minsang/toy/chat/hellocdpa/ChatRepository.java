package minsang.toy.chat.hellocdpa;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChatRepository {
    public void save(ChatMessageEntity toChatEntity) {
        return;
    }

    public List<ChatMessageEntity> findAllByChatRoomEntity_RoomId(String roomId) {
        var a = new ChatMessageEntity();
        a.setId(1l);
        a.setWriter("aWriter");
        a.setMessage("aMessage");
        a.setChatRoomEntity(ChatRoomEntity.getMockChatRoomEntity());

        var b = new ChatMessageEntity();
        b.setId(2l);
        b.setWriter("aWriter");
        b.setMessage("bMessage");
        b.setChatRoomEntity(ChatRoomEntity.getMockChatRoomEntity());

        var c = new ChatMessageEntity();
        c.setId(3l);
        c.setWriter("aWriter");
        c.setMessage("cMessage");
        c.setChatRoomEntity(ChatRoomEntity.getMockChatRoomEntity());

        return List.of(a, b, c);
    }
}
