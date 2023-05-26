package minsang.toy.chat.hellocdpa;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ChatMessageEntity {
    private Long id;

    private ChatRoomEntity chatRoomEntity;

    private String writer;

    private String message;

    private LocalDateTime sendDate;

    public static ChatMessageEntity toChatEntity(ChatMessageSaveDTO chatMessageSaveDTO, ChatRoomEntity chatRoomEntity){
        ChatMessageEntity chatMessageEntity = new ChatMessageEntity();

        chatMessageEntity.setChatRoomEntity(chatRoomEntity);

        chatMessageEntity.setWriter(chatMessageSaveDTO.getWriter());
        chatMessageEntity.setMessage(chatMessageSaveDTO.getMessage());

        return chatMessageEntity;

    }
}