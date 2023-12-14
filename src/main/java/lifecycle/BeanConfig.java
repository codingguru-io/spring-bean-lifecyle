package lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	BeanProcessorLifecycle myBeanPostProcessor() {
		return new BeanProcessorLifecycle();
	}

	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	HRService beanLifecycle() {
		return new HRService();
	}
}
