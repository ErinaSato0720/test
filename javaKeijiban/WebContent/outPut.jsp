<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<header> </header>
	<div id="main">
		<h1>Java 掲示板 課題</h1>

		<s:form action="InputAction">
			<tr>
				<td>
					<label>名前</label>
				</td>
				<td>
					<input type = "text" name = "name" value = "" />
				</td>
			</tr>
			<tr>
				<td>
					<label>タイトル</label>
				</td>
				<td>
					<input type = "text" name = "title" value = "" />
				</td>
			</tr>
			<tr>
				<td>
					<label>コメント</label>
				</td>
				<td>
					<textarea cols="35" rows="5" name="comments"></textarea>
				</td>
			</tr>
			<s:submit value = "送信"/>
		</s:form>
	</div>

	<h3>コメント一覧</h3>
	<div>
		<s:iterator value = "inputDTOList">
		<table>
		<tr>
			<td><label>名前：</label></td>
			<td>
				<s:property value = "name"/>
			</td>
		<tr>
		<tr>
			<td><label>タイトル：</label></td>
			<td>
				<s:property value = "title"/>
			</td>
		</tr>
		<tr>
			<td><label>コメント</label></td>
			<td>
				<textarea cols="35" rows="5" name="comments">
				<s:property value = "comments"/>
				</textarea>
			</td>
		</tr>
		</table>
		</s:iterator>
	</div>


</body>
</html>