
package com.comcast.schemafiles.StandardizeAddressInfo.response;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class UnitType {

    private String unitType;
    private String unitValue;

    /**
     * 
     * @return
     *     The unitType
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * 
     * @param unitType
     *     The unitType
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * 
     * @return
     *     The unitValue
     */
    public String getUnitValue() {
        return unitValue;
    }

    /**
     * 
     * @param unitValue
     *     The unitValue
     */
    public void setUnitValue(String unitValue) {
        this.unitValue = unitValue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unitType).append(unitValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnitType) == false) {
            return false;
        }
        UnitType rhs = ((UnitType) other);
        return new EqualsBuilder().append(unitType, rhs.unitType).append(unitValue, rhs.unitValue).isEquals();
    }

}
