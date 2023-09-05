package minsang.toy.chat.hellocdpa;

import java.util.List;

public interface ChatService {
    //채팅방 전체보기
    List<ChatRoomDetailDTO> findAllRooms();

    // 채팅방 Id로 채팅방찾기
    ChatRoomDetailDTO findRoomById(String roomId);

    //채팅방 생성하기
    void createChatRoomDTO(String name, int password, String chatMentor);

    void deleteById(Long chatRoomId);

    //채팅 이력 보여주기
    List<ChatMessageDetailDTO> findAllChatByRoomId(String roomId);
}
