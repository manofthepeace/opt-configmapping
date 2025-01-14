package org.acme;

import org.jboss.logging.Logger;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.inject.Instance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@Startup
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    GreetingResource(Instance<MySpecialFeature> feature) {
        if (feature.isResolvable()) {
            LOG.info("FEATURE ON");
            feature.get().print();
        } else {
            LOG.info("FEATURE OFF");
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}
