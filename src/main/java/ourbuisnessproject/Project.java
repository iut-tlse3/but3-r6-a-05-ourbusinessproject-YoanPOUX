package ourbuisnessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;
    private String description;
    @NotNull @ManyToOne
    private Enterprise enterprise;

    public Project() {
        this.title = "defaut title";
        this.description = "default description";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Set the title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Return the title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Return the description
     * @return desciption
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the enterprise attached to the project
     * @param enterprise the enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     *
     * @return the enterprise of the project
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }
}
