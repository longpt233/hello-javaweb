<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  
  
  
<div style="background: #E0E0E0; height: 100px; padding: 5px;">
  <div style="float: left;margin:auto;">
     <h4 style="border:1px solid red">My Site </h4>
  </div>
 
  <div style="float: right; padding: 10px; text-align: right;">
 
     <!-- User store in session with attribute: loginedUser -->
     Hello <b>   ${loginedUser.userName}   </b>
   
  <br/>
     Search <input name="search">
 
  </div>
 
</div>