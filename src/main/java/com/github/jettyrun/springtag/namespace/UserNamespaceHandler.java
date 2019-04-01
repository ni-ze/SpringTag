package com.github.jettyrun.springtag.namespace;


import com.github.jettyrun.springtag.parser.UserBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by jetty on 18/1/30.
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport{
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
