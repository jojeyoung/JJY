package com.cos.blogapp.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserControllerTest {
	public static String href(String path) {

	StringBuilder sb = new StringBuilder();
	sb.append("<script>");
	sb.append("location.href='"+path+"';");
	sb.append("</script>");
	return sb.toString();
}
	
	public static String href(String path, String msg) {
	StringBuilder sb = new StringBuilder();
	sb.append("<script>");
	sb.append("alert('"+msg+"');");
	sb.append("location.href='"+path+"';");
	sb.append("</script>");
	return sb.toString();
}
	
	
	@GetMapping("/test/join") //ResponseBody를 붙인 함수만 데이터를 리턴한다
	public @ResponseBody String testjoin() {
		return "test/join";
	}
	
	@GetMapping("/test/login") //
	public @ResponseBody String testLogin() {
		return "<script>alert('hello');</script>";
		//브라우저는 html,css 해석기능으로 데이터를 해석해준다
	}
	
	//주소?name=홍길동
	// /test/data/1
	@GetMapping("/test/data/{num}") //
	public @ResponseBody String testDate(@PathVariable int num) {
			if(num == 1) { //정상
				StringBuilder sb = new StringBuilder();
				sb.append("<script>");
				sb.append("location.href='/';");
				sb.append("</script>");
				
				return sb.toString(); //파일리턴
			} else { //오류
				return "오류가 났습니다";
			}
	}
}
