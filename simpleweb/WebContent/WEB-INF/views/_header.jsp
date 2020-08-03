<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  
  
  
<div style="background: #E0E0E0; height: 55px; padding: 5px;">
  <div style="float: left">
     <h4>My Site  (quy định trong phần header ở phần view)</h4>
  </div>
 
  <div style="float: right; padding: 10px; text-align: right;">
 
     <!-- User store in session with attribute: loginedUser -->
     Hello <b>${loginedUser.userName}   </b>
     <h6>(đây là tên người dung lấy trong userName nếu đã đăng nhập)</h6>
   
   
   <br/>
     Search  ở đây <input name="search">
 
  </div>
 
</div>