
<!DOCTYPE html>
<html lang="en">
<head>
 <title>WebDoctor</title>
 <link rel="stylesheet" href="CSS/style.css">
</head>
<form action="welcome" >
  <div class="imgcontainer">
    <img src="https://www.siliconrepublic.com/wp-content/uploads/2015/12/Webdoctor-718x523.jpg" alt="Avatar" class="avatar">
  </div>
<Center><h1> WEB DOCTOR </h1></Center>
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</html>


