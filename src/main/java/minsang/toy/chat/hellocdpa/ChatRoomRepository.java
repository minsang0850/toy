package minsang.toy.chat.hellocdpa;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChatRoomRepository {
    public ChatRoomEntity findByRoomId(String roomId) {
        return ChatRoomEntity.toChatRoomEntity("방A", "roomId-A", "mentor");
    }

    public List<ChatRoomEntity> findAll(){
        return List.of(ChatRoomEntity.toChatRoomEntity("방A", "roomId-A", "mentor"));
    }

    public void save(ChatRoomEntity chatRoomEntity) {

    }

    public void deleteById(Long chatRoomId) {

    }

    public ChatRoomDetailDTO getRoomDetail() {
        ChatRoomDetailDTO chatRoomDetailDTO = new ChatRoomDetailDTO();

        chatRoomDetailDTO.setChatRoomId(1l);
        chatRoomDetailDTO.setChatMentor("mentor");
        chatRoomDetailDTO.setRoomId("roomId-A");
        chatRoomDetailDTO.setName("방A");

        return chatRoomDetailDTO;
    }
}
