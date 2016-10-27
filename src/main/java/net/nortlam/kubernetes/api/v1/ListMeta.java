package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ListMeta describes metadata that synthetic resources must have, including 
 * lists and various status objects. A resource may have only one 
 * of {ObjectMeta, ListMeta}.
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "listmeta")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListMeta implements Serializable {

    /**
     * SelfLink is a URL representing this object. 
     * Populated by the system. Read-only.
     */
    @XmlElement(name="selfLink", required = false, type = String.class)
    private String selfLink;

    /**
     * String that identifies the server’s internal version of this object 
     * that can be used by clients to determine when objects have changed. 
     * Value must be treated as opaque by clients and passed unmodified back 
     * to the server. Populated by the system. Read-only. 
     * 
     * More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#concurrency-control-and-consistency
     */
    @XmlElement(name="resourceVersion", required = false, type = String.class)
    private String resourceVersion;
}
