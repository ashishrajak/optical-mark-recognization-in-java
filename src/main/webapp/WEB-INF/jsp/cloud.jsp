<!DOCTYPE html>
<html>
<head>
  <title>My JSP Page</title>
  <style>
    /* Style the clouds */
.cloud {
  width: fit-content;
  height: 120px;
  text-align: center;
  font-size: larger;
  background-color: rgb(20, 170, 170); /* white color for the clouds */
  border-radius: 200px;
  position: relative;
  margin: auto; /* centers the cloud on the page */
  animation: move-clouds 20s linear infinite;
}

/* Add hover properties to the clouds */
.cloud:hover {
  font-size: large;
  background-color: #09de82; /* changes the background color on hover */
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3); /* adds a subtle shadow on hover */
}

/* Add animation for the clouds */
@keyframes move-clouds {
  0% {
      transform: translateX(-1000px);
  }
  100% {
      transform: translateX(1000px);
  }
}

  </style>
</head>
<body>
    <div class="clouds">
        <div class="cloud">${imageans}</div>
        <div class="cloud">${username} <p> Thanks you  above is your result </p></div>
        <div class="cloud">thank you for using our ervice tell about aur service to everyone u could</div>
      </div>
    
</body>
</html>