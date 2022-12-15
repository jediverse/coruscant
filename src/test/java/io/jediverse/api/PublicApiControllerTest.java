package io.jediverse.api;

import io.jediverse.coruscant.api.PublicApi;
import io.jediverse.coruscant.model.UserPasswordChangeBody;
import io.jediverse.coruscant.model.V1AppsBody;
import io.jediverse.coruscant.model.V1StatusesBody;

import java.io.File;
import io.jediverse.coruscant.model.IdFollowBody;
import io.jediverse.coruscant.model.MediaIdBody;

import io.micronaut.http.MediaType;
import io.micronaut.http.multipart.PartData;
import io.micronaut.http.multipart.StreamingFileUpload;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;


import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class PublicApiControllerTest {

    @Inject
    private PublicApi api;

    @Test
    void accountBlockTest() {
        String id = "id_example";
        try {
            api.accountBlock(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountCreateTest() {
        String reason = "reason_example";
        String username = "username_example";
        String email = "email_example";
        String password = "password_example";
        Boolean agreement = true;
        String locale = "locale_example";
        try {
            api.accountCreate(reason, username, email, password, agreement, locale).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountDeleteWithFormTest() {
        String password = "password_example";
        try {
            api.accountDelete(password).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountFollowTest() {
        String id = "id_example";
        IdFollowBody body = new IdFollowBody();
        try {
            api.accountFollow(id, body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountFollowWithFormTest() {
        String id = "id_example";
        Boolean reblogs = true;
        Boolean notify = true;
        try {
            api.accountFollow(id, reblogs, notify).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountFollowersTest() {
        String id = "id_example";
        try {
            api.accountFollowers(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountFollowingTest() {
        String id = "id_example";
        try {
            api.accountFollowing(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountGetTest() {
        String id = "id_example";
        try {
            api.accountGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountRelationshipsTest() {
        List<String> id = Arrays.asList("id_example");
        try {
            api.accountRelationships(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountStatusesTest() {
        String id = "id_example";
        Integer limit = 30;
        Boolean excludeReplies = false;
        Boolean excludeReblogs = false;
        String maxId = "maxId_example";
        String minId = "minId_example";
        Boolean pinnedOnly = false;
        Boolean onlyMedia = false;
        Boolean onlyPublic = false;
        try {
            api.accountStatuses(id, limit, excludeReplies, excludeReblogs, maxId, minId, pinnedOnly, onlyMedia, onlyPublic).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountUnblockTest() {
        String id = "id_example";
        try {
            api.accountUnblock(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void accountUnfollowTest() {
        String id = "id_example";
        try {
            api.accountUnfollow(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    /*@Test
    void accountUpdateWithFormTest() {
        Boolean discoverable = true;
        Boolean bot = true;
        String displayName = "displayName_example";
        String note = "note_example";
        StreamingFileUpload avatar = new StreamingFileUpload("avatar_example") {
            @Override
            public Publisher<Boolean> transferTo(String location) {
                return null;
            }

            @Override
            public Publisher<Boolean> transferTo(File destination) {
                return null;
            }

            @Override
            public Publisher<Boolean> delete() {
                return null;
            }

            @Override
            public Optional<MediaType> getContentType() {
                return Optional.empty();
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getFilename() {
                return null;
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public long getDefinedSize() {
                return 0;
            }

            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void subscribe(Subscriber<? super PartData> s) {

            }
        };
        File header = new File("header_example");
        Boolean locked = true;
        String sourcePrivacy = "sourcePrivacy_example";
        Boolean sourceSensitive = true;
        String sourceLanguage = "sourceLanguage_example";
        String sourceStatusFormat = "sourceStatusFormat_example";
        String customCss = "customCss_example";
        Boolean enableRss = true;
        try {
            api.accountUpdate(discoverable, bot, displayName, note, avatar, header, locked, sourcePrivacy, sourceSensitive, sourceLanguage, sourceStatusFormat, customCss, enableRss).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }
*/
    @Test
    void accountVerifyTest() {
        try {
            api.accountVerify().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminAccountActionWithFormTest() {
        String type = "type_example";
        String text = "text_example";
        String id = "id_example";
        try {
            api.adminAccountAction(type, text, id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void appCreateTest() {
        V1AppsBody body = new V1AppsBody();
        try {
            api.appCreate(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void appCreateWithFormTest() {
        String clientName = "clientName_example";
        String redirectUris = "redirectUris_example";
        String scopes = "scopes_example";
        String website = "website_example";
        try {
            api.appCreate(clientName, redirectUris, scopes, website).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void authorizeFollowRequestTest() {
        String accountId = "accountId_example";
        try {
            api.authorizeFollowRequest(accountId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void blocksGetTest() {
        Integer limit = 20;
        String maxId = "maxId_example";
        String sinceId = "sinceId_example";
        try {
            api.blocksGet(limit, maxId, sinceId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void bookmarksGetTest() {
        try {
            api.bookmarksGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void clearNotificationsTest() {
        try {
            api.clearNotifications().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void customEmojisGetTest() {
        try {
            api.customEmojisGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

/*    @Test
    void domainBlockCreateWithFormTest() {
        File domains = new File("domains_example");
        String domain = "domain_example";
        Boolean obfuscate = true;
        String publicComment = "publicComment_example";
        String privateComment = "privateComment_example";
        Boolean _import = false;
        try {
            api.domainBlockCreate(domains, domain, obfuscate, publicComment, privateComment, _import).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }*/

    @Test
    void domainBlockDeleteTest() {
        String id = "id_example";
        try {
            api.domainBlockDelete(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void domainBlockGetTest() {
        String id = "id_example";
        try {
            api.domainBlockGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void domainBlocksGetTest() {
        Boolean export = true;
        try {
            api.domainBlocksGet(export).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

/*
    @Test
    void emojiCreateWithFormTest() {
        String shortcode = "shortcode_example";
        File image = new File("image_example");
        String category = "category_example";
        try {
            api.emojiCreate(shortcode, image, category).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }
*/

    @Test
    void emojiDeleteTest() {
        String id = "id_example";
        try {
            api.emojiDelete(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void emojiGetTest() {
        String id = "id_example";
        try {
            api.emojiGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

/*    @Test
    void emojiUpdateWithFormTest() {
        String type = "type_example";
        String shortcode = "shortcode_example";
        File image = new File("image_example");
        String category = "category_example";
        String id = "id_example";
        try {
            api.emojiUpdate(type, shortcode, image, category, id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }*/

    @Test
    void emojisGetTest() {
        String filter = "domain:all";
        Integer limit = 50;
        String maxShortcodeDomain = "maxShortcodeDomain_example";
        String minShortcodeDomain = "minShortcodeDomain_example";
        try {
            api.emojisGet(filter, limit, maxShortcodeDomain, minShortcodeDomain).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void favouritesGetTest() {
        Integer limit = 20;
        String maxId = "maxId_example";
        String minId = "minId_example";
        try {
            api.favouritesGet(limit, maxId, minId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void getFollowRequestsTest() {
        Integer limit = 40;
        try {
            api.getFollowRequests(limit).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void homeTimelineTest() {
        String maxId = "maxId_example";
        String sinceId = "sinceId_example";
        String minId = "minId_example";
        Integer limit = 20;
        Boolean local = false;
        try {
            api.homeTimeline(maxId, sinceId, minId, limit, local).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void instanceGetTest() {
        try {
            api.instanceGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void instancePeersGetTest() {
        String filter = "open";
        try {
            api.instancePeersGet(filter).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }
/*

    @Test
    void instanceUpdateWithFormTest() {
        String title = "title_example";
        String contactUsername = "contactUsername_example";
        String contactEmail = "contactEmail_example";
        String shortDescription = "shortDescription_example";
        String description = "description_example";
        String terms = "terms_example";
        File thumbnail = new File("thumbnail_example");
        String thumbnailDescription = "thumbnailDescription_example";
        File header = new File("header_example");
        try {
            api.instanceUpdate(title, contactUsername, contactEmail, shortDescription, description, terms, thumbnail, thumbnailDescription, header).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }
*/

    @Test
    void mediaCleanupTest() {
        Long remoteCacheDays = 789L;
        try {
            api.mediaCleanup(remoteCacheDays).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }
/*

    @Test
    void mediaCreateWithFormTest() {
        String description = "description_example";
        String focus = "focus_example";
        File file = new File("file_example");
        String apiVersion = "apiVersion_example";
        try {
            api.mediaCreate(description, focus, file, apiVersion).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }
*/

    @Test
    void mediaGetTest() {
        String id = "id_example";
        try {
            api.mediaGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void mediaRefetchTest() {
        String domain = "domain_example";
        try {
            api.mediaRefetch(domain).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void mediaUpdateTest() {
        String id = "id_example";
        MediaIdBody body = new MediaIdBody();
        try {
            api.mediaUpdate(id, body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void mediaUpdateWithFormTest() {
        String id = "id_example";
        String description = "description_example";
        String focus = "focus_example";
        try {
            api.mediaUpdate(id, description, focus).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void notificationsTest() {
        Integer limit = 20;
        List<String> excludeTypes = Arrays.asList("excludeTypes_example");
        String maxId = "maxId_example";
        String sinceId = "sinceId_example";
        try {
            api.notifications(limit, excludeTypes, maxId, sinceId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicTimelineTest() {
        String maxId = "maxId_example";
        String sinceId = "sinceId_example";
        String minId = "minId_example";
        Integer limit = 20;
        Boolean local = false;
        try {
            api.publicTimeline(maxId, sinceId, minId, limit, local).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void rejectFollowRequestTest() {
        String accountId = "accountId_example";
        try {
            api.rejectFollowRequest(accountId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void searchGetTest() {
        String type = "type_example";
        String q = "q_example";
        String accountId = "accountId_example";
        String maxId = "maxId_example";
        String minId = "minId_example";
        Boolean excludeUnreviewed = false;
        Boolean resolve = false;
        Long limit = 20L;
        Long offset = 0L;
        Boolean following = false;
        try {
            api.searchGet(type, q, accountId, maxId, minId, excludeUnreviewed, resolve, limit, offset, following).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusBookmarkTest() {
        String id = "id_example";
        try {
            api.statusBookmark(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusBoostedByTest() {
        String id = "id_example";
        try {
            api.statusBoostedBy(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusContextTest() {
        String id = "id_example";
        try {
            api.statusContext(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusCreateTest() {
        V1StatusesBody body = new V1StatusesBody();
        Boolean federated = true;
        Boolean boostable = true;
        Boolean replyable = true;
        Boolean likeable = true;
        try {
            api.statusCreate(body, federated, boostable, replyable, likeable).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusCreateWithFormTest() {
        String status = "status_example";
        List<String> mediaIds = Arrays.asList("mediaIds_example");
        String inReplyToId = "inReplyToId_example";
        Boolean sensitive = true;
        String spoilerText = "spoilerText_example";
        String visibility = "visibility_example";
        String scheduledAt = "scheduledAt_example";
        String language = "language_example";
        String format = "format_example";
        Boolean federated = true;
        Boolean boostable = true;
        Boolean replyable = true;
        Boolean likeable = true;
        try {
            api.statusCreate(status, mediaIds, inReplyToId, sensitive, spoilerText, visibility, scheduledAt, language, format, federated, boostable, replyable, likeable).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusDeleteTest() {
        String id = "id_example";
        try {
            api.statusDelete(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusFaveTest() {
        String id = "id_example";
        try {
            api.statusFave(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusFavedByTest() {
        String id = "id_example";
        try {
            api.statusFavedBy(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusGetTest() {
        String id = "id_example";
        try {
            api.statusGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusReblogTest() {
        String id = "id_example";
        try {
            api.statusReblog(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusUnbookmarkTest() {
        String id = "id_example";
        try {
            api.statusUnbookmark(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusUnfaveTest() {
        String id = "id_example";
        try {
            api.statusUnfave(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void statusUnreblogTest() {
        String id = "id_example";
        try {
            api.statusUnreblog(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void streamGetTest() {
        String accessToken = "accessToken_example";
        String stream = "stream_example";
        try {
            api.streamGet(accessToken, stream).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void userPasswordChangeTest() {
        UserPasswordChangeBody body = new UserPasswordChangeBody();
        try {
            api.userPasswordChange(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void userPasswordChangeWithFormTest() {
        String oldPassword = "oldPassword_example";
        String newPassword = "newPassword_example";
        try {
            api.userPasswordChange(oldPassword, newPassword).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
