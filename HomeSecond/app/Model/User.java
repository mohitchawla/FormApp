package Model;

import play.data.validation.Constraints.Required;

public class User {
	
	@Required
	public String email;
	
	@Required
	public String password;
	
	public String validate(){
		
		return null;
	}
}
