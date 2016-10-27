package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ReplicationControllerSpec is the specification of a replication controller.
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "replicationcontrollerspec")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReplicationControllerSpec implements Serializable {

    /**
     * Replicas is the number of desired replicas. 
     * This is a pointer to distinguish between explicit zero and unspecified. 
     * Defaults to 1. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/replication-controller.md#what-is-a-replication-controller
     */
    @XmlElement(name="replicas", required = false, type = int.class)
    private int replicas;

    /**
     * Selector is a label query over pods that should match the Replicas count. 
     * If Selector is empty, it is defaulted to the labels present on the 
     * Pod template. Label keys and values that must match in order to be 
     * controlled by this replication controller, if empty defaulted to 
     * labels on Pod template. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/labels.md#label-selectors
     */
    @XmlElement(name="selector", required = false, type = Object.class)
    private Object selector;

    /**
     * Template is the object that describes the pod that will be created if 
     * insufficient replicas are detected. This takes precedence over a 
     * TemplateRef. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/replication-controller.md#pod-template
     */
    @XmlElement(name="template", required = false, type = PodTemplateSpec.class)
    private PodTemplateSpec template;
}
