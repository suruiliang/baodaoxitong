package security;

import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

import com.bec.cloud.auth.server.authorize.AuthorizeConfigProvider;

@Component
@Order(Integer.MAX_VALUE)
public class MyAuthorizeConfigProvider implements AuthorizeConfigProvider {

	@Override
	public void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
		config.antMatchers("/**").permitAll();
		config.anyRequest().authenticated();
	}

}
