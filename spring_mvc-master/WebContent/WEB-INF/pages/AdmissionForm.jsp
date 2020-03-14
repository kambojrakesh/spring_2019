<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:errors path="student.username" />
<Form action="../student/AdmissionForm.html" method="POST">
	
	Username::</br><input type="text" name="username"/></br>
	Lastname::</br><input type="text" name="lastname"/></br>
	Age::</br><input type="text" name="age"/></br>
	
	Mobile No::</br><input type="text" name="mobileno"/></br>
	
	City::</br><input type="text" name="address.city"/></br>
	

	State::</br><input type="text" name="address.state"/></br>

	Courses: </br><select name="courses" multiple>
		<option value="Java">Java</option>
		<option value="DotNet">DotNet</option>
		<option value="PHP">PHP</option>
	</select></br>
	
	<input type="submit" value="submit"/>
	
</Form>