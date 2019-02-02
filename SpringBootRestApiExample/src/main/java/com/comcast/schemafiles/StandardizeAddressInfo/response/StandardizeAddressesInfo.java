
package com.comcast.schemafiles.StandardizeAddressInfo.response;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class StandardizeAddressesInfo {

    private GeoCodedAddressInfo geoCodedAddressInfo;
    private GeographyInfo geographyInfo;

    /**
     * 
     * @return
     *     The geoCodedAddressInfo
     */
    public GeoCodedAddressInfo getGeoCodedAddressInfo() {
        return geoCodedAddressInfo;
    }

    /**
     * 
     * @param geoCodedAddressInfo
     *     The geoCodedAddressInfo
     */
    public void setGeoCodedAddressInfo(GeoCodedAddressInfo geoCodedAddressInfo) {
        this.geoCodedAddressInfo = geoCodedAddressInfo;
    }

    /**
     * 
     * @return
     *     The geographyInfo
     */
    public GeographyInfo getGeographyInfo() {
        return geographyInfo;
    }

    /**
     * 
     * @param geographyInfo
     *     The geographyInfo
     */
    public void setGeographyInfo(GeographyInfo geographyInfo) {
        this.geographyInfo = geographyInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geoCodedAddressInfo).append(geographyInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardizeAddressesInfo) == false) {
            return false;
        }
        StandardizeAddressesInfo rhs = ((StandardizeAddressesInfo) other);
        return new EqualsBuilder().append(geoCodedAddressInfo, rhs.geoCodedAddressInfo).append(geographyInfo, rhs.geographyInfo).isEquals();
    }

}
