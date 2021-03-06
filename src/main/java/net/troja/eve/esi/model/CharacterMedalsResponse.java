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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.CharacterMedalsGraphic;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterMedalsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("medal_id")
    private Integer medalId = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("corporation_id")
    private Integer corporationId = null;

    @JsonProperty("issuer_id")
    private Integer issuerId = null;

    @JsonProperty("date")
    private OffsetDateTime date = null;

    @JsonProperty("reason")
    private String reason = null;

    /**
     * status string
     */
    public enum StatusEnum {
        PUBLIC("public"),

        PRIVATE("private");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("status")
    private StatusEnum status = null;

    @JsonProperty("graphics")
    private List<CharacterMedalsGraphic> graphics = new ArrayList<CharacterMedalsGraphic>();

    public CharacterMedalsResponse medalId(Integer medalId) {
        this.medalId = medalId;
        return this;
    }

    /**
     * medal_id integer
     * 
     * @return medalId
     **/
    @ApiModelProperty(example = "null", required = true, value = "medal_id integer")
    public Integer getMedalId() {
        return medalId;
    }

    public void setMedalId(Integer medalId) {
        this.medalId = medalId;
    }

    public CharacterMedalsResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * title string
     * 
     * @return title
     **/
    @ApiModelProperty(example = "null", required = true, value = "title string")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CharacterMedalsResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(example = "null", required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CharacterMedalsResponse corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public CharacterMedalsResponse issuerId(Integer issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * issuer_id integer
     * 
     * @return issuerId
     **/
    @ApiModelProperty(example = "null", required = true, value = "issuer_id integer")
    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public CharacterMedalsResponse date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * date string
     * 
     * @return date
     **/
    @ApiModelProperty(example = "null", required = true, value = "date string")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CharacterMedalsResponse reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * reason string
     * 
     * @return reason
     **/
    @ApiModelProperty(example = "null", required = true, value = "reason string")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public CharacterMedalsResponse status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * status string
     * 
     * @return status
     **/
    @ApiModelProperty(example = "null", required = true, value = "status string")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CharacterMedalsResponse graphics(List<CharacterMedalsGraphic> graphics) {
        this.graphics = graphics;
        return this;
    }

    public CharacterMedalsResponse addGraphicsItem(CharacterMedalsGraphic graphicsItem) {
        this.graphics.add(graphicsItem);
        return this;
    }

    /**
     * graphics array
     * 
     * @return graphics
     **/
    @ApiModelProperty(example = "null", required = true, value = "graphics array")
    public List<CharacterMedalsGraphic> getGraphics() {
        return graphics;
    }

    public void setGraphics(List<CharacterMedalsGraphic> graphics) {
        this.graphics = graphics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterMedalsResponse characterMedalsResponse = (CharacterMedalsResponse) o;
        return Objects.equals(this.medalId, characterMedalsResponse.medalId)
                && Objects.equals(this.title, characterMedalsResponse.title)
                && Objects.equals(this.description, characterMedalsResponse.description)
                && Objects.equals(this.corporationId, characterMedalsResponse.corporationId)
                && Objects.equals(this.issuerId, characterMedalsResponse.issuerId)
                && Objects.equals(this.date, characterMedalsResponse.date)
                && Objects.equals(this.reason, characterMedalsResponse.reason)
                && Objects.equals(this.status, characterMedalsResponse.status)
                && Objects.equals(this.graphics, characterMedalsResponse.graphics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medalId, title, description, corporationId, issuerId, date, reason, status, graphics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterMedalsResponse {\n");

        sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    graphics: ").append(toIndentedString(graphics)).append("\n");
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
