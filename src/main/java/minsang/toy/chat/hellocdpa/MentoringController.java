package minsang.toy.chat.hellocdpa;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/mentoring")
@RequiredArgsConstructor
@Log4j2
public class MentoringController {
    private static final String LOGIN_ID = "loginId";
    private static final String LOGIN_NICKNAME = "nickName";
    private final ChatService cs;

    //게시글 저장
//    @PostMapping("/save")
//    public String save(@Validated @ModelAttribute MentoringSaveDTO mentoringSaveDTO){
//
//        mts.save(mentoringSaveDTO);
//
//        return "redirect:/mentoring/";
//    }
    // 상세조회
//    @GetMapping("{mentoringId}")
//    public String findById(@PathVariable("mentoringId") Long mentoringId, Model model, HttpSession session){
//        MentoringDetailDTO mentoringDetailDTO = mts.findById(mentoringId);
//
//        model.addAttribute("mentoring",mentoringDetailDTO);
//
//        int totalPrice = (mentoringDetailDTO.getMentoringPrice())*(mentoringDetailDTO.getMentoringCount());
//
//        model.addAttribute("totalPrice",totalPrice);
//
//        Long memberId = (Long) session.getAttribute(LOGIN_ID);
//
//        MemberDetailDTO member = ms.findById(memberId);
//        int memberPoint = member.getMemberPoint();
//        model.addAttribute("memberPoint", memberPoint);
//
//        return "/mentoring/findById";
//    }



//    //글 삭제
//    @DeleteMapping("{mentoringId}")
//    public ResponseEntity deleteById (@PathVariable ("mentoringId") Long mentoringId){
//        mts.deleteById(mentoringId);
//        return new ResponseEntity(HttpStatus.OK);
//    }

    //전체조회
//    @GetMapping("/")
//    public String findAll(Model model) {
//        List<MentoringDetailDTO> mentoringList = mts.findAll();
//        model.addAttribute("mentoringList", mentoringList);
//        return "/mentoring/findAll";
//    }
//
//    // 수정 화면 이동
//    @GetMapping("/update/{mentoringId}")
//    public String updateForm(Model model, @PathVariable ("mentoringId") Long mentoringId){
//        MentoringDetailDTO mentoring = mts.findById(mentoringId);
//        model.addAttribute("mentoring",mentoring);
//        return "/mentoring/update";
//    }
//    // 수정 하기
//    @PutMapping("/{mentoringId}")
//    public ResponseEntity update(@ModelAttribute MentoringUpdateDTO mentoringUpdateDTO) {
//        mts.update(mentoringUpdateDTO);
//
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    //멘토링 구매
//    @PostMapping("/payment")
//    public ResponseEntity payment(@ModelAttribute MenteeSaveDTO menteeSaveDTO){
//        mts.saveMentee(menteeSaveDTO);
//        return new ResponseEntity(HttpStatus.OK);
//
//    }
    //나의 멘토링 조회
    @GetMapping("/myMentoring/{memberId}")
    public String myMentoring(@PathVariable ("memberId") Long memberId, Model model){
        //멘티정보로 멘토 신청정보 찾기
//        List<MenteeDetailDTO> menteeList = mts.findAllByMemberId(memberId);
//        model.addAttribute("menteeList",menteeList);
//
//        //멘토정보로 멘티 찾기
//        List<MenteeDetailDTO> mentorList = mts.fundAllMentorMemberId(memberId);
//        model.addAttribute("mentorList",mentorList);

        //채팅방 목록 불러오기
        model.addAttribute("rooms", cs.findAllRooms());

        return "myMentoring";
    }
    @GetMapping("/mentorChat")
    public String mentorChatForm(Model model, HttpSession session) {
        Long memberId = (Long) session.getAttribute(LOGIN_ID);
        Long memberNickName = (Long) session.getAttribute(LOGIN_NICKNAME);
        model.addAttribute("memberId",memberId);
        model.addAttribute("memberNickName",memberNickName);
        return "/mentorChat";
    }

    //채팅방 개설
    @PostMapping(value = "/room")
    public String create(@RequestParam String name, @RequestParam  int password, HttpSession session, Model model){
        //Long memberId = (Long) session.getAttribute(LOGIN_ID);
        Long memberId = 1l;
        String memberNick = (String) session.getAttribute(LOGIN_NICKNAME);
        log.info("# Create Chat Room , name: " + name);

        cs.createChatRoomDTO(name,password,memberNick);

        return "redirect:/mentoring/myMentoring/"+memberId;
    }

    //채팅방 조회
    @GetMapping("/room")
    public void getRoom(@RequestParam String roomId, Model model,HttpSession session){
        Long memberId = (Long) session.getAttribute(LOGIN_ID);
        String memberProfileName = "memberProfileName";
        model.addAttribute("memberProfileName",memberProfileName);

        log.info("# get Chat Room, roomID : " + roomId);

        model.addAttribute("room", cs.findRoomById(roomId));
    }
//    //멘토링 삭제
//    @DeleteMapping("/chat/{chatRoomId}")
//    public ResponseEntity deleteChatById (@PathVariable ("chatRoomId") Long chatRoomId){
//        cs.deleteById(chatRoomId);
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    //멘토링 완료
//    @Transactional
//    @PutMapping("/mentoringApply/{menteeId}")
//    public @ResponseBody String mentoringApply(@PathVariable ("menteeId") Long menteeId){
//        MenteeDetailDTO mentee = mts.findByMenteeId(menteeId);
//        if(mentee.getMenteeMax() > mentee.getMenteeCount()){
//            mts.updateCount(menteeId);
//
//            return "ok";
//        }else {
//            return "no";
//        }
//
//    }



}