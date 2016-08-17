package com.xenoterracide;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.domain.Persistable;

@NodeEntity
public class MyEntity implements Persistable<Long> {
    @GraphId
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return id != null;
    }

    /* uncomment and use hot reload
    public void setId( final Long id ) {
        this.id = id;
    }
    */
}
