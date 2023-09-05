package minsang.toy.chat.hellocdpa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ChatServiceImpl implements ChatService {
    private final ChatRoomRepository crr;
    private final ChatRepository cr;

    //채팅방 전체보기
    @Override
    public List<ChatRoomDetailDTO> findAllRooms() {
        List<ChatRoomEntity> chatRoomEntityList = crr.findAll();
        List<ChatRoomDetailDTO> chatRoomList = new ArrayList<>();

        for (ChatRoomEntity c : chatRoomEntityList) {
            chatRoomList.add(ChatRoomDetailDTO.toChatRoomDetailDTO(c));
        }

        return chatRoomList;
    }

    // 채팅방 Id로 채팅방찾기
    @Override
    public ChatRoomDetailDTO findRoomById(String roomId) {
//        ChatRoomEntity chatRoomEntity = crr.findByRoomId(roomId);
//        ChatRoomDetailDTO chatRoomDetailDTO = ChatRoomDetailDTO.toChatRoomDetailDTO(chatRoomEntity);
//        return chatRoomDetailDTO;
        return crr.getRoomDetail();
    }

    //채팅방 생성하기
    @Override
    public void createChatRoomDTO(String name, int password, String chatMentor) {
        ChatRoomDTO room = ChatRoomDTO.create(name);
        ChatRoomEntity chatRoomEntity = ChatRoomEntity.toChatRoomEntity(room.getName(), room.getRoomId(), chatMentor);
        crr.save(chatRoomEntity);
    }

    @Override
    public void deleteById(Long chatRoomId) {
        crr.deleteById(chatRoomId);
    }

    //채팅 이력 보여주기
    @Override
    public List<ChatMessageDetailDTO> findAllChatByRoomId(String roomId) {
        List<ChatMessageEntity> chatMessageEntityList = cr.findAllByChatRoomEntity_RoomId(roomId);
        List<ChatMessageDetailDTO> chatMessageList = new ArrayList<>();
        for (ChatMessageEntity c : chatMessageEntityList) {
            chatMessageList.add(ChatMessageDetailDTO.toChatMessageDetailDTO(c));
        }
        return chatMessageList;
    }
}
