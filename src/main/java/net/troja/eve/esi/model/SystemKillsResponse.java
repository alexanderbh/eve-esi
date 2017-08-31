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

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class SystemKillsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("npc_kills")
    private Integer npcKills = null;

    @JsonProperty("pod_kills")
    private Integer podKills = null;

    @JsonProperty("ship_kills")
    private Integer shipKills = null;

    @JsonProperty("system_id")
    private Integer systemId = null;

    public SystemKillsResponse npcKills(Integer npcKills) {
        this.npcKills = npcKills;
        return this;
    }

    /**
     * Number of NPC ships killed in this system
     * 
     * @return npcKills
     **/
    @ApiModelProperty(example = "null", required = true, value = "Number of NPC ships killed in this system")
    public Integer getNpcKills() {
        return npcKills;
    }

    public void setNpcKills(Integer npcKills) {
        this.npcKills = npcKills;
    }

    public SystemKillsResponse podKills(Integer podKills) {
        this.podKills = podKills;
        return this;
    }

    /**
     * Number of pods killed in this system
     * 
     * @return podKills
     **/
    @ApiModelProperty(example = "null", required = true, value = "Number of pods killed in this system")
    public Integer getPodKills() {
        return podKills;
    }

    public void setPodKills(Integer podKills) {
        this.podKills = podKills;
    }

    public SystemKillsResponse shipKills(Integer shipKills) {
        this.shipKills = shipKills;
        return this;
    }

    /**
     * Number of player ships killed in this system
     * 
     * @return shipKills
     **/
    @ApiModelProperty(example = "null", required = true, value = "Number of player ships killed in this system")
    public Integer getShipKills() {
        return shipKills;
    }

    public void setShipKills(Integer shipKills) {
        this.shipKills = shipKills;
    }

    public SystemKillsResponse systemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * system_id integer
     * 
     * @return systemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "system_id integer")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemKillsResponse systemKillsResponse = (SystemKillsResponse) o;
        return Objects.equals(this.npcKills, systemKillsResponse.npcKills)
                && Objects.equals(this.podKills, systemKillsResponse.podKills)
                && Objects.equals(this.shipKills, systemKillsResponse.shipKills)
                && Objects.equals(this.systemId, systemKillsResponse.systemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(npcKills, podKills, shipKills, systemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemKillsResponse {\n");

        sb.append("    npcKills: ").append(toIndentedString(npcKills)).append("\n");
        sb.append("    podKills: ").append(toIndentedString(podKills)).append("\n");
        sb.append("    shipKills: ").append(toIndentedString(shipKills)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
