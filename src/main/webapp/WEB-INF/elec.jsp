<%@page import="org.w3c.dom.NodeList"%>
<%@page import="java.io.StringReader"%>
<%@page import="org.xml.sax.InputSource"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//문자열로 되어 있는 xml 형식의 문자열
String data=(String)request.getAttribute("data");
System.out.println("데이터 값"+data);
DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
DocumentBuilder builder=null;
try{
	builder=factory.newDocumentBuilder();
	Document doc=builder.parse(new InputSource(new StringReader(data)));
	//doc 해석
	System.out.println(doc.getFirstChild().getNodeName());
	//문서 안정화
	doc.getDocumentElement().normalize();
	
	//태그의 리스트를 가져오는 작업
	NodeList list=doc.getElementsByTagName("addr");
	NodeList list2=doc.getElementsByTagName("powerType");
	for(int i=0; i<list.getLength();i++){
		//System.out.println(list.item(i).getTextContent());
		out.println(list.item(i).getTextContent()+":"+list2.item(i).getTextContent()+"<br>");
	}
}catch(Exception e){ 
	e.printStackTrace();
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%-- ${data} --%>
<%-- <%=data %> <br> --%>
${context } <br>
${session} <br>
</body>
</html>