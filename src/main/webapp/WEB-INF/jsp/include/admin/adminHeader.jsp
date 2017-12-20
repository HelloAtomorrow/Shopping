<%--
  Created by IntelliJ IDEA.
  User: Xiaoxiang
  Date: 2017.12.18
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%--
contentType="text/html; charset=UTF-8" 告诉浏览器使用UTF-8进行中文编码识别
pageEncoding="UTF-8" 本jsp上的中文文字，使用UTF-8进行编码
isELIgnored="false" 本jsp上会使用EL表达式
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>

<%--使用jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>adminHeader</title>

    <%--头部使用jquery和bootscrap--%>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/back/style.css" rel="stylesheet">

    <script>
        <%--判断输入框的函数--%>
        function checkEmpty(id, name) {
            var value = $("#" + id).val();
            if (value.length == 0) {
                alert(name + "不能为空");
                $("#" + id)[0].focus;
                return false;
            }
            return true
        }

        function checkNumber(id, name) {
            var value = $("#" + id).val();
            if (value.length == 0) {
                alert(name + "不能为空");
                $("#" + id)[0].focus;
                return false;
            }
            if (isNaN(value)) {
                alert(name + "必须是数字");
                $("#" + id)[0].focus;
                return false;
            }
            return true;
        }

        function checkInt(id, name) {
            var value = $("#" + id).val();
            if (value.length == 0) {
                alert(name + "不能为空");
                $("#" + id)[0].focus;
                return false;
            }
            if (parseInt(value) != value) {
                alert(name + "必须是整数");
                $("#" + id)[0].focus;
                return false;
            }
            return true;
        }

        <%--判断删除超链接--%>
        $(function () {
            $("a").click(function () {
                var deleteLink = $(this).attr("deleteLink");
                console.log(deleteLink);
                if ("true" == deleteLink) {
                    var confirmDelete = confirm("确认要删除");
                    if (confirmDelete) {
                        return true;
                    }
                    return false;
                }
            })
        })
    </script>


</head>
<body>

</body>
</html>
