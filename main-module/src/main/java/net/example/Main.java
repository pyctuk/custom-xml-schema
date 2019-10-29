package net.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        MainService mainService = context.getBean(MainService.class);
        mainService.execute();

        context.getBeansOfType(Object.class)
                .forEach((id, bean) -> LOGGER.debug("id={}, beanClass={}", id, bean.getClass()));
    }
}
