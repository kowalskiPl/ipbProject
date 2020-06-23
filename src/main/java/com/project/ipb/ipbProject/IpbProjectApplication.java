package com.project.ipb.ipbProject;

import com.project.ipb.ipbProject.hibernateTools.HibernateDBUtil;
import com.project.ipb.ipbProject.hibernateTools.HibernateUtil;
import com.project.ipb.ipbProject.model.Application;
import com.project.ipb.ipbProject.model.Car;
import com.project.ipb.ipbProject.model.Client;
import com.project.ipb.ipbProject.model.Estimate;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class IpbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpbProjectApplication.class, args);
		Client defaultClient = new Client("Kurt", "Tank");
		HibernateDBUtil.saveClient(defaultClient);
		Application a = new Application();
		a.setDate(new Date());
		HibernateDBUtil.createApplication(1, a, new Car("ABC34E", "Ford",
				Car.FuelType.Diesel, 14.2, 123.2, 1232.1, true));
		System.out.println(HibernateDBUtil.getApplications().get(0).getClient().toString());

	}

}
