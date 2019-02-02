
package com.comcast.schemafiles.StandardizeAddressInfo.response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GeoCodedAddressInfo {

    private String censusBlock;
    private String censusTrack;
    private String city;
    private Boolean closeMatch;
    private String dpv;
    private String dpvCMRA;
    private String dpvFootnote;
    private String dwellingCode;
    private String geocodePrecision;
    private String geocodingPointLocation;
    private String houseNumber;
    private String houseNumberPrefix;
    private String houseNumberSuffix;
    private String latitude;
    private String longitude;
    private String matchMethod;
    private String stateCode;
    private String streetName;
    private String streetPostDirection;
    private String streetPreDirection;
    private String streetSide;
    private String streetSuffix;
    private List<UnitType> unitTypes = new ArrayList<UnitType>();
    private String urbanization;
    private String zip4;
    private String zip5;

    /**
     * 
     * @return
     *     The censusBlock
     */
    public String getCensusBlock() {
        return censusBlock;
    }

    /**
     * 
     * @param censusBlock
     *     The censusBlock
     */
    public void setCensusBlock(String censusBlock) {
        this.censusBlock = censusBlock;
    }

    /**
     * 
     * @return
     *     The censusTrack
     */
    public String getCensusTrack() {
        return censusTrack;
    }

    /**
     * 
     * @param censusTrack
     *     The censusTrack
     */
    public void setCensusTrack(String censusTrack) {
        this.censusTrack = censusTrack;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The closeMatch
     */
    public Boolean getCloseMatch() {
        return closeMatch;
    }

    /**
     * 
     * @param closeMatch
     *     The closeMatch
     */
    public void setCloseMatch(Boolean closeMatch) {
        this.closeMatch = closeMatch;
    }

    /**
     * 
     * @return
     *     The dpv
     */
    public String getDpv() {
        return dpv;
    }

    /**
     * 
     * @param dpv
     *     The dpv
     */
    public void setDpv(String dpv) {
        this.dpv = dpv;
    }

    /**
     * 
     * @return
     *     The dpvCMRA
     */
    public String getDpvCMRA() {
        return dpvCMRA;
    }

    /**
     * 
     * @param dpvCMRA
     *     The dpvCMRA
     */
    public void setDpvCMRA(String dpvCMRA) {
        this.dpvCMRA = dpvCMRA;
    }

    /**
     * 
     * @return
     *     The dpvFootnote
     */
    public String getDpvFootnote() {
        return dpvFootnote;
    }

    /**
     * 
     * @param dpvFootnote
     *     The dpvFootnote
     */
    public void setDpvFootnote(String dpvFootnote) {
        this.dpvFootnote = dpvFootnote;
    }

    /**
     * 
     * @return
     *     The dwellingCode
     */
    public String getDwellingCode() {
        return dwellingCode;
    }

    /**
     * 
     * @param dwellingCode
     *     The dwellingCode
     */
    public void setDwellingCode(String dwellingCode) {
        this.dwellingCode = dwellingCode;
    }

    /**
     * 
     * @return
     *     The geocodePrecision
     */
    public String getGeocodePrecision() {
        return geocodePrecision;
    }

    /**
     * 
     * @param geocodePrecision
     *     The geocodePrecision
     */
    public void setGeocodePrecision(String geocodePrecision) {
        this.geocodePrecision = geocodePrecision;
    }

    /**
     * 
     * @return
     *     The geocodingPointLocation
     */
    public String getGeocodingPointLocation() {
        return geocodingPointLocation;
    }

    /**
     * 
     * @param geocodingPointLocation
     *     The geocodingPointLocation
     */
    public void setGeocodingPointLocation(String geocodingPointLocation) {
        this.geocodingPointLocation = geocodingPointLocation;
    }

    /**
     * 
     * @return
     *     The houseNumber
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * 
     * @param houseNumber
     *     The houseNumber
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * 
     * @return
     *     The houseNumberPrefix
     */
    public String getHouseNumberPrefix() {
        return houseNumberPrefix;
    }

    /**
     * 
     * @param houseNumberPrefix
     *     The houseNumberPrefix
     */
    public void setHouseNumberPrefix(String houseNumberPrefix) {
        this.houseNumberPrefix = houseNumberPrefix;
    }

    /**
     * 
     * @return
     *     The houseNumberSuffix
     */
    public String getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    /**
     * 
     * @param houseNumberSuffix
     *     The houseNumberSuffix
     */
    public void setHouseNumberSuffix(String houseNumberSuffix) {
        this.houseNumberSuffix = houseNumberSuffix;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The matchMethod
     */
    public String getMatchMethod() {
        return matchMethod;
    }

    /**
     * 
     * @param matchMethod
     *     The matchMethod
     */
    public void setMatchMethod(String matchMethod) {
        this.matchMethod = matchMethod;
    }

    /**
     * 
     * @return
     *     The stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * 
     * @param stateCode
     *     The stateCode
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * 
     * @return
     *     The streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * 
     * @param streetName
     *     The streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * 
     * @return
     *     The streetPostDirection
     */
    public String getStreetPostDirection() {
        return streetPostDirection;
    }

    /**
     * 
     * @param streetPostDirection
     *     The streetPostDirection
     */
    public void setStreetPostDirection(String streetPostDirection) {
        this.streetPostDirection = streetPostDirection;
    }

    /**
     * 
     * @return
     *     The streetPreDirection
     */
    public String getStreetPreDirection() {
        return streetPreDirection;
    }

    /**
     * 
     * @param streetPreDirection
     *     The streetPreDirection
     */
    public void setStreetPreDirection(String streetPreDirection) {
        this.streetPreDirection = streetPreDirection;
    }

    /**
     * 
     * @return
     *     The streetSide
     */
    public String getStreetSide() {
        return streetSide;
    }

    /**
     * 
     * @param streetSide
     *     The streetSide
     */
    public void setStreetSide(String streetSide) {
        this.streetSide = streetSide;
    }

    /**
     * 
     * @return
     *     The streetSuffix
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * 
     * @param streetSuffix
     *     The streetSuffix
     */
    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    /**
     * 
     * @return
     *     The unitTypes
     */
    public List<UnitType> getUnitTypes() {
        return unitTypes;
    }

    /**
     * 
     * @param unitTypes
     *     The unitTypes
     */
    public void setUnitTypes(List<UnitType> unitTypes) {
        this.unitTypes = unitTypes;
    }

    /**
     * 
     * @return
     *     The urbanization
     */
    public String getUrbanization() {
        return urbanization;
    }

    /**
     * 
     * @param urbanization
     *     The urbanization
     */
    public void setUrbanization(String urbanization) {
        this.urbanization = urbanization;
    }

    /**
     * 
     * @return
     *     The zip4
     */
    public String getZip4() {
        return zip4;
    }

    /**
     * 
     * @param zip4
     *     The zip4
     */
    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    /**
     * 
     * @return
     *     The zip5
     */
    public String getZip5() {
        return zip5;
    }

    /**
     * 
     * @param zip5
     *     The zip5
     */
    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(censusBlock).append(censusTrack).append(city).append(closeMatch).append(dpv).append(dpvCMRA).append(dpvFootnote).append(dwellingCode).append(geocodePrecision).append(geocodingPointLocation).append(houseNumber).append(houseNumberPrefix).append(houseNumberSuffix).append(latitude).append(longitude).append(matchMethod).append(stateCode).append(streetName).append(streetPostDirection).append(streetPreDirection).append(streetSide).append(streetSuffix).append(unitTypes).append(urbanization).append(zip4).append(zip5).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoCodedAddressInfo) == false) {
            return false;
        }
        GeoCodedAddressInfo rhs = ((GeoCodedAddressInfo) other);
        return new EqualsBuilder().append(censusBlock, rhs.censusBlock).append(censusTrack, rhs.censusTrack).append(city, rhs.city).append(closeMatch, rhs.closeMatch).append(dpv, rhs.dpv).append(dpvCMRA, rhs.dpvCMRA).append(dpvFootnote, rhs.dpvFootnote).append(dwellingCode, rhs.dwellingCode).append(geocodePrecision, rhs.geocodePrecision).append(geocodingPointLocation, rhs.geocodingPointLocation).append(houseNumber, rhs.houseNumber).append(houseNumberPrefix, rhs.houseNumberPrefix).append(houseNumberSuffix, rhs.houseNumberSuffix).append(latitude, rhs.latitude).append(longitude, rhs.longitude).append(matchMethod, rhs.matchMethod).append(stateCode, rhs.stateCode).append(streetName, rhs.streetName).append(streetPostDirection, rhs.streetPostDirection).append(streetPreDirection, rhs.streetPreDirection).append(streetSide, rhs.streetSide).append(streetSuffix, rhs.streetSuffix).append(unitTypes, rhs.unitTypes).append(urbanization, rhs.urbanization).append(zip4, rhs.zip4).append(zip5, rhs.zip5).isEquals();
    }

}
