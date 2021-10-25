package com.example.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.basic.BinarySearchImpl;
import com.example.springdemo.xml.XmlPersonDao;

@SpringBootApplication
public class SpringdemoXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringdemoScopeApplication.class);

	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(SpringdemoXmlContextApplication.class, args);
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
//			System.out.println(xmlPersonDao);
//			System.out.println(xmlPersonDao.getXmlJdbcConnection());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
