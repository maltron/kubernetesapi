/**
 * Copyright 2014 Mauricio "Maltron" Leal <maltron@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Event is a report of an event somewhere in the cluster.
 * 
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "event")
@XmlAccessorType(XmlAccessType.FIELD)
public class Event implements Serializable {
    
    /**
     * Kind is a string value representing the REST resource this object 
     * represents. Servers may infer this from the endpoint the client submits 
     * requests to. Cannot be updated. In CamelCase. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    @XmlElement(name="kind", required = false, type = String.class)
    private String kind;
    
    /**
     * APIVersion defines the versioned schema of this representation of an 
     * object. 
     * 
     * Servers should convert recognized schemas to the latest internal value, 
     * and may reject unrecognized values. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources
     */
    @XmlElement(name="apiVersion", required = false, type = String.class)
    private String apiVersion;
    
    /**
     * Standard object’s metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#metadata
     */
    @XmlElement(name="metadata", required = true, type = ObjectMeta.class)
    private ObjectMeta metadata;
    
    /**
     * The object that this event is about.
     */
    @XmlElement(name="involvedObject", required = true, type = ObjectReference.class)
    private ObjectReference involvedObject;
    
    /**
     * This should be a short, machine understandable string that gives the 
     * 
     * reason for the transition into the object’s current status.
     */
    @XmlElement(name="reason", required = false, type = String.class)
    private String reason;
    
    /**
     * A human-readable description of the status of this operation.
     */
    @XmlElement(name="message", required = false, type = String.class)
    private String message;
    
    /**
     * The component reporting this event. 
     * 
     * Should be a short machine understandable string.
     */
    @XmlElement(name="source", required = false, type = EventSource.class)
    private EventSource source;
    
    /**
     * The time at which the event was first recorded. 
     * (Time of server receipt is in TypeMeta.)
     */
    @XmlElement(name="firstTimestamp", required = false, type = Instant.class)
    private Instant firstTimestamp;
    
    /**
     * The time at which the most recent occurrence of this event was recorded.
     */
    @XmlElement(name="lastTimestamp", required = false, type = Instant.class)
    private Instant lastTimestamp;
    
    /**
     * The number of times this event has occurred.
     */
    @XmlElement(name="count", required = false, type = String.class)
    private int count;
    
    /**
     * Type of this event (Normal, Warning), new types could be 
     * added in the future
     */
    @XmlElement(name="type", required = false, type = String.class)
    private String type;

    public Event() {
    }

    public Event(ObjectMeta metadata, ObjectReference involvedObject) {
        this.metadata = metadata;
        this.involvedObject = involvedObject;
    }

    /**
     * Kind is a string value representing the REST resource this object 
     * represents. Servers may infer this from the endpoint the client submits 
     * requests to. Cannot be updated. In CamelCase. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    public String getKind() {
        return kind;
    }

    /**
     * Kind is a string value representing the REST resource this object 
     * represents. Servers may infer this from the endpoint the client submits 
     * requests to. Cannot be updated. In CamelCase. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an 
     * object. 
     * 
     * Servers should convert recognized schemas to the latest internal value, 
     * and may reject unrecognized values. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an 
     * object. 
     * 
     * Servers should convert recognized schemas to the latest internal value, 
     * and may reject unrecognized values. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Standard object’s metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#metadata
     */
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * Standard object’s metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#metadata
     */
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * The object that this event is about.
     */
    public ObjectReference getInvolvedObject() {
        return involvedObject;
    }

    /**
     * The object that this event is about.
     */
    public void setInvolvedObject(ObjectReference involvedObject) {
        this.involvedObject = involvedObject;
    }

    /**
     * This should be a short, machine understandable string that gives the 
     * 
     * reason for the transition into the object’s current status.
     */
    public String getReason() {
        return reason;
    }

    /**
     * This should be a short, machine understandable string that gives the 
     * 
     * reason for the transition into the object’s current status.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * A human-readable description of the status of this operation.
     */
    public String getMessage() {
        return message;
    }

    /**
     * A human-readable description of the status of this operation.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The component reporting this event. 
     * 
     * Should be a short machine understandable string.
     */
    public EventSource getSource() {
        return source;
    }

    /**
     * The component reporting this event. 
     * 
     * Should be a short machine understandable string.
     */
    public void setSource(EventSource source) {
        this.source = source;
    }

    /**
     * The time at which the event was first recorded. 
     * (Time of server receipt is in TypeMeta.)
     */
    public Instant getFirstTimestamp() {
        return firstTimestamp;
    }

    /**
     * The time at which the event was first recorded. 
     * (Time of server receipt is in TypeMeta.)
     */
    public void setFirstTimestamp(Instant firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    /**
     * The time at which the most recent occurrence of this event was recorded.
     */
    public Instant getLastTimestamp() {
        return lastTimestamp;
    }

    /**
     * The time at which the most recent occurrence of this event was recorded.
     */
    public void setLastTimestamp(Instant lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    /**
     * The number of times this event has occurred.
     */
    public int getCount() {
        return count;
    }

    /**
     * The number of times this event has occurred.
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Type of this event (Normal, Warning), new types could be 
     * added in the future
     */
    public String getType() {
        return type;
    }

    /**
     * Type of this event (Normal, Warning), new types could be 
     * added in the future
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.kind);
        hash = 37 * hash + Objects.hashCode(this.apiVersion);
        hash = 37 * hash + Objects.hashCode(this.metadata);
        hash = 37 * hash + Objects.hashCode(this.involvedObject);
        hash = 37 * hash + Objects.hashCode(this.reason);
        hash = 37 * hash + Objects.hashCode(this.message);
        hash = 37 * hash + Objects.hashCode(this.source);
        hash = 37 * hash + Objects.hashCode(this.firstTimestamp);
        hash = 37 * hash + Objects.hashCode(this.lastTimestamp);
        hash = 37 * hash + this.count;
        hash = 37 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Event other = (Event) obj;
        if (this.count != other.count) {
            return false;
        }
        if (!Objects.equals(this.kind, other.kind)) {
            return false;
        }
        if (!Objects.equals(this.apiVersion, other.apiVersion)) {
            return false;
        }
        if (!Objects.equals(this.reason, other.reason)) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.metadata, other.metadata)) {
            return false;
        }
        if (!Objects.equals(this.involvedObject, other.involvedObject)) {
            return false;
        }
        if (!Objects.equals(this.source, other.source)) {
            return false;
        }
        if (!Objects.equals(this.firstTimestamp, other.firstTimestamp)) {
            return false;
        }
        if (!Objects.equals(this.lastTimestamp, other.lastTimestamp)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
