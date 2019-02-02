
package com.comcast.schemafiles.StandardizeAddressError.response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class StandardizeAddressErrors {

    private String code;
    private Details details;
    private String id;
    private String message;
    private String timestamp;
    private String type;
    private List<String> validationMessages = new ArrayList<String>();

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The details
     */
    public Details getDetails() {
        return details;
    }

    /**
     * 
     * @param details
     *     The details
     */
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The validationMessages
     */
    public List<String> getValidationMessages() {
        return validationMessages;
    }

    /**
     * 
     * @param validationMessages
     *     The validationMessages
     */
    public void setValidationMessages(List<String> validationMessages) {
        this.validationMessages = validationMessages;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(details).append(id).append(message).append(timestamp).append(type).append(validationMessages).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardizeAddressErrors) == false) {
            return false;
        }
        StandardizeAddressErrors rhs = ((StandardizeAddressErrors) other);
        return new EqualsBuilder().append(code, rhs.code).append(details, rhs.details).append(id, rhs.id).append(message, rhs.message).append(timestamp, rhs.timestamp).append(type, rhs.type).append(validationMessages, rhs.validationMessages).isEquals();
    }

}
