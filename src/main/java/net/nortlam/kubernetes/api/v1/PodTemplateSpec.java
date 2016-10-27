package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * PodTemplateSpec describes the data a pod should have when created 
 * from a template
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "podtemplatespec")
@XmlAccessorType(XmlAccessType.FIELD)
public class PodTemplateSpec implements Serializable {

    /**
     * Standard object’s metadata. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#metadata
     */
    @XmlElement(name="metadata", required = false, type = ObjectMeta.class)
    private ObjectMeta metadata;

    /**
     * Specification of the desired behavior of the pod. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#spec-and-status
     */
    @XmlElement(name="spec", required = false, type = PodSpec.class)
    private PodSpec spec;
}
