/*
 * package com.userregistration.model.dto;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.Table;
 * 
 * import io.swagger.annotations.ApiModel; import
 * io.swagger.annotations.ApiModelProperty;
 * 
 * @Entity
 * 
 * @Table(name="USER")
 * 
 * @ApiModel public class UserDetailsDTO {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private Long Id;
 * 
 * @Column(name="SALUTATION")
 * 
 * @ApiModelProperty(notes = "") private String salutaion;
 * 
 * @Column(name="FIRST_NAME")
 * 
 * @ApiModelProperty(notes = "") private String firstName;
 * 
 * @Column(name="MIDDLE_NAME")
 * 
 * @ApiModelProperty(notes = "") private String middleName;
 * 
 * @Column(name="LAST_NAME")
 * 
 * @ApiModelProperty(notes = "") private String lastName;
 * 
 * @Column(name="EMAIL")
 * 
 * @ApiModelProperty(notes = "") private String emailId;
 * 
 * @Column(name="MOB_NO")
 * 
 * @ApiModelProperty(notes = "") private Long mobNo;
 * 
 * 
 * public String getFirstName() { return firstName; }
 * 
 * public void setFirstName(String firstName) { this.firstName = firstName; }
 * 
 * public String getMiddleName() { return middleName; }
 * 
 * public void setMiddleName(String middleName) { this.middleName = middleName;
 * }
 * 
 * public String getLastName() { return lastName; }
 * 
 * public void setLastName(String lastName) { this.lastName = lastName; }
 * 
 * public String getEmailId() { return emailId; }
 * 
 * public void setEmailId(String emailId) { this.emailId = emailId; }
 * 
 * public String getSalutaion() { return salutaion; }
 * 
 * public void setSalutaion(String salutaion) { this.salutaion = salutaion; }
 * 
 * public Long getMobNo() { return mobNo; }
 * 
 * public void setMobNo(Long mobNo) { this.mobNo = mobNo; }
 * 
 * 
 * public UserDetailsDTO(String salutaion, String firstName, String middleName,
 * String lastName, String emailId, Long mobNo) { this.salutaion = salutaion;
 * this.firstName = firstName; this.middleName = middleName; this.lastName =
 * lastName; this.emailId = emailId;
 * 
 * this.mobNo = mobNo; }
 * 
 * public UserDetailsDTO() {
 * 
 * } }
 */