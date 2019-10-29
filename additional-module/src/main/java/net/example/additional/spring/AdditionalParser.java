package net.example.additional.spring;

import net.example.additional.AdditionalServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

public class AdditionalParser extends AbstractBeanDefinitionParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdditionalParser.class);

    protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {
        LOGGER.debug("Parsing bean definition");
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(AdditionalServiceImpl.class);
        for (Element childElement : DomUtils.getChildElements(element)) {
            builder.addConstructorArgReference(childElement.getAttribute("ref"));
        }
        return builder.getBeanDefinition();
    }
}
