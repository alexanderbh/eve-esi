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
 * position object
 */
@ApiModel(description = "position object")
public class CharacterAssetsLocationsPosition implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("x")
    private Double x = null;

    @JsonProperty("y")
    private Double y = null;

    @JsonProperty("z")
    private Double z = null;

    public CharacterAssetsLocationsPosition x(Double x) {
        this.x = x;
        return this;
    }

    /**
     * x number
     * 
     * @return x
     **/
    @ApiModelProperty(example = "null", required = true, value = "x number")
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public CharacterAssetsLocationsPosition y(Double y) {
        this.y = y;
        return this;
    }

    /**
     * y number
     * 
     * @return y
     **/
    @ApiModelProperty(example = "null", required = true, value = "y number")
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public CharacterAssetsLocationsPosition z(Double z) {
        this.z = z;
        return this;
    }

    /**
     * z number
     * 
     * @return z
     **/
    @ApiModelProperty(example = "null", required = true, value = "z number")
    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterAssetsLocationsPosition characterAssetsLocationsPosition = (CharacterAssetsLocationsPosition) o;
        return Objects.equals(this.x, characterAssetsLocationsPosition.x)
                && Objects.equals(this.y, characterAssetsLocationsPosition.y)
                && Objects.equals(this.z, characterAssetsLocationsPosition.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterAssetsLocationsPosition {\n");

        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
