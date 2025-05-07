

import java.util.*;

// Abstract class for Job Roles
abstract class JobRole {
    String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public abstract String getRole();
    public String getCandidateName() {
        return candidateName;
    }
}

// Specific Job Roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRole() {
        return "Product Manager";
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void printResumeDetails() {
        System.out.println("Candidate: " + jobRole.getCandidateName() + " | Role Applied: " + jobRole.getRole());
    }
}

// Screening utility with generic method and wildcard
class ResumeScreeningSystem {
    public static <T extends JobRole> Resume<T> processResume(T role) {
        System.out.println("Processing resume for: " + role.getCandidateName() + " (" + role.getRole() + ")");
        return new Resume<>(role);
    }

    public static void screenAll(List<? extends JobRole> roles) {
        System.out.println("\n--- Screening Pipeline ---");
        for (JobRole role : roles) {
            System.out.println("Screening: " + role.getCandidateName() + " for role: " + role.getRole());
        }
    }
}

// Main execution
public class ResumeScreeningMain {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = ResumeScreeningSystem.processResume(new SoftwareEngineer("Alice"));
        seResume.printResumeDetails();

        Resume<DataScientist> dsResume = ResumeScreeningSystem.processResume(new DataScientist("Bob"));
        dsResume.printResumeDetails();

        Resume<ProductManager> pmResume = ResumeScreeningSystem.processResume(new ProductManager("Charlie"));
        pmResume.printResumeDetails();

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(seResume.getJobRole());
        allResumes.add(dsResume.getJobRole());
        allResumes.add(pmResume.getJobRole());

        ResumeScreeningSystem.screenAll(allResumes);
    }
}
