package io.jediverse.api;

import io.jediverse.coruscant.api.UsersApi;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class UsersApiControllerTest {

    @Inject
    private UsersApi api;

    @Test
    void s2sOutboxGetTest() {
        String username = "username_example";
        Boolean page = false;
        String minId = "minId_example";
        String maxId = "maxId_example";
        try {
            api.s2sOutboxGet(username, page, minId, maxId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void s2sRepliesGetTest() {
        String username = "username_example";
        String status = "status_example";
        Boolean page = false;
        Boolean onlyOtherAccounts = false;
        String minId = "minId_example";
        try {
            api.s2sRepliesGet(username, status, page, onlyOtherAccounts, minId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
