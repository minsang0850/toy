//package minsang.toy.chat.hellocdpa;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class MentoringController {
//    private final MentoringService mts;
//    private final MemberService ms;
//    private final ChatService cs;
//
//    //나의 멘토링 조회
//    @GetMapping("/myMentoring/{memberId}")
//    public String myMentoring(@PathVariable("memberId") Long memberId, Model model){
//        //멘티정보로 멘토 신청정보 찾기
//        List<MenteeDetailDTO> menteeList = mts.findAllByMemberId(memberId);
//        model.addAttribute("menteeList",menteeList);
//
//        //멘토정보로 멘티 찾기
//        List<MenteeDetailDTO> mentorList = mts.fundAllMentorMemberId(memberId);
//        model.addAttribute("mentorList",mentorList);
//
//        //채팅방 목록 불러오기
//        model.addAttribute("rooms", cs.findAllRooms());
//
//
//        return "/mentoring/myMentoring";
//    }
//    //채팅방 개설
//    @PostMapping(value = "/room")
//    public String create(@RequestParam String name,HttpSession session,Model model){
//        Long memberId = (Long) session.getAttribute(LOGIN_ID);
//        String memberNick = (String) session.getAttribute(LOGIN_NICKNAME);
//        log.info("# Create Chat Room , name: " + name);
//
//        cs.createChatRoomDTO(name,memberNick);
//
//        return "redirect:/mentoring/myMentoring/"+memberId;
//    }
//
//    //채팅방 조회
//    @GetMapping("/room")
//    public void getRoom(String roomId, Model model,HttpSession session){
//        //        Long memberId = (Long) session.getAttribute(LOGIN_ID);
//        //        String memberProfileName = ms.findById(memberId).getMemberProfileName();
//        //        model.addAttribute("memberProfileName",memberProfileName);
//        log.info("# get Chat Room, roomID : " + roomId);
//
//        model.addAttribute("room", cs.findRoomById(roomId));
//    }
//
//}
