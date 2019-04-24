package io.dockstore.webservice.core;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

public class ServiceVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Implementation specific ID for the service version in this web service", position = 0)
    private long id;

    @ApiModelProperty(value = "The subclass of this service")
    private Service.SubClass subClass;


    @ApiModelProperty(value = "The .dockstore.yml, test parameter file(s), and readme for this service.")
    private Set<SourceFile> sourceFiles;

}
