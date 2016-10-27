package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ReplicationControllerStatus represents the current status of a 
 * replication controller.
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "ReplicationControllerStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReplicationControllerStatus implements Serializable {

    /**
     * Replicas is the most recently oberved number of replicas. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/replication-controller.md#what-is-a-replication-controller
     */
    @XmlElement(name="replicas", required = true, type = int.class)
    private int replicas;

    /**
     * The number of pods that have labels matching the labels of the pod 
     * template of the replication controller.
     */
    @XmlElement(name="fullyLabeledReplicas", required = false, type = int.class)
    private int fullyLabeledReplicas;

    /**
     * The number of ready replicas for this replication controller.
     */
    @XmlElement(name="readyReplicas", required = false, type = int.class)
    private int readyReplicas;

    /**
     * ObservedGeneration reflects the generation of the most recently 
     * observed replication controller.
     */
    @XmlElement(name="observedGeneration", required = false, type = long.class)
    private long observedGeneration;
}
