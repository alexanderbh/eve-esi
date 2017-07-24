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
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.DogmaAttributeResponse;
import net.troja.eve.esi.model.DogmaEffectResponse;

/**
 * API tests for DogmaApi
 */
public class DogmaApiTest extends GeneralApiTest {

    private final DogmaApi api = new DogmaApi();

    /**
     * Get attributes
     *
     * Get a list of dogma attribute ids --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaAttributesTest() throws ApiException {
        final List<Integer> response = api.getDogmaAttributes(DATASOURCE, null, null);

        assertThat(response.size(), equalTo(2357));
    }

    /**
     * Get attribute information
     *
     * Get information on a dogma attribute --- This route is cached for up to
     * 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaAttributesAttributeIdTest() throws ApiException {
        final Integer attributeId = 165;
        final String userAgent = null;
        final String xUserAgent = null;
        final DogmaAttributeResponse response = api.getDogmaAttributesAttributeId(attributeId, DATASOURCE, userAgent,
                xUserAgent);

        assertThat(response.getAttributeId(), equalTo(attributeId));
        assertThat(response.getName(), equalTo("intelligence"));
    }

    /**
     * Get effects
     *
     * Get a list of dogma effect ids --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaEffectsTest() throws ApiException {
        final String userAgent = null;
        final String xUserAgent = null;
        final List<Integer> response = api.getDogmaEffects(DATASOURCE, userAgent, xUserAgent);

        assertThat(response.size(), equalTo(3986));
    }

    /**
     * Get effect information
     *
     * Get information on a dogma effect --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaEffectsEffectIdTest() throws ApiException {
        final Integer effectId = 254;
        final String userAgent = null;
        final String xUserAgent = null;
        final DogmaEffectResponse response = api.getDogmaEffectsEffectId(effectId, DATASOURCE, userAgent, xUserAgent);

        assertThat(response.getEffectId(), equalTo(effectId));
        assertThat(response.getName(), equalTo("shadowBarrageFalloffWithFalloffPostPercentBarrageFalloffMutator"));
    }
}
