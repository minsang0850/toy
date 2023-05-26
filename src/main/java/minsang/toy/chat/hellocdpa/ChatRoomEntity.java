package minsang.toy.chat.hellocdpa;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ChatRoomEntity {

    private Long id;

    private String roomId;

    private String roomName;

    private String chatMentor;

    private List<ChatMessageEntity> chatMessageEntityList = new ArrayList<>();


    public static ChatRoomEntity toChatRoomEntity(String roomName, String roomId, String chatMentor){
        ChatRoomEntity chatRoomEntity = new ChatRoomEntity();
        chatRoomEntity.setRoomName(roomName);
        chatRoomEntity.setRoomId(roomId);
        chatRoomEntity.setChatMentor(chatMentor);
        return chatRoomEntity;
    }
}
