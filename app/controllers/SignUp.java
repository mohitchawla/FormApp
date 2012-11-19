package controllers;

import play.*;
import play.mvc.*;
import models.*;
import play.data.*;
import views.html.*;

public class SignUp extends Controller {
  
	 static Form<User> userForm = form(User.class);
	
	  public static Result index() {
	    return ok(form.render(userForm));
	  }
	  
	  public static Result submit()
	  {
		  userForm = form(User.class).bindFromRequest();
		  
		  if(userForm.hasErrors())
		  {
			  return badRequest(form.render(userForm));
		  }
		  else
		  {
			  User user =userForm.get();
			  
			  return ok(summary.render(user));
		  }
	  }
}