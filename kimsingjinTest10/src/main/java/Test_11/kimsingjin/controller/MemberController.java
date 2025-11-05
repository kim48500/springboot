package Test_11.kimsingjin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Test_11.kimsingjin.dto.MemberDTO;
import Test_11.kimsingjin.service.MemberService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

 //생성자 주입
@Slf4j
@RequestMapping("/members")
@Controller
public class MemberController {

   
	
	//서비스 인스턴스 생성
	

    

	//회원 가입 페이지
	@GetMapping("/signup")
	public String joinForm(Model model) {
		model.addAttribute("memberDTO", new MemberDTO());
		return "members/signup";
	}
	



	//
	@PostMapping("/signup")
	public String signup(@Valid @ModelAttribute("memberDTO") MemberDTO dto,
	                     BindingResult bindingResult) {
	    if (bindingResult.hasErrors()) {
	        return "members/signup";
	    }
	    // 저장 처리
	    return "redirect:/";
	}
		
	
	
	
}
