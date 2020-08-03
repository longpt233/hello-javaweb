package jsp.bean;

public class HelloBean {
	 
	 private String name;
	 
	 // Bắt buộc phải có cấu tử không tham số.
	 public HelloBean() {
		 System.out.println("khoi tao ");
	 }
	 
	 public String getName() {
	     return name;
	 }
	 
	 public void setName(String name) {
		 System.out.println("goi tooi set namme ");
	     this.name = name;
	 }
	 
	 public String getHello() {
	     if (name == null) {
	         return "Hello every body";
	     }
	     return "Hello " + name;
	 }
	 
	}