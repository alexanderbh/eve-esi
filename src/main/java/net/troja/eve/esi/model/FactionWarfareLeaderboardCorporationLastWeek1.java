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
 * last_week object
 */
@ApiModel(description = "last_week object")
public class FactionWarfareLeaderboardCorporationLastWeek1 implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("amount")
    private Integer amount = null;

    @JsonProperty("corporation_id")
    private Integer corporationId = null;

    public FactionWarfareLeaderboardCorporationLastWeek1 amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Amount of victory points
     * 
     * @return amount
     **/
    @ApiModelProperty(example = "null", value = "Amount of victory points")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public FactionWarfareLeaderboardCorporationLastWeek1 corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(example = "null", value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCorporationLastWeek1 factionWarfareLeaderboardCorporationLastWeek1 = (FactionWarfareLeaderboardCorporationLastWeek1) o;
        return Objects.equals(this.amount, factionWarfareLeaderboardCorporationLastWeek1.amount)
                && Objects.equals(this.corporationId, factionWarfareLeaderboardCorporationLastWeek1.corporationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, corporationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCorporationLastWeek1 {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
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
