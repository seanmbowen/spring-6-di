package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by: seanbowen on 2024-03-10
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-03-10
 */
@Service
@Profile({"dev","default"})
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "dev";
    }
}
