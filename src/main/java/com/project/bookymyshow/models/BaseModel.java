package com.project.bookymyshow.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.MapKeyCompositeType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Getter
@MappedSuperclass  //parent entity class
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@CreatedDate
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@LastModifiedDate
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date updatedAt;

}
