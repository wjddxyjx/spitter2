package spittr.web;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//声明为一个控制器
@Controller
public class HomeController {

	//处理对"/"的GET请求
	@RequestMapping(value="/",method=GET)
	public String home(){
		return "home";
	}
}
