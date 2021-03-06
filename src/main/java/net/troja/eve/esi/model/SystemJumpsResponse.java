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
public class SystemJumpsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("system_id")
    private Integer systemId = null;

    @JsonProperty("ship_jumps")
    private Integer shipJumps = null;

    public SystemJumpsResponse systemId(Integer systemId) {
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

    public SystemJumpsResponse shipJumps(Integer shipJumps) {
        this.shipJumps = shipJumps;
        return this;
    }

    /**
     * ship_jumps integer
     * 
     * @return shipJumps
     **/
    @ApiModelProperty(example = "null", required = true, value = "ship_jumps integer")
    public Integer getShipJumps() {
        return shipJumps;
    }

    public void setShipJumps(Integer shipJumps) {
        this.shipJumps = shipJumps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemJumpsResponse systemJumpsResponse = (SystemJumpsResponse) o;
        return Objects.equals(this.systemId, systemJumpsResponse.systemId)
                && Objects.equals(this.shipJumps, systemJumpsResponse.shipJumps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemId, shipJumps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemJumpsResponse {\n");

        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    shipJumps: ").append(toIndentedString(shipJumps)).append("\n");
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
