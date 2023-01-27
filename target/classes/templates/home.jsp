<!DOCTYPE html>
<html>
<head>
  <title>Input Form</title>
  <style>
    /* Add a background image to the entire page */
    body {
      background-image: url('C:\Users\HP\OneDrive\Desktop\Optical marks detector project\compute-ea4c57a4.png-ea4c57a4.png');
      background-size: cover;
    }
    /* Add some styling to the form elements */
    form {
      padding: 20px;
      padding-top: 50px;
      background-color: rgba(255, 255, 255, 0.8);
      margin: 0 auto;
      width: 50%;
      text-align: center;
      box-shadow: 0px 0px 20px 0px rgba(0,0,0,0.75);
    }
    /* Style the labels */
    label {
      font-weight: bold;
      display: block;
      margin-bottom: 10px;
      font-size: 1.2em;
    }
    /* Style the inputs */
    input[type="text"], input[type="file"] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      box-sizing: border-box;
      background-color: #f2f2f2;
      border: 2px solid #ccc;
      border-radius: 4px;
    }
    /* Style the submit button */
    input[type="submit"] {
      width: 100%;
      background-color: #4CAF50;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    /* Add hover effect to the submit button */
    input[type="submit"]:hover {
      background-color: #45a049;
      transition: background-color 0.3s ease;
    }
     /* Style the error messages */
    .error {
      color: red;
      font-size: 12px;
      margin-top: 5px;
      display: none;
      background-color: rgba(255, 0, 0, 0.1);
      padding: 5px;
      border-radius: 4px;
    }
  </style>
</head>
<body>
  <form>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <div class="error" id="name-error"></div>
    <label for="image">Upload Image:</label>
    <input type="file" id="image" name="image"><br><br>
    <div class="error" id="image-error"></div>
    <input type="submit" value="Submit">
  </form>
  <script>
    // Get the form element
    var form = document.querySelector("form");
    
    // Add a submit event listener to the form
    form.addEventListener("submit", function(event) {
      event.preventDefault();
      
      // Get the name input value
      var name = document.querySelector("#name").value;
      
      // Get the image file
      var image = document.querySelector("#image").files[0];
      
      // Check if the name input is empty
      if (!name) {
        // Show the name error message
        var nameError = document.querySelector("#name-error");
        nameError.innerHTML = "Please enter a name";
        nameError.style.display = "block";
      } else {
        // Hide the name error message
        var nameError = document.querySelector("#name-error");
        nameError.style.display = "none";
      }
      
      // Check if the image file is not selected
      if (!image) {
        // Show the image error message
        var imageError = document.querySelector("#image-error");
        imageError.innerHTML = "Please select an image";
        imageError.style.display = "block";
      } else {
        // Hide the image error message
        var imageError = document.querySelector("#image-error");
        imageError.style.display = "none";
      }
      
      // Do something with the input values, such as send them to a server
      console.log("Name: " + name);
      console.log("Image: " + image.name);
    });
  </script>
</body>
</html>

