package Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeController  implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name=request.getParameter("userName");
		Map m=new HashMap();
		m.put("msg", name);
		ModelAndView mav=new ModelAndView("Success",m);
		System.out.println(mav.getViewName());
		return mav;
	}

}
