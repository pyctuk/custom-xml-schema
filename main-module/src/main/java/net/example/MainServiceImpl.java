package net.example;

import net.example.additional.AdditionalService;
import net.example.api.ThirdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainServiceImpl implements MainService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainServiceImpl.class);

    private AdditionalService additionalService;
    private ThirdService thirdService;

    public MainServiceImpl(AdditionalService additionalService, ThirdService thirdService) {
        this.additionalService = additionalService;
        this.thirdService = thirdService;
    }

    @Override
    public void execute() {
        LOGGER.debug("Main service called");
        additionalService.execute();

        LOGGER.debug("Calling third service from main");
        thirdService.execute();
    }
}
