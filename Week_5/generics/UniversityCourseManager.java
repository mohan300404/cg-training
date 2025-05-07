package generics;

import java.util.ArrayList;
import java.util.List;

// Abstract base class for all types of courses
abstract class CourseType {
    private String title;

    public CourseType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getEvaluationMethod();

    @Override
    public String toString() {
        return title + " (" + getEvaluationMethod() + ")";
    }
}

// Concrete course types
class ExamCourse extends CourseType {
    public ExamCourse(String title) {
        super(title);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) {
        super(title);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) {
        super(title);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based";
    }
}

// Generic Course class
class Course<T extends CourseType> {
    private T courseType;
    private String department;

    public Course(String department, T courseType) {
        this.department = department;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return department + " Department - " + courseType.toString();
    }
}

// Utility class
class CourseUtils {
    public static void displayCourses(List<? extends Course<? extends CourseType>> courses) {
        for (Course<?> course : courses) {
            System.out.println(course);
        }
    }
}

// Main class
public class UniversityCourseManager {
    public static void main(String[] args) {
        List<Course<? extends CourseType>> courseCatalog = new ArrayList<>();

        courseCatalog.add(new Course<>("Computer Science", new ExamCourse("Data Structures")));
        courseCatalog.add(new Course<>("Mathematics", new AssignmentCourse("Linear Algebra")));
        courseCatalog.add(new Course<>("Physics", new ResearchCourse("Quantum Mechanics")));

        System.out.println("=== University Course Catalog ===");
        CourseUtils.displayCourses(courseCatalog);
    }
}
