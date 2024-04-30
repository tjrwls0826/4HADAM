package com.hadam.HADAM.controller;

import lombok.RequiredArgsConstructor;
import com.hadam.HADAM.dto.AddUserRequest;
import com.hadam.HADAM.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;



@RequiredArgsConstructor
@Controller
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request){
        userService.save(request); // 회원 가입 메소드 호출
        return "redirect:/login"; // 회원 가입이 완료된 후 로그인 페이지로 이동
    }
//    @GetMapping("/logout")
//    public String logout(HttpServletRequest request, HttpServletResponse response){
//        new SecurityContextLogoutHandler().logout(request, response,
//                SecurityContextHolder.getContext().getAuthentication());
//        return "redirect:/login";
//    }
}