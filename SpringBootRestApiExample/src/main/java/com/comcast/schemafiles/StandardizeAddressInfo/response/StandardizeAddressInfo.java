
package com.comcast.schemafiles.StandardizeAddressInfo.response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class StandardizeAddressInfo {

    private List<StandardizeAddressesInfo> standardizeAddressesInfo = new ArrayList<StandardizeAddressesInfo>();

    /**
     * 
     * @return
     *     The standardizeAddressesInfo
     */
    public List<StandardizeAddressesInfo> getStandardizeAddressesInfo() {
        return standardizeAddressesInfo;
    }

    /**
     * 
     * @param standardizeAddressesInfo
     *     The standardizeAddressesInfo
     */
    public void setStandardizeAddressesInfo(List<StandardizeAddressesInfo> standardizeAddressesInfo) {
        this.standardizeAddressesInfo = standardizeAddressesInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(standardizeAddressesInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardizeAddressInfo) == false) {
            return false;
        }
        StandardizeAddressInfo rhs = ((StandardizeAddressInfo) other);
        return new EqualsBuilder().append(standardizeAddressesInfo, rhs.standardizeAddressesInfo).isEquals();
    }

}
