package net.example.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThirdServiceImpl implements ThirdService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThirdServiceImpl.class);

    public void execute() {
        LOGGER.debug("Third party service called");
    }
}
