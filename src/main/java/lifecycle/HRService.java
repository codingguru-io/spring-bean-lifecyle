package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HRService implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	public void processPayroll() {
		System.out.println("Payroll has been processed.");
	}

	public void initMethod() {
	    System.out.println("initMethod executed...");
	}
	
	public void setBeanName(String name) {
		System.out.println("setBeanName executed...");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext executed...");
	}

	public void destroy() throws Exception {
		System.out.println("destroy executed...");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet executed...");
	}
	
	@PostConstruct
	public void postConstruct() {
	    System.out.println("@PostConstruct executed...");
	}
	
	@PreDestroy
    public void preDestroy() {
		System.out.println("@PreDestroy executed...");
    }
	
	public void destroyMethod() {
	    System.out.println("destroyMethod executed...");
	}
}
