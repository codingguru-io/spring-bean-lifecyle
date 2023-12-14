package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessorLifecycle implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof HRService) {
			System.out.println("postProcessBeforeInitialization executed...");
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	    if (bean instanceof HRService) {
	      System.out.println("postProcessAfterInitialization executed...");
	    }
	    return bean;
	}
}
