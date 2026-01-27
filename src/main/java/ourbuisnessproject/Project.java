package ourbuisnessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;
    private String description;

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
}
