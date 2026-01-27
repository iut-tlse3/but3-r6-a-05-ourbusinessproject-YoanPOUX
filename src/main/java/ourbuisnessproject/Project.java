package ourbuisnessproject;

import jakarta.validation.constraints.NotBlank;

public class Project {
    @NotBlank
    private String title;
    private String description;

    public Project() {
        this.title = "defaut title";
        this.description = "default description";
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
