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
 *
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "involvedObject")
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectReference implements Serializable {
    
    /**
     * Kind of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
     */
    @XmlElement(name="kind", required = false, type = String.class)
    private String kind;
    
    /**
     * Namespace of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/namespaces.md
     */
    @XmlElement(name="namespace", required = false, type = String.class)
    private String namespace;
    
    /**
     * Name of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#names
     */
    @XmlElement(name="name", required = false, type = String.class)
    private String name;
    
    /**
     * UID of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#uids
     */
    @XmlElement(name="uid", required = false, type = String.class)
    private String uid;
    
    /**
     * API version of the referent.
     */
    @XmlElement(name="apiVersion", required = false, type = String.class)
    private String apiVersion;
    
    /**
     * Specific resourceVersion to which this reference is made, if any. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#concurrency-control-and-consistency
     */
    @XmlElement(name="resourceVersion", required = false, type = String.class)
    private String resourceVersion;
    
    /**
     * If referring to a piece of an object instead of an entire object, 
     * this string should contain a valid JSON/Go field access statement, 
     * such as desiredState.manifest.containers[2]. 
     * For example, if the object reference is to a container within a pod, 
     * this would take on a value like: "spec.containers{name}" (where "name" 
     * refers to the name of the container that triggered the event) or 
     * if no container name is specified "spec.containers[2]" (container 
     * with index 2 in this pod). This syntax is chosen only to have some 
     * well-defined way of referencing a part of an object.
     */
    @XmlElement(name="fieldPath", required = false, type = String.class)
    private String fieldPath;

    public ObjectReference() {
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
     * Namespace of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/namespaces.md
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Namespace of the referent. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/namespaces.md
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
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
     * Specific resourceVersion to which this reference is made, if any. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#concurrency-control-and-consistency
     */
    public String getResourceVersion() {
        return resourceVersion;
    }

    /**
     * Specific resourceVersion to which this reference is made, if any. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#concurrency-control-and-consistency
     */
    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    /**
     * If referring to a piece of an object instead of an entire object, 
     * this string should contain a valid JSON/Go field access statement, 
     * such as desiredState.manifest.containers[2]. 
     * For example, if the object reference is to a container within a pod, 
     * this would take on a value like: "spec.containers{name}" (where "name" 
     * refers to the name of the container that triggered the event) or 
     * if no container name is specified "spec.containers[2]" (container 
     * with index 2 in this pod). This syntax is chosen only to have some 
     * well-defined way of referencing a part of an object.
     */
    public String getFieldPath() {
        return fieldPath;
    }

    /**
     * If referring to a piece of an object instead of an entire object, 
     * this string should contain a valid JSON/Go field access statement, 
     * such as desiredState.manifest.containers[2]. 
     * For example, if the object reference is to a container within a pod, 
     * this would take on a value like: "spec.containers{name}" (where "name" 
     * refers to the name of the container that triggered the event) or 
     * if no container name is specified "spec.containers[2]" (container 
     * with index 2 in this pod). This syntax is chosen only to have some 
     * well-defined way of referencing a part of an object.
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.kind);
        hash = 79 * hash + Objects.hashCode(this.namespace);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.uid);
        hash = 79 * hash + Objects.hashCode(this.apiVersion);
        hash = 79 * hash + Objects.hashCode(this.resourceVersion);
        hash = 79 * hash + Objects.hashCode(this.fieldPath);
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
        final ObjectReference other = (ObjectReference) obj;
        if (!Objects.equals(this.kind, other.kind)) {
            return false;
        }
        if (!Objects.equals(this.namespace, other.namespace)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.uid, other.uid)) {
            return false;
        }
        if (!Objects.equals(this.apiVersion, other.apiVersion)) {
            return false;
        }
        if (!Objects.equals(this.resourceVersion, other.resourceVersion)) {
            return false;
        }
        if (!Objects.equals(this.fieldPath, other.fieldPath)) {
            return false;
        }
        return true;
    }
    
    
    
    
    

}
