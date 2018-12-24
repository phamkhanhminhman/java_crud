<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Sửa thông tin thành viên</h2>
  <form class="form-horizontal" action="SuaTK" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Ma:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="MaSV" placeholder="Nhập vào MaSV" value="<%
        	ServletContext context = getServletContext();
       	 out.print(context.getAttribute("Ma"));
        %>">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">TenFile:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="TenFil" placeholder="Nhập vào TenFile" value="<%
        	ServletContext context2 = getServletContext();
       	 out.print(context2.getAttribute("TenFile"));
        %>">
      </div>
    </div>
  <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Size:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="Size" placeholder="Nhập vào Size" value="<%
        	ServletContext context3 = getServletContext();
       	 out.print(context3.getAttribute("Size"));
        %>">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Location:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="Location" placeholder="Nhập vào Location" value="<%
        	ServletContext context4 = getServletContext();
       	 out.print(context3.getAttribute("Location"));
        %>">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Nam:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="Nam" placeholder="Nhập vào Nam" value="<%
        	ServletContext context5 = getServletContext();
       	 out.print(context3.getAttribute("Nam"));
        %>">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">ID:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="ID" placeholder="Nhập vào ID" value="<%
        	ServletContext context6 = getServletContext();
       	 out.print(context3.getAttribute("ID"));
        %>">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">PASS:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="Pass" placeholder="Nhập vào Nam" value="<%
        	ServletContext context7 = getServletContext();
       	 out.print(context3.getAttribute("Pass"));
        %>">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Link:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="Link" placeholder="Nhập vào Link" value="<%
        	ServletContext context8 = getServletContext();
       	 out.print(context3.getAttribute("Link"));
        %>">
      </div>
    </div>
          
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Sửa</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>