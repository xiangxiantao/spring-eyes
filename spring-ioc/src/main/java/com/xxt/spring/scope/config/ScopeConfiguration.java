package com.xxt.spring.scope.config;

import com.xxt.spring.scope.beans.ProBean;
import com.xxt.spring.scope.beans.SinBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope(value = "singleton")
    public SinBean sinBean(){
        SinBean sinBean = new SinBean();
        sinBean.setProBean(proBean());
        return sinBean;
    }

    /**
     * 注意ScopedProxyMode.TARGET_CLASS，表示支持代理，使单例bean中的原型依赖生效
     * @return
     */
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE , proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ProBean proBean(){
        return new ProBean();
    }

}
