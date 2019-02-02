
package com.comcast.schemafiles.StandardizeAddressError.response;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class StandardizeAddressError {

    private com.comcast.schemafiles.StandardizeAddressError.response.StandardizeAddressErrors StandardizeAddressErrors;

    /**
     * 
     * @return
     *     The StandardizeAddressErrors
     */
    public com.comcast.schemafiles.StandardizeAddressError.response.StandardizeAddressErrors getStandardizeAddressErrors() {
        return StandardizeAddressErrors;
    }

    /**
     * 
     * @param StandardizeAddressErrors
     *     The StandardizeAddressErrors
     */
    public void setStandardizeAddressErrors(com.comcast.schemafiles.StandardizeAddressError.response.StandardizeAddressErrors StandardizeAddressErrors) {
        this.StandardizeAddressErrors = StandardizeAddressErrors;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(StandardizeAddressErrors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardizeAddressError) == false) {
            return false;
        }
        StandardizeAddressError rhs = ((StandardizeAddressError) other);
        return new EqualsBuilder().append(StandardizeAddressErrors, rhs.StandardizeAddressErrors).isEquals();
    }

}
