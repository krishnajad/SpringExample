package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

         Dextop dt=context.getBean(Dextop.class);
         dt.compile();

         Alian al=context.getBean(Alian.class);
         al.code();






//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//        Laptop obj1=(Laptop) context.getBean("laptop");
//        System.out.println(obj1.getNoOflaptop());
//        obj1.lap();


//       Laptop obj1=(Laptop) context.getBean("laptop");
//       obj1.noOfLaptop=5;
//       Laptop obj2=(Laptop) context.getBean("laptop");
//       obj2.noOfLaptop=10;
//       obj2.lap();
//       System.out.println(obj1.noOfLaptop);
//       System.out.println(obj2.noOfLaptop);
    }
}
