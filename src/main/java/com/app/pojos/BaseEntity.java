package com.app.pojos;

import javax.persistence.*;

@MappedSuperclass
//no table will be associated with this class. 
//Usage is collecting common fields n annotations (extended by actual entities)
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
//	@Version
//	private int version;

	public Integer getId() {
		return id;
	}
//   public BaseEntity(){
//	   
//   }
//	public BaseEntity(Integer id) {
//		super();
//		this.id = id;
//	}

	public void setId(Integer id) {
		this.id = id;
	}
//	public int getVersion() {
//		return version;
//	}
//	public void setVersion(int version) {
//		this.version = version;
//	}

	
	
}
