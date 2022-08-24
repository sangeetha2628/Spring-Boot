package biodata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		Student stu=con.getBean("stu",Student.class);
		System.out.println(stu.getAge());
		System.out.println(stu.getDept());
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		
		//setter injection 
		
		//constructor injection
	}

}
