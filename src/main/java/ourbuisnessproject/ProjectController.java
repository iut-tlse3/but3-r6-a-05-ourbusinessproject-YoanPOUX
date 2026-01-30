package ourbuisnessproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    EnterpriseProjectService enterpriseProjectService;

    /**
     * Create a new project controller
     * @param enterpriseProjectService the service use to manage the prjects
     */
    public ProjectController(EnterpriseProjectService enterpriseProjectService) {
        this.enterpriseProjectService = enterpriseProjectService;
    }

    /**
     *
     * @return the list of all project with their enterprises
     */
    @RequestMapping(value = "/api/projects", method = RequestMethod.GET)
    public List<Project> findAllProjectsWithEnterprises() {
        return this.enterpriseProjectService.findAllProjects();
    }

}
