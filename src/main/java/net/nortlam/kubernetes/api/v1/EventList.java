/*
 * 
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
 * 
 */
package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * EventList is a list of events.
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "eventlist")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventList implements Serializable {

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
     * object. Servers should convert recognized schemas to the latest internal 
     * value, and may reject unrecognized values. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources
     */
    @XmlElement(name="apiVersion", required = false, type = String.class)
    private String apiVersion;

    /**
     * Standard list metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    @XmlElement(name="metadata", required = false, type = ListMeta.class)
    private ListMeta metadata;

    /**
     * List of events
     */
    @XmlElement(name="items", required = true, type = Event[].class)
    private Event[] items;

    public EventList() {
    }

    public EventList(Event[] items) {
        this.items = items;
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
     * object. Servers should convert recognized schemas to the latest internal 
     * value, and may reject unrecognized values. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an 
     * object. Servers should convert recognized schemas to the latest internal 
     * value, and may reject unrecognized values. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Standard list metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    public ListMeta getMetadata() {
        return metadata;
    }

    /**
     * Standard list metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * List of events
     */
    public Event[] getItems() {
        return items;
    }

    /**
     * List of events
     */
    public void setItems(Event[] items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.kind);
        hash = 97 * hash + Objects.hashCode(this.apiVersion);
        hash = 97 * hash + Objects.hashCode(this.metadata);
        hash = 97 * hash + Arrays.deepHashCode(this.items);
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
        final EventList other = (EventList) obj;
        if (!Objects.equals(this.kind, other.kind)) {
            return false;
        }
        if (!Objects.equals(this.apiVersion, other.apiVersion)) {
            return false;
        }
        if (!Objects.equals(this.metadata, other.metadata)) {
            return false;
        }
        if (!Arrays.deepEquals(this.items, other.items)) {
            return false;
        }
        return true;
    }
}
