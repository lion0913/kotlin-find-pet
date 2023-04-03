package com.hae.domain

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass //해당 클래스가 엔티티가 아님을 나타내는 어노테이션
@EntityListeners(AuditingEntityListener::class) //EntityListeners : 엔티티에 대한 이벤트를 수신하기 위한 리스너 클래스 등록,
// AuditingEntityListener : @CreateDate, @LastModifiedDAte 어노테이션이 붙은 필드에 대해 엔티티가 저장되기 전 자동으로 값을 설정
abstract class BaseEntity (
        @CreatedDate
        var createdAt: LocalDateTime? = null,

        @LastModifiedDate
        var modifiedAt: LocalDateTime? = null,
)