	function toUrl() {
		location.replace("signUp");
	}
	
	window.onload = function() {                         // 페이지가 로딩되면 실행
	    printTime();
/*	    countDown();*/
	}
	
	function printTime() {
	
	    var clock = document.getElementById("timeNow");            // 출력할 장소 선택
	    var now = new Date();                                                  // 현재시간
	    var nowTime = now.getFullYear() + "년" + (now.getMonth()+1) + "월" + now.getDate() + "일" + now.getHours() + "시" + now.getMinutes() + "분" + now.getSeconds() + "초";
	    clock.innerHTML = nowTime;           // 현재시간을 출력
	    setTimeout("printTime()",1000);         // setTimeout(“실행할함수”,시간) 시간은1초의 경우 1000
	}
	
	
	var cnt = 5;
	
	function countDown(){
	
	  	if(cnt > 0){
			document.all.showCnt.innerHTML = cnt + "초 후에 '회원가입' 페이지로 이동 됩니다.";
			setTimeout("countDown()",1000);
			cnt--;
		}else if(cnt == 0){
			toUrl();
		} 
	}