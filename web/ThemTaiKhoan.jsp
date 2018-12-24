<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Them tai khoan</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Them thông tin thành viên</h2>
  <form class="form-horizontal" action="ThemTK" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Ma:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="Ma" placeholder="Nhập vào Ma" >
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">TenFile:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="TenFile" placeholder="Nhập vào TenFile">
      </div>
    </div>
  <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Size:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="Size" placeholder="Nhập vào Size" >
      </div>
    </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="email">Location:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="Location" placeholder="Nhập vào Location" >
      </div>
   </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Nam:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="Nam" placeholder="Nhập vào Nam" >
      </div>
    </div>
  
      <div class="form-group">
      <label class="control-label col-sm-2" for="email">ID:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="ID" placeholder="Nhập vào ID" >
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="email">PASS:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="PASS" placeholder="Nhập vào PASS" >
      </div>
    </div>
     
      <div class="form-group">
      <label class="control-label col-sm-2" for="email">Link:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="Link" placeholder="Nhập vào Link" >
      </div>
    </div>
       <div class="form-group">
      <label class="control-label col-sm-2" for="email">Mota:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="Mota" placeholder="Nhập vào Mota" >
      </div>
    </div>
      
     
     
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Thêm</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>