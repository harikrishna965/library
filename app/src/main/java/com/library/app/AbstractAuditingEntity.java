package com.library.app;

import java.time.Instant;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractAuditingEntity extends BaseEntity {

    @CreatedBy
    @Column(name = "created_by", length = 100, updatable = false)
    private String createdBy;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private Instant createdDate = DateUtils.getLocalTime();

    @LastModifiedBy
    @Column(name = "last_modified_by", length = 100)
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    private Instant lastModifiedDate = DateUtils.getLocalTime();

}
