package guru.springframework.spring6di.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by: seanbowen on 2024-03-10
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-03-10
 */
@SpringBootTest
@Slf4j
@ActiveProfiles({"prod","EN"})
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController controller;
    @Test
    void getEnvironment() {
        log.info(controller.getEnvironment());
    }
}
