package com.itheima.web.client;

import com.itheima.model.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/register")
    public String showRegisterForm() {
        return "comm/register";
    }

    @PostMapping(value = "/register")
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("email") String email,
                               @RequestParam("avatar") MultipartFile avatar, Map<String, Object> map) {

        // 创建一个新的用户对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setCreatedAt(LocalDateTime.now()); // 设置 createdAt 字段
        user.setValid(1); // 设置 valid 字段，虽然默认值应该是 1，但最好还是显式设置

        // 调用 UserService 中的保存用户方法
        userService.saveUser(user);

        // 处理照片上传
        if (!avatar.isEmpty()) {
            try {
                byte[] avatarBytes = avatar.getBytes();
                // 在这里保存照片到服务器或者存储照片的路径到数据库
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 调用 UserService 中的保存用户方法
        userService.saveUser(user);

        //注册成功后重定向到登录界面，添加一个URL参数表示注册成功
        return "redirect:/login?registerSuccess=true";
    }
}
