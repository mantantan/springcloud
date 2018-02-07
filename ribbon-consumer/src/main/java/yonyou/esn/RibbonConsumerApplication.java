package yonyou.esn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 以下三个注解也可以使用@SpringCloudApplication进行包含，建议显示注解，更清晰
 */

@EnableCircuitBreaker // 熔断器启动
@EnableDiscoveryClient // 服务治理注册
@SpringBootApplication
public class RibbonConsumerApplication {

	@Bean
	//开启客户端的负载均衡能力
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}
}
