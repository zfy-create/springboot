package com.fei;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {

	@Autowired //将狗狗自动注入进来
	Person person;

	@Test
	void contextLoads() {
		System.out.println(person); //打印看下狗狗对象
	}

}
