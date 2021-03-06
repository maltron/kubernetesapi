package net.nortlam.kubernetes.api.v1;

import java.io.Serializable;
import java.time.Instant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.nortlam.kubernetes.api.util.InstantDataAdapter;

/**
 * ContainerStateRunning is a running state of a container.
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "containerstaterunning")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContainerStateRunning implements Serializable {

    /**
     * Time at which the container was last (re-)started
     */
    @XmlElement(name="startedAt", required = false)
    @XmlJavaTypeAdapter(InstantDataAdapter.class)
    private Instant kind;
}
