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
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * OwnerReference contains enough information to let you identify an owning 
 * object. Currently, an owning object must be in the same namespace, 
 * so there is no namespace field.
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "ownerReference")
@XmlAccessorType(XmlAccessType.FIELD)
public class OwnerReference implements Serializable {

    /**
     * API version of the referent.
     */
    @XmlElement(name="apiVersion", required = true, type = String.class)
    private String apiVersion;

    /**
     * Kind of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    @XmlElement(name="kind", required = true, type = String.class)
    private String kind;

    /**
     * Name of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#names
     */
    @XmlElement(name="name", required = true, type = String.class)
    private String name;

    /**
     * UID of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#uids
     */
    @XmlElement(name="uid", required = true, type = String.class)
    private String uid;

    /**
     * if true, this reference points to the managing controller.
     */
    @XmlElement(name="controller", required = false, type = boolean.class, defaultValue = "false")
    private boolean controller;

    public OwnerReference() {
    }

    public OwnerReference(String apiVersion, String kind, String name, String uid) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
        this.uid = uid;
    }

    /**
     * API version of the referent.
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * API version of the referent.
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Kind of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    public String getKind() {
        return kind;
    }

    /**
     * Kind of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Name of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#names
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#names
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * UID of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#uids
     */
    public String getUid() {
        return uid;
    }

    /**
     * UID of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#uids
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * if true, this reference points to the managing controller.
     */
    public boolean isController() {
        return controller;
    }

    /**
     * if true, this reference points to the managing controller.
     */
    public void setController(boolean controller) {
        this.controller = controller;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.apiVersion);
        hash = 73 * hash + Objects.hashCode(this.kind);
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.uid);
        hash = 73 * hash + (this.controller ? 1 : 0);
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
        final OwnerReference other = (OwnerReference) obj;
        if (this.controller != other.controller) {
            return false;
        }
        if (!Objects.equals(this.apiVersion, other.apiVersion)) {
            return false;
        }
        if (!Objects.equals(this.kind, other.kind)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.uid, other.uid)) {
            return false;
        }
        return true;
    }
    
    
    

}
