package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //not necessary - this is default
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("creating a singleton bean");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
