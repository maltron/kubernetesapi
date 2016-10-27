package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * PodList is a list of Pods.
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "podlist")
@XmlAccessorType(XmlAccessType.FIELD)
public class PodList implements Serializable {
    
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
     * object. Servers should convert recognized schemas to the latest 
     * internal value, and may reject unrecognized values. 
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
     * List of pods. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/pods.md
     */
    @XmlElement(name="items", required = false, type = Pod[].class)
    private Pod items;
}
