<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Example JSP Page</title>
<head>
  <link rel="stylesheet" type="text/css" href="main.css">
</head>

</head>
<body>
  <h1>REQUIRED INFROMATION </h1>
            <form method="post" action="run" enctype="multipart/form-data">
              Name: <input type="text" name="name" id="name"><br>
              Image: <input type="file" name="image" id="image"><br>
              <input type="button" value="Submit" onclick="submitForm()">
              <div id="loading-icon"></div>
          </form>

    <script>
        function submitForm() {
            document.getElementById("loading-icon").style.display = "block";
                var name = document.getElementById("name").value;
                var image = document.getElementById("image").files[0];
                var formData = new FormData();
                if(name){
                    formData.append("name", name);
                }
                formData.append("image", image);
                var xhr = new XMLHttpRequest();
                xhr.open("POST", "run", true);
                xhr.send(formData);
                xhr.onload = function() {
                    if (xhr.status === 200) {
                        
                        window.location.href = "/run";
                       
                    } else {
                        alert("Error occurred while sending the data")
                    }
                }
            }

    </script>
</body>
</html>