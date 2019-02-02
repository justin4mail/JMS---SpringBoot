
package com.comcast.schemafiles.StandardizeAddressInfo.response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GeographyInfo {

    private String countyName;
    private String fipsCode;
    private List<Link> links = new ArrayList<Link>();
    private String minorCivilDivision;
    private String placeName;
    private String vertexCode;

    /**
     * 
     * @return
     *     The countyName
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * 
     * @param countyName
     *     The countyName
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    /**
     * 
     * @return
     *     The fipsCode
     */
    public String getFipsCode() {
        return fipsCode;
    }

    /**
     * 
     * @param fipsCode
     *     The fipsCode
     */
    public void setFipsCode(String fipsCode) {
        this.fipsCode = fipsCode;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The minorCivilDivision
     */
    public String getMinorCivilDivision() {
        return minorCivilDivision;
    }

    /**
     * 
     * @param minorCivilDivision
     *     The minorCivilDivision
     */
    public void setMinorCivilDivision(String minorCivilDivision) {
        this.minorCivilDivision = minorCivilDivision;
    }

    /**
     * 
     * @return
     *     The placeName
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * 
     * @param placeName
     *     The placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /**
     * 
     * @return
     *     The vertexCode
     */
    public String getVertexCode() {
        return vertexCode;
    }

    /**
     * 
     * @param vertexCode
     *     The vertexCode
     */
    public void setVertexCode(String vertexCode) {
        this.vertexCode = vertexCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(countyName).append(fipsCode).append(links).append(minorCivilDivision).append(placeName).append(vertexCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeographyInfo) == false) {
            return false;
        }
        GeographyInfo rhs = ((GeographyInfo) other);
        return new EqualsBuilder().append(countyName, rhs.countyName).append(fipsCode, rhs.fipsCode).append(links, rhs.links).append(minorCivilDivision, rhs.minorCivilDivision).append(placeName, rhs.placeName).append(vertexCode, rhs.vertexCode).isEquals();
    }

}
