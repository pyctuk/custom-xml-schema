package net.example.additional;

import net.example.api.ThirdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalServiceImpl implements AdditionalService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdditionalServiceImpl.class);

    private ThirdService thirdService;

    public AdditionalServiceImpl(ThirdService thirdService) {
        this.thirdService = thirdService;
    }

    public void execute() {
        LOGGER.debug("AdditionalService service called");
        thirdService.execute();
    }
}
