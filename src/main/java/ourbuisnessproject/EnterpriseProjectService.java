package ourbuisnessproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseProjectService {
    @PersistenceContext
    private EntityManager entityManager;

    public EnterpriseProjectService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public Project newProject(String title, String description) {
        Project project = new Project();
        project.setTitle(title);
        project.setDescription(description);
        this.entityManager.persist(project);
        this.entityManager.flush();
        return project;
    }

    public Enterprise newEnterprise(String name, String description, String contactName, String email) {
        Enterprise enterprise = new Enterprise();
        enterprise.setName(name);
        enterprise.setDescription(description);
        enterprise.setContactName(contactName);
        enterprise.setContactEmail(email);
        this.entityManager.persist(enterprise);
        this.entityManager.flush();
        return enterprise;
    }

    public Project findProjectById(Long id) {
        return entityManager.find(Project.class, id);
    }

    public Enterprise findEnterpriseById(Long id) {
        return entityManager.find(Enterprise.class, id);
    }
}
