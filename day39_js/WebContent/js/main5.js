/* main5.js */

// 타이머 함수
//setTimeout(함수, 시간): 일정한 시간 지난 후 함수 실행
//setInterval(함수, 시간): 시간 간격마다 함수 실행
//clearTimeout(): 설정된 Timeout 함수 종료
//clearInterval(): 설정된 Interval 함수 종료

// 콜백함수(Callback): 함수의 인수로 사용되는 함수
function timeout(callback){
	setTimeout(() => {
		console.log("MSA-2th");
		callback();
	}, 1000)
}

timeout(() => {
	console.log("End")
});

const timer = setInterval(() => {
	console.log("MSA-2th!")
}, 1000);

const h5El = document.querySelector('h5')
h5El.addEventListener('click', () => {
	// alert("msa-2th");
	clearTimeout(timeout);
	clearInterval(timer);
})

// 호이스팅(Hoisting)
// 함수 선언부가 유효범위 최상단으로 끌어올려지는 현상
// JavaScript Parser가 함수 선언에 대한 정보를 기억하고 있다가 실행시킨다

console.log(12235121);

console.log(userName);
console.log(userName2);

var userName;		// var 변수는 호이스팅 발생된다.
let userName2 = 'yuna';
console.log(userName);	// let 변수는 호이스팅이 발생하지 않는다.

const a = 77;
var method;

method2();
function method2(){
	console.log(a*5);
}


method = function(){
	console.log(a * 3);
};