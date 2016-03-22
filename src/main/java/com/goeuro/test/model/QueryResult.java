package com.goeuro.test.model;

/**
 * @author szagriichuk.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "key",
        "name",
        "fullName",
        "iata_airport_code",
        "type",
        "country",
        "geo_position",
        "locationId",
        "inEurope",
        "countryCode",
        "coreCountry",
        "distance"
})
public class QueryResult {

    @JsonProperty("_id")
    private int _id;
    @JsonProperty("key")
    private Object key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("iata_airport_code")
    private Object iata_airport_code;
    @JsonProperty("type")
    private String type;
    @JsonProperty("country")
    private String country;
    @JsonProperty("geo_position")
    private GeoPosition geo_position;
    @JsonProperty("locationId")
    private Object locationId;
    @JsonProperty("inEurope")
    private boolean inEurope;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("coreCountry")
    private boolean coreCountry;
    @JsonProperty("distance")
    private Object distance;

    @JsonProperty("_id")
    public int get_id() {
        return _id;
    }

    @JsonProperty("_id")
    public void set_id(int _id) {
        this._id = _id;
    }

    @JsonProperty("key")
    public Object getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(Object key) {
        this.key = key;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("iata_airport_code")
    public Object getIata_airport_code() {
        return iata_airport_code;
    }

    @JsonProperty("iata_airport_code")
    public void setIata_airport_code(Object iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("geo_position")
    public GeoPosition getGeo_position() {
        return geo_position;
    }

    @JsonProperty("geo_position")
    public void setGeo_position(GeoPosition geo_position) {
        this.geo_position = geo_position;
    }

    @JsonProperty("locationId")
    public Object getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(Object locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("inEurope")
    public boolean isInEurope() {
        return inEurope;
    }

    @JsonProperty("inEurope")
    public void setInEurope(boolean inEurope) {
        this.inEurope = inEurope;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("coreCountry")
    public boolean isCoreCountry() {
        return coreCountry;
    }

    @JsonProperty("coreCountry")
    public void setCoreCountry(boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    @JsonProperty("distance")
    public Object getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Object distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "_id=" + _id +
                ", key=" + key +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", iata_airport_code=" + iata_airport_code +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", geo_position=" + geo_position +
                ", locationId=" + locationId +
                ", inEurope=" + inEurope +
                ", countryCode='" + countryCode + '\'' +
                ", coreCountry=" + coreCountry +
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QueryResult that = (QueryResult) o;

        if (_id != that._id) return false;
        if (inEurope != that.inEurope) return false;
        if (coreCountry != that.coreCountry) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (iata_airport_code != null ? !iata_airport_code.equals(that.iata_airport_code) : that.iata_airport_code != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (geo_position != null ? !geo_position.equals(that.geo_position) : that.geo_position != null) return false;
        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        return distance != null ? distance.equals(that.distance) : that.distance == null;

    }

    @Override
    public int hashCode() {
        int result = _id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (iata_airport_code != null ? iata_airport_code.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (geo_position != null ? geo_position.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        result = 31 * result + (inEurope ? 1 : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (coreCountry ? 1 : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }
}
