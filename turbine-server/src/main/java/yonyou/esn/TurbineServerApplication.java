package yonyou.esn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableDiscoveryClient // 服务治理注册
@SpringBootApplication
public class TurbineServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineServerApplication.class, args);
	}
}
