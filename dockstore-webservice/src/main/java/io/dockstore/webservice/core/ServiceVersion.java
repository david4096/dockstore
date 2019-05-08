package io.dockstore.webservice.core;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("ServiceVersion")
public class ServiceVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Implementation specific ID for the service version in this web service", position = 0)
    private long id;

    @ApiModelProperty(value = "The subclass of this service")
    private Service.SubClass subClass;


    @ApiModelProperty(value = "The .dockstore.yml, test parameter file(s), and readme for this service.")
    private Set<SourceFile> sourceFiles;

    @ApiModelProperty(value = "The service version's Git commit id")
    private String commitId;

    public long getId() {
        return id;
    }

    public Service.SubClass getSubClass() {
        return subClass;
    }

    public Set<SourceFile> getSourceFiles() {
        return sourceFiles;
    }

    public String getCommitId() {
        return commitId;
    }
}
