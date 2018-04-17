<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://code.ionicframework.com/1.0.0/css/ionic.css" />
	<script src="http://code.ionicframework.com/1.0.0/js/ionic.bundle.js"></script>
<title>FAQ App</title>
</head>
<body>
<form action="Topic" method="post">
<h3>Dynamic FAQ with JSP and JavaBeans</h3>
<hr>
<label class="item item-input">
	<span class="input-label">Topic Name:</span>
	<input name="topic" placeholder="Enter Topic Name" required="true" type="text"/>
</label>
<button type="submit" class="button icon-left ion-android-create">Ok</button>
</form>

<ion-header-bar class="bar-stable">
        <h4 class="title">Table of Frequently Asked Questions</h4>
    </ion-header-bar>
    <ion-content>
        <div class="row header">
          <div class="col">Question</div>
          <div class="col">Answer</div>
        </div>
        <!-- Loop through faq questions array here -->
        <div class="row">
          <div class="col">Test Question</div>
          <div class="col">Test Answer</div>
        </div>
    </ion-content>
</body>
</html>