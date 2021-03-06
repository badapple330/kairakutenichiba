<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    <!-- ここから国際化 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!-- ここまで国際化 -->

<!DOCTYPE html>
<html>

<head>
<script type="text/javascript">
    history.pushState(null, null, null);

    window.addEventListener("popstate", function() {
        history.pushState(null, null, null);
    });
</script>
<!-- 国際化 ロケールID取得 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<!-- 国際化 propertyファイルの場所の定義 -->
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.finish" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/finish.css">

<title><s:text name="lang.finish.title" /></title>
<meta http-equiv="refresh" content="3;index.jsp">
</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>

<h1><s:text name="lang.finish.h1" /></h1>
<h3><s:text name="lang.finish.countdown" /></h3>

<h4><a href="index.jsp"><s:text name="lang.finish.toppage" /></a></h4>
</body>
</html>