package com.hae.domain

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass //�ش� Ŭ������ ��ƼƼ�� �ƴ��� ��Ÿ���� ������̼�
@EntityListeners(AuditingEntityListener::class) //EntityListeners : ��ƼƼ�� ���� �̺�Ʈ�� �����ϱ� ���� ������ Ŭ���� ���,
// AuditingEntityListener : @CreateDate, @LastModifiedDAte ������̼��� ���� �ʵ忡 ���� ��ƼƼ�� ����Ǳ� �� �ڵ����� ���� ����
abstract class BaseEntity (
        @CreatedDate
        var createdAt: LocalDateTime? = null,

        @LastModifiedDate
        var modifiedAt: LocalDateTime? = null,
)