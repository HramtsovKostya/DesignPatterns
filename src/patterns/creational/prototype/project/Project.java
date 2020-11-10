package patterns.creational.prototype.project;

import patterns.creational.prototype.Copyable;

public class Project implements Copyable {
    private int projectId;
    private String projectName;
    private String sourceCode;

    public Project(int projectId, String projectName, String sourceCode) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getProjectId() { return projectId; }
    public String getProjectName() { return projectName; }
    public String getSourceCode() { return sourceCode; }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        return new Project(projectId, projectName, sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}