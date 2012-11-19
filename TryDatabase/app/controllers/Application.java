package controllers;

import models.Order;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render(Order.all()));
  }
  
}