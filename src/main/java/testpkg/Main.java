package testpkg;

import org.hibernate.Session;

import config.HBConfiguration;
import models.Employee;
import models.PhoneNumber;

public class Main {
	public static void main(String[] args) {
		PhoneNumber number = new PhoneNumber();
		number.setPhoneNumber("555666");
		PhoneNumber number2 = new PhoneNumber();
		number2.setPhoneNumber("111222");
		Employee employee = new Employee();
		employee.setName("c.bulut");
		employee.setPassword("123456");
		employee.getPhoneNumber().add(number);
		employee.getPhoneNumber().add(number2);
		number.setEmployee(employee);
		number2.setEmployee(employee);
		Session session = HBConfiguration.getSession();
		session.beginTransaction();
		session.save(employee);
		session.save(number);
		session.save(number2);
		session.getTransaction().commit();
		session.flush();
		session.close();
	}
}
