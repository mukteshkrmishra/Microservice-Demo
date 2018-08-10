package simple.rest.resource;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import javax.inject.Named;

@Named
public class CustomHealth implements HealthIndicator {
    public Health health() {
        int errorCode = 0;
        if (errorCode != 1) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

}