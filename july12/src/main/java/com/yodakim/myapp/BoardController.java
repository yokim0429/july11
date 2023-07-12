package com.yodakim.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller: 흐름제어
 * 컨트롤 기능을 하는 인스턴스, 
 * 사용자의 요청이 들어오면 해당 URL에 맞는 페이지와 데이터를 보냅니다.
 * 
 * Service: 프로그램 로직
 * 
 * DTO/VO: 
 * DAO: 데이터베이와 연결되어 작업합니다(mybatis).
 * 
 * JSP = 보여지는 화면(View)
 * 
 * 사용자 -> 컨트롤러 -> 서비스 -> DAO -> my batis -> DB
 * 사용자 <- JSP + DB <- 컨트롤러 <- 서비스 <- DAO <- my batis <- DB
 * 
 * 연결 = DI 의존 주입
 * 1. @Autowired: Spring에서 제공됨, 타입이 일치하는 값과 연결
 * 2. @Inject: Java에서 제공됨, 타입이 일치하는 값을 연결
 * 3. @Resource: java에서 제공됨, 이름이 일치하는 값을 연결
 * 
 * 스프링 기술
 * 
 * POJO(Plain Old Java Object 약어)
 * 어렵게 코딩하는게 아닌 간단하게 코딩하자는 말
 * (오래된 방식의 간단한 자바 오브젝트).
 * 
 * 1. DI(Dependency Injection) 의존주입
 * 	프레임워크가 객체의 의존성 주입을 담당한다(IoC).
 * 
 * 2. IoC(Inversion of Control) 제어가 바뀐다
 * 	프레임워크가 권한을 가져간다.
 * 	Java가 객체를 생성하고 연결하고 사용하는데
 * 	이런 기술을 IoC 컨테이너가 관리, 서비스한다.
 * 	IoC 컨테이너는 객체의 생성/초기화/서비스/소멸 (라이프사이클)
 * 	라이프 사이클을 관리한다.
 * 
 * 3. AOP(Aspect Oriented Programming) 관점지향 프로그래밍
 *	객체지향과 다른 개념. 각 객체마다 중복되는 작업이 있으면
 * 	해당 중복 작업을 기준으로 동일 행동을 하게 만든다.
 *	메서드가 실행되기 전에, 실행된 후에, 실행 시점에 따라서 기능을 적용한다.
 * 
 **/


@Controller
public class BoardController {
	
//	Service와 연결하기: @Autowired
	@Autowired
	private BoardService boardService;
	
//	사용자의 어떤 요청이 들어오면 받은 일을 하겠어요.
	@RequestMapping(value= "/main")
	public String main() {	//	위 문장과 연결되서 /main이란 요청이 오면
		return "main";	//	JSP 파일명 아래 해당 JSP파일을 열어준다.
	}	//	/WEB-INF/views/main.jsp
 /**
  * Controller: 흐름제어
 
  * Service: 프로그램 로직
  * 
  * 
  **/
	@GetMapping("/board")
	public ModelAndView board() {
//		model and view
		ModelAndView mv = new ModelAndView("board");
		mv.addObject("name", "홍길동");
		
		return mv;
	}
	
	
	
}
/**
 * controller(이제 흐름을 제어합니다)
 * 
 * 
 **/