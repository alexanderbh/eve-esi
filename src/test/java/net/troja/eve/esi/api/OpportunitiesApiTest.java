/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterOpportunitiesResponse;
import net.troja.eve.esi.model.OpportunitiesGroupResponse;
import net.troja.eve.esi.model.OpportunitiesTasksResponse;

/**
 * API tests for OpportunitiesApi
 */
public class OpportunitiesApiTest extends GeneralApiTest {

    private final OpportunitiesApi api = new OpportunitiesApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Get a character&#39;s completed tasks
     *
     * Return a list of tasks finished by a character --- This route is cached
     * for up to 3600 seconds SSO Scope: esi-characters.read_opportunities.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Currently an internal error occures!")
    public void getCharactersCharacterIdOpportunitiesTest() throws ApiException {
        final List<CharacterOpportunitiesResponse> response = api.getCharactersCharacterIdOpportunities(characterId,
                DATASOURCE, null, null, null);

        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get opportunities groups
     *
     * Return a list of opportunities groups --- This route is cached for up to
     * 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsTest() throws ApiException {
        final List<Integer> response = api.getOpportunitiesGroups(DATASOURCE, null, null);

        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get opportunities group
     *
     * Return information of an opportunities group --- This route is cached for
     * up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsGroupIdTest() throws ApiException {
        final Integer groupId = 105;

        final OpportunitiesGroupResponse response = api.getOpportunitiesGroupsGroupId(groupId, DATASOURCE, LANGUAGE,
                null, null);

        assertThat(response.getName(), equalTo("Base of Operations"));
    }

    /**
     * Get opportunities tasks
     *
     * Return a list of opportunities tasks --- This route is cached for up to
     * 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTest() throws ApiException {
        final List<Integer> response = api.getOpportunitiesTasks(DATASOURCE, null, null);

        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get opportunities task
     *
     * Return information of an opportunities task --- This route is cached for
     * up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTaskIdTest() throws ApiException {
        final Integer taskId = 15;
        final OpportunitiesTasksResponse response = api.getOpportunitiesTasksTaskId(taskId, DATASOURCE, null, null);

        assertThat(response.getName(), equalTo("Complete a mission"));
    }
}