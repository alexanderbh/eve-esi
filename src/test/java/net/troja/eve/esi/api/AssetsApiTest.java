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

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterAssetsResponse;

/**
 * API tests for AssetsApi
 */
public class AssetsApiTest extends GeneralApiTest {

    private final AssetsApi api = new AssetsApi();

    /**
     * Get character assets
     *
     * Return a list of the characters assets --- Alternate route:
     * &#x60;/v1/characters/{character_id}/assets/&#x60; Alternate route:
     * &#x60;/legacy/characters/{character_id}/assets/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/assets/&#x60; --- This route is
     * cached for up to 3600 seconds SSO Scope: esi-assets.read_assets.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore
    public void getCharactersCharacterIdAssetsTest() throws ApiException {
        final List<CharacterAssetsResponse> response = api.getCharactersCharacterIdAssets(characterId, DATASOURCE);

        System.out.println(response);
    }
}
