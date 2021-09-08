package com.register.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity  //此注解表示它是JPA实体
public class UserBean {

  //下面两个注解表示：对应表中的id字段，这个字段是会自动生成的
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String email;
  private Integer phone;
  private String pwd;


}

  /***
   *
   public Integer getId(Integer id){
   return this.id;
   }

   public void setId(Integer id){
   this.id=id;
   }
   public String getName(String name){
   return this.name;
   }

   public void setName(String name){
   this.name=name;
   }

   public String getEmail(String email){
   return this.email;
   }

   public void setEmail(String email){
   this.email=email;
   }

   public Integer getPhone(Integer phone){
   return this.phone;
   }

   public void setPhone(Integer phone){
   this.phone=phone;
   }

   public String getPwd(String pwd){
   return this.pwd;
   }

   public void setPwd(String pwd){
   this.pwd=pwd;
   */


