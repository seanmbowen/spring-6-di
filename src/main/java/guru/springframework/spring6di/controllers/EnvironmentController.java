package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Created by: seanbowen on 2024-03-10
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-03-10
 */
@Controller
@RequiredArgsConstructor
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public String getEnvironment(){ {
        return "You are in " + environmentService.getEnv() + " environment";
    }}
}
