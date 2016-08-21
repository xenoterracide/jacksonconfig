package com.xenoterracide;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.domain.Persistable;

@NodeEntity
public class MyEntity implements Persistable<Long> {
    @GraphId
    private Long id;

    private String name;

    @Override
    public Long getId() {
        return id;
    }

    public void setId( final Long id ) {
        this.id = id;
    }

    @Override
    public boolean isNew() {
        return id != null;
    }

    public String getName() {
        return name;
    }

    public void setName( final String name ) {
        this.name = name;
    }
}
