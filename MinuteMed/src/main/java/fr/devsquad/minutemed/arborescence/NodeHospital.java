package fr.devsquad.minutemed.arborescence;

import fr.devsquad.minutemed.staff.IHospitalStaff;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class NodeHospital implements Serializable, INode {
    
    @Id @GeneratedValue
    @Column(name = "idHospital")
    private long id;
    private String type;
    private String name;
    
    @ManyToOne
    private NodeAPHP aphp;
    @OneToMany(mappedBy = "hospital")
    private List<NodePole> poles;
    
    public NodeHospital() { }
    
    /**
     * Constructor if there don't have poles in this hospital
     * 
     * @param type Type of the node
     * @param name Name of the hospital
     * @param aphp Parent node
     */
    public NodeHospital(NodeEnum type, String name, NodeAPHP aphp) {
        this.type = type.HOSPITAL.name();
        this.name = name;
        this.aphp = aphp;
        this.poles = null;
    }
    
    /**
     * Constructor to attach poles
     * 
     * @param type Type of the node
     * @param name Name of the hospital
     * @param aphp Parent node
     * @param poles List of poles attached to this node
     */
    public NodeHospital(NodeEnum type, String name, NodeAPHP aphp, List<NodePole> poles) {
        this.type = type.HOSPITAL.name();
        this.name = name;
        this.aphp = aphp;
        this.poles = poles;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public NodeAPHP getAPHP() {
        return aphp;
    }
    
    public List<NodePole> getPoles() {
        return poles;
    }
}