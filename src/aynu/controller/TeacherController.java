package aynu.controller;

import aynu.bean.Teacher;
import aynu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author susuper
 * @Date 2019/12/28 16:11
 * @description:
 */
@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/loginServlet")
    public String loginToPage(@RequestParam("userid") String user, @RequestParam("password") String pwd, HttpSession session, HttpServletResponse response, HttpServletRequest request){
        System.out.println(user+"\\"+pwd);
        Teacher teacher = teacherService.selectLogin(user);
        System.out.println(teacher);
        if( teacher!=null && teacher.getTpassword()!=null&& teacher.getTpassword().equals(pwd)) {
            session.setAttribute("USER_SESSION", teacher);

            return "redirect:applyController/showApplyAll";
        }else{
            request.setAttribute("errorInfo","账号或密码错误，请重新输入");
            return "login";
        }
    }
}
