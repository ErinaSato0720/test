<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>inputConfirm</title>

<script type="text/javascript">
			function submitAction(url) {
				$('form').attr('action', url);
				$('form').submit();
			}
		</script>
</head>
<body>
	<header> </header>
	<div id="main">
		<h3>投稿する内容は以下でよろしいですか？</h3>
		<s:form>
		<table>
		<tr>
			<td>
				<s:property value = "comments" escape = "false"/>
			</td>
		</tr>
		<tr>
			<td><input type = "button" value = "OK" onclick = "submitAction('OutPutAction')"/></td>
		</tr>
		<tr>
			<td><input type = "button" value = "戻る" onclick = "submitAction('GoIndexAction')"/></td>
		</tr>
		</table>
		</s:form>
	</div>
</body>
</html>