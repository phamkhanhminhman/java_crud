<%-- 
    Document   : index.jsp
    Created on : May 6, 2017, 10:04:22 PM
    Author     : MinhMan
--%>

<%@page import="model.sinhvien"%>
<%@page import="dao.sinhvienDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="model.MyConnectDB"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Demo Connect DTB</title>
	<style type="text/css">
		.row {  
			margin-top:40px;    
			padding: 0 10px;
		}
		.clickable {    
			cursor: pointer;
		}
		.panel-heading div {    
			margin-top: -18px;  
			font-size: 15px;
		}
		.panel-heading div span {   
			margin-left:5px;
		}
		.panel-body {   
			display: none;
		}
	</style>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	

</head>
<body>
    <%
       sinhvienDAO dao = new sinhvienDAO();
        %>
	<div class="container"> 
		<h2 align="center">Quản lý toàn bộ dữ liệu từ 2014 ->201X</h2> 
		<div class="row"> 
			<div class="col-md-12"> 
						<a href="ThemTaiKhoan.jsp"><button class="btn btn-success">Thêm hoat dong</button></a>
				<div class="panel panel-primary"> 
					<div class="panel-heading"> 
						<h3 class="panel-title">Danh sách thành viên</h3> 
						
					</div> 
					<div class="panel-body"> <input class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Từ khóa" type="text"> 
					</div> 
					
					<%
					MyConnectDB con = new MyConnectDB();
					ResultSet rs = con.chonDuLieuTuDTB("select * from data");
					%>
                                        
                                        <table class="table table-hover" id="dev-table"> 
                                            <thead> 
                                                <tr> 
                                                    <td>Ma</td>                                             
                                                    <th>TenFile</th>
                                                    <th>Size</th> 
                                                    <th>Location</th>
                                                    <th>Nam</th>    
                                                    <th>ID</th>
                                                    <th>Pass</th> 
                                                    <th>Description</th>
                                                    <th>Link</th>   
                                                    <th>Delete</th>
                                                    <th>Fix</th>
                                                 
                                                </tr> 
                                            </thead> 
                                           
                                           
                                                <%    
                                                    while (rs.next()) {
                                                %>

                                                <tr> 
                                                    <td><%=rs.getString(1)%></td> 
                                                    <td><%=rs.getString(2)%></td> 
                                                    <td><%=rs.getString(3)%></td> 
                                                    <td><%=rs.getString(4)%></td>
                                                    <td><%=rs.getString(5)%></td> 
                                                    <td><%=rs.getString(6)%></td>
                                                    <td><%=rs.getString(7)%></td> 
                                                    <td><%=rs.getString(9)%></td>
                                           
                                                                                                 
                                                   
                                                  
                                               
                                                       <td><a href="<%=rs.getString(8)%>"><button class="btn btn-success">Link</button></a></td>
                                                    <td><a href="XoaTK?Ma=<%=rs.getString(1)%>"><button class="btn btn-warning">Xóa</button></a></td>
                                                    <td><a href="SuaTK?Ma=<%=rs.getString(1)%>"><button class="btn btn-primary">Sửa</button></a></td>
                                                </tr> 
                                                <%
                                                    }
                                                %>


                                            </tbody></table> 
                                </div> 
                        </div> 
                </div>



        </div>
       <h3 align="center">Ghi chú:<span>pkmm<->phamkhanhminhman@gmail.com</span></h3> 
					
</body>
</html>