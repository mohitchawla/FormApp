package models;

import java.util.List;

import javax.persistence.Id;

import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model.Finder;

public class Order {
	
	@Id
	public Integer id;
	
	@Required
	public String title;
	
	@Required @Min(10)
	public int price;
	
	@Required @Min(1)
	public int Quantity;
	
	public static Finder<Integer, Order> find = new Finder<Integer, Order>(Integer.class, Order.class);
	
	public static List<Order> all()
	{
		return find.all();
	}
}
