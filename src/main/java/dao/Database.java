package dao;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import model.Business;

public class Database {	
	private static List<Business> businesses = new ArrayList<>();
	private static int businessId = 1;
	
	static {
		Business b = new Business();
		b.setId(businessId++);
		b.setName("Amazon");
		businesses.add(b);
		
		Business c = new Business();
		c.setId(businessId++);
		c.setName("Apple");
		businesses.add(c);
	}
	
	public static List<Business> getBusinesses() {
		return Collections.unmodifiableList(businesses);
	}
	
	public static void addBusiness(Business business) {
		business.setId(businessId++);
		businesses.add(business);
	}
}
