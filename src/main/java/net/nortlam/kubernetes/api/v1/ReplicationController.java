package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ReplicationController represents the configuration of a replication controller.
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "replicationcontroller")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReplicationController implements Serializable {

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
     * If the Labels of a ReplicationController are empty, they are defaulted 
     * to be the same as the Pod(s) that the replication controller manages. 
     * Standard object’s metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#metadata
     */
    @XmlElement(name="metadata", required = false, type = ObjectMeta.class)
    private ObjectMeta metadata;

    /**
     * Spec defines the specification of the desired behavior of the 
     * replication controller. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#spec-and-status
     */
    @XmlElement(name="spec", required = false, type = ReplicationControllerSpec.class)
    private ReplicationControllerSpec spec;

    /**
     * Status is the most recently observed status of the replication 
     * controller. This data may be out of date by some window of time. 
     * Populated by the system. Read-only. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#spec-and-status
     */
    @XmlElement(name="status", required = false, type = ReplicationControllerStatus.class)
    private ReplicationControllerStatus status;
}
