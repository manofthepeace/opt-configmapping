package org.acme;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;

@StaticInitSafe
@ConfigMapping(prefix = "feature")
public interface MyOptionalConfig {

    boolean enabled();

    String config1();

    String config2();

    String config3();

}
