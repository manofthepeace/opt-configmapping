package org.acme;

import java.util.Optional;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithParentName;

@StaticInitSafe
@ConfigMapping(prefix = "feature")
public interface MyOptionalConfig {

    boolean enabled();

    @WithParentName
    Optional<Props> props();

    interface Props {
        String config1();

        String config2();

        String config3();
    }

}
