package io.jediverse.api;

import io.jediverse.coruscant.api.NodeinfoApi;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class NodeinfoApiControllerTest {

    @Inject
    private NodeinfoApi api;

    @Test
    void nodeInfoGetTest() {
        try {
            api.nodeInfoGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
