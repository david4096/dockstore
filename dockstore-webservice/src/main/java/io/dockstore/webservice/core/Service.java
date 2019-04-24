package io.dockstore.webservice.core;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

public class Service {

    public enum SubClass { DOCKER_COMPOSE, SWARM, KUBERNETES, HELM }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Implementation specific ID for the service in this web service", position = 0)
    private long id;

    private SubClass subClass;

    private List<ServiceVersion> versions;



}
