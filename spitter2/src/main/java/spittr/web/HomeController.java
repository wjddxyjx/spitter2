package spittr.web;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//����Ϊһ��������
@Controller
public class HomeController {

	//�����"/"��GET����
	@RequestMapping(value="/",method=GET)
	public String home(){
		return "home";
	}
}
