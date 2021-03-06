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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.CorporationOutpostCoordinates;
import net.troja.eve.esi.model.CorporationOutpostService;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationOutpostResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("owner_id")
    private Integer ownerId = null;

    @JsonProperty("system_id")
    private Integer systemId = null;

    @JsonProperty("docking_cost_per_ship_volume")
    private Float dockingCostPerShipVolume = null;

    @JsonProperty("office_rental_cost")
    private Long officeRentalCost = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    @JsonProperty("reprocessing_efficiency")
    private Float reprocessingEfficiency = null;

    @JsonProperty("reprocessing_station_take")
    private Float reprocessingStationTake = null;

    @JsonProperty("standing_owner_id")
    private Integer standingOwnerId = null;

    @JsonProperty("coordinates")
    private CorporationOutpostCoordinates coordinates = null;

    @JsonProperty("services")
    private List<CorporationOutpostService> services = new ArrayList<CorporationOutpostService>();

    public CorporationOutpostResponse ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The entity that owns the station (e.g. the entity whose logo is on the
     * station services bar)
     * 
     * @return ownerId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The entity that owns the station (e.g. the entity whose logo is on the station services bar)")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public CorporationOutpostResponse systemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * The ID of the solar system the outpost rests in
     * 
     * @return systemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The ID of the solar system the outpost rests in")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public CorporationOutpostResponse dockingCostPerShipVolume(Float dockingCostPerShipVolume) {
        this.dockingCostPerShipVolume = dockingCostPerShipVolume;
        return this;
    }

    /**
     * docking_cost_per_ship_volume number
     * 
     * @return dockingCostPerShipVolume
     **/
    @ApiModelProperty(example = "null", required = true, value = "docking_cost_per_ship_volume number")
    public Float getDockingCostPerShipVolume() {
        return dockingCostPerShipVolume;
    }

    public void setDockingCostPerShipVolume(Float dockingCostPerShipVolume) {
        this.dockingCostPerShipVolume = dockingCostPerShipVolume;
    }

    public CorporationOutpostResponse officeRentalCost(Long officeRentalCost) {
        this.officeRentalCost = officeRentalCost;
        return this;
    }

    /**
     * office_rental_cost integer
     * 
     * @return officeRentalCost
     **/
    @ApiModelProperty(example = "null", required = true, value = "office_rental_cost integer")
    public Long getOfficeRentalCost() {
        return officeRentalCost;
    }

    public void setOfficeRentalCost(Long officeRentalCost) {
        this.officeRentalCost = officeRentalCost;
    }

    public CorporationOutpostResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * The type ID of the given outpost
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The type ID of the given outpost")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CorporationOutpostResponse reprocessingEfficiency(Float reprocessingEfficiency) {
        this.reprocessingEfficiency = reprocessingEfficiency;
        return this;
    }

    /**
     * reprocessing_efficiency number
     * 
     * @return reprocessingEfficiency
     **/
    @ApiModelProperty(example = "null", required = true, value = "reprocessing_efficiency number")
    public Float getReprocessingEfficiency() {
        return reprocessingEfficiency;
    }

    public void setReprocessingEfficiency(Float reprocessingEfficiency) {
        this.reprocessingEfficiency = reprocessingEfficiency;
    }

    public CorporationOutpostResponse reprocessingStationTake(Float reprocessingStationTake) {
        this.reprocessingStationTake = reprocessingStationTake;
        return this;
    }

    /**
     * reprocessing_station_take number
     * 
     * @return reprocessingStationTake
     **/
    @ApiModelProperty(example = "null", required = true, value = "reprocessing_station_take number")
    public Float getReprocessingStationTake() {
        return reprocessingStationTake;
    }

    public void setReprocessingStationTake(Float reprocessingStationTake) {
        this.reprocessingStationTake = reprocessingStationTake;
    }

    public CorporationOutpostResponse standingOwnerId(Integer standingOwnerId) {
        this.standingOwnerId = standingOwnerId;
        return this;
    }

    /**
     * The owner ID that sets the ability for someone to dock based on
     * standings.
     * 
     * @return standingOwnerId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The owner ID that sets the ability for someone to dock based on standings.")
    public Integer getStandingOwnerId() {
        return standingOwnerId;
    }

    public void setStandingOwnerId(Integer standingOwnerId) {
        this.standingOwnerId = standingOwnerId;
    }

    public CorporationOutpostResponse coordinates(CorporationOutpostCoordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * Get coordinates
     * 
     * @return coordinates
     **/
    @ApiModelProperty(example = "null", value = "")
    public CorporationOutpostCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(CorporationOutpostCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public CorporationOutpostResponse services(List<CorporationOutpostService> services) {
        this.services = services;
        return this;
    }

    public CorporationOutpostResponse addServicesItem(CorporationOutpostService servicesItem) {
        this.services.add(servicesItem);
        return this;
    }

    /**
     * A list of services the given outpost provides
     * 
     * @return services
     **/
    @ApiModelProperty(example = "null", required = true, value = "A list of services the given outpost provides")
    public List<CorporationOutpostService> getServices() {
        return services;
    }

    public void setServices(List<CorporationOutpostService> services) {
        this.services = services;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationOutpostResponse corporationOutpostResponse = (CorporationOutpostResponse) o;
        return Objects.equals(this.ownerId, corporationOutpostResponse.ownerId)
                && Objects.equals(this.systemId, corporationOutpostResponse.systemId)
                && Objects.equals(this.dockingCostPerShipVolume, corporationOutpostResponse.dockingCostPerShipVolume)
                && Objects.equals(this.officeRentalCost, corporationOutpostResponse.officeRentalCost)
                && Objects.equals(this.typeId, corporationOutpostResponse.typeId)
                && Objects.equals(this.reprocessingEfficiency, corporationOutpostResponse.reprocessingEfficiency)
                && Objects.equals(this.reprocessingStationTake, corporationOutpostResponse.reprocessingStationTake)
                && Objects.equals(this.standingOwnerId, corporationOutpostResponse.standingOwnerId)
                && Objects.equals(this.coordinates, corporationOutpostResponse.coordinates)
                && Objects.equals(this.services, corporationOutpostResponse.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, systemId, dockingCostPerShipVolume, officeRentalCost, typeId,
                reprocessingEfficiency, reprocessingStationTake, standingOwnerId, coordinates, services);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationOutpostResponse {\n");

        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    dockingCostPerShipVolume: ").append(toIndentedString(dockingCostPerShipVolume)).append("\n");
        sb.append("    officeRentalCost: ").append(toIndentedString(officeRentalCost)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    reprocessingEfficiency: ").append(toIndentedString(reprocessingEfficiency)).append("\n");
        sb.append("    reprocessingStationTake: ").append(toIndentedString(reprocessingStationTake)).append("\n");
        sb.append("    standingOwnerId: ").append(toIndentedString(standingOwnerId)).append("\n");
        sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
