<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("button").click(function(){
    $.ajax({url: "http://apis.data.go.kr/1360000/TourStnInfoService/getCityTourClmIdx?serviceKey=uM73FRFMgpboVDCugtsdwWkNKzGf8E8tpuii9790h2dbDAKe8NqhrgPSQX59T3KQJXhu77drzOviMeDaSrnLxA%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2019122010&DAY=3&CITY_AREA_ID=5013000000", success: function(result){
      $("#div1").html(result);
    }});
  });
});
</script>
</head>
<body>

<div id="div1"><h2>Let jQuery AJAX Change This Text</h2></div>

<button>Get External Content</button>
<p>

<iframe width="100%" src="http://apis.data.go.kr/1360000/TourStnInfoService/getCityTourClmIdx?serviceKey=uM73FRFMgpboVDCugtsdwWkNKzGf8E8tpuii9790h2dbDAKe8NqhrgPSQX59T3KQJXhu77drzOviMeDaSrnLxA%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2019122010&DAY=3&CITY_AREA_ID=5013000000"></iframe>

</body>
</html>
















</body>
</html>