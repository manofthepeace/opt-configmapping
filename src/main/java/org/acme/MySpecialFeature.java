package org.acme;

import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@LookupIfProperty(name = "feature.enabled", stringValue = "true")
public class MySpecialFeature {

    private final MyOptionalConfig conf;

    MySpecialFeature(MyOptionalConfig conf) {
        this.conf = conf;

    }

    public String print() {
        return String.valueOf(conf.enabled());
    }

}
