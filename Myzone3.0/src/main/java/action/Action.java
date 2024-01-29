package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {	
	abstract public String execute(HttpServletRequest request, HttpServletResponse response);
	
}
