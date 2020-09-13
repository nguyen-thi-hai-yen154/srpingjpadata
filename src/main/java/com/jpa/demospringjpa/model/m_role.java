package com.jpa.demospringjpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "m_role")
public class m_role {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "role_id")
		private Long roleId;

		@Column(name = "role_code")
		private String roleCode;

		@Column(name = "role_name")
		private String roleName;

		@Column(name = "modified_by")
		private String modifiedBy;

		@Column(name = "modified_date")
		@Temporal(TemporalType.TIMESTAMP)
		private Date modifiedDate;

		@Column(name = "created_by")
		private String createdBy;

		@Column(name = "created_date")
		@Temporal(TemporalType.TIMESTAMP)
		private Date createdDate;

		
		
		public m_role() {
			super();
			// TODO Auto-generated constructor stub
		}

		public m_role(Long roleId, String roleCode, String roleName, String modifiedBy, Date modifiedDate,
				String createdBy, Date createdDate) {
			super();
			this.roleId = roleId;
			this.roleCode = roleCode;
			this.roleName = roleName;
			this.modifiedBy = modifiedBy;
			this.modifiedDate = modifiedDate;
			this.createdBy = createdBy;
			this.createdDate = createdDate;
		}

		public Long getRoleId() {
			return roleId;
		}

		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}

		public String getRoleCode() {
			return roleCode;
		}

		public void setRoleCode(String roleCode) {
			this.roleCode = roleCode;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getModifiedBy() {
			return modifiedBy;
		}

		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}

		public Date getModifiedDate() {
			return modifiedDate;
		}

		public void setModifiedDate(Date modifiedDate) {
			this.modifiedDate = modifiedDate;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
	
	
}
