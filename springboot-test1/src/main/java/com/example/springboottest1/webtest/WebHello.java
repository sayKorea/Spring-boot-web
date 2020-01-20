package com.example.springboottest1.webtest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class WebHello {

	@GetMapping("/view")
	public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        
        List<String> listTest = new ArrayList<String>();
        
        listTest.add("test1");
        listTest.add("test2");
        listTest.add("test3");
        
        mv.addObject("listTest",listTest);      // jstl로 호출
        mv.addObject("ObjectTest","테스트입니다."); // jstl로 호출
        mv.setViewName("hello");         // 실제 호출될 /WEB-INF/jsp/model/testMv.jsp
        return mv;                                      
    }
	
	@GetMapping("/test")
	public String test() {
		return "hello";                                      
    }
	
}
