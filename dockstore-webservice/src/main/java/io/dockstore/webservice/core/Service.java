package io.dockstore.webservice.core;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Service")

public class Service {

    public enum SubClass { DOCKER_COMPOSE, SWARM, KUBERNETES, HELM }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Implementation specific ID for the service in this web service", position = 0)
    private long id;

    @ApiModelProperty(value = "The type of service")
    private SubClass subClass;

    private List<ServiceVersion> versions;

    @ApiModelProperty(value = "The git URL of this service")
    private String gitUrl;

    public long getId() {
        return id;
    }

    public SubClass getSubClass() {
        return subClass;
    }

    public List<ServiceVersion> getVersions() {
        return versions;
    }

    public String getGitUrl() {
        return gitUrl;
    }
}
