package controllers;

import play.*;
import play.mvc.*;
import Model.*;
import views.html.*;
import play.data.*;
import java.util.*;

public class Application extends Controller {
  
  public static Result index() {
	Form<User> userForm =form(User.class);
	
	Map<String, String> anyData = new HashMap<String, String>();
	anyData.put("email", "kalia@gmail.com");
	anyData.put("password", "secret");
    
	User user =userForm.bind(anyData).get();
	return ok(index.render("Mohit Chawla"));
  }
  
}