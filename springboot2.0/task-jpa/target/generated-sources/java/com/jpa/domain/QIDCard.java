package com.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIDCard is a Querydsl query type for IDCard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIDCard extends EntityPathBase<IDCard> {

    private static final long serialVersionUID = -716947659L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIDCard iDCard = new QIDCard("iDCard");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath idNo = createString("idNo");

    public final QPerson person;

    public QIDCard(String variable) {
        this(IDCard.class, forVariable(variable), INITS);
    }

    public QIDCard(Path<? extends IDCard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIDCard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIDCard(PathMetadata metadata, PathInits inits) {
        this(IDCard.class, metadata, inits);
    }

    public QIDCard(Class<? extends IDCard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.person = inits.isInitialized("person") ? new QPerson(forProperty("person"), inits.get("person")) : null;
    }

}

