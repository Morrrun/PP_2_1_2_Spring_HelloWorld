import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanSecond = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean == beanSecond);

        Cat catFirst = applicationContext.getBean("cat", Cat.class);
        Cat catSecond = applicationContext.getBean("cat", Cat.class);

        catFirst.say();

        System.out.println(catFirst == catSecond);

        catSecond.say();
    }
}