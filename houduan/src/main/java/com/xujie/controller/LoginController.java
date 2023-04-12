package com.xujie.controller;

import com.xujie.service.LoginService;
import com.xujie.utils.LoginDTO;
import com.xujie.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController()
//public class LoginController {
//    @Autowired
//    private LoginService loginService;
//    @PostMapping(value = "/api/login")
//    @CrossOrigin       //后端跨域
//    public Result login(@RequestBody LoginDTO loginDTO){
//        return loginService.login(loginDTO);
//    }
//
//}
@RestController()
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping(value = "/api/login")
    public Result login(@RequestBody LoginDTO loginDTO){
        return loginService.login(loginDTO);
    }

    @PostMapping(value = "/api/hello")
    public Result hello(){
        return new Result(200,"hello","world");
    }
}