package io.jediverse.api;

import io.jediverse.coruscant.api.WellKnownApi;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class WellKnownApiControllerTest {

    @Inject
    private WellKnownApi api;


    @Test
    void webfingerGetTest() {
        try {
            api.webfingerGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
