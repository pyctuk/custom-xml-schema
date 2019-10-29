package net.example.additional.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class AdditionalHandler extends NamespaceHandlerSupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdditionalHandler.class);

    public void init() {
        LOGGER.debug("NameSpaceHandler is executed");
        registerBeanDefinitionParser("additionalService", new AdditionalParser());
    }
}
