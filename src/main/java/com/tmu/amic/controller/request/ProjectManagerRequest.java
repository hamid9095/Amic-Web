package com.tmu.amic.controller.request;

import java.util.Objects;

public class ProjectManagerRequest {

    private Long id;

    private int projectId;

    private int userAccountId;

    public ProjectManagerRequest() {
    }

    public ProjectManagerRequest(Long id, int projectId, int userAccountId) {
        this.id = id;
        this.projectId = projectId;
        this.userAccountId = userAccountId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectManagerRequest)) return false;
        ProjectManagerRequest that = (ProjectManagerRequest) o;
        return getProjectId() == that.getProjectId() &&
                getUserAccountId() == that.getUserAccountId() &&
                getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProjectId(), getUserAccountId());
    }

    @Override
    public String toString() {
        return "ProjectManagerRequest{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userAccountId=" + userAccountId +
                '}';
    }
}
