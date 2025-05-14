/* main2.js */

import getType, {userrandom} from '../js/getType.js'

console.log(typeof 'hello world')
console.log(typeof 123)
console.log(typeof true)
console.log(typeof undefined)
console.log(typeof null)
console.log(typeof {})
console.log(typeof [])

const a = 'MSA 2th';
//split: 문자를 인수 기준으로 쪼개서 배열로 반환
//reverse: 배열을 뒤집기
//join: 배열을 인수 기준으로 문자로 병합해 반환

const b = a.split('').reverse().join('');	// 메서드 체이닝
console.log(a);
console.log(b);

const boxEl2 = document.querySelector('.box');
console.log(boxEl2)

// Getter, 값을 얻는 용도
console.log(boxEl2.textContent);
// Setter, 값을 세팅(지정)하는 용도
boxEl2.textContent = 'Zoooo';
console.log(boxEl2.textContent);

// 반복문
// for(시작값; 조건; 증감식) { 반복 구문 실행; }
for(let i=1; i <= 100; i +=2){
	console.log(i);
}
	console.log("======================");
for(let i=1; i <= 100; i++){
	if(i%3 == 0) console.log(i);
}


console.log("------------------------------------")
console.log(getType(123));
console.log(getType({}));
console.log(getType([]));
console.log(getType(false));
console.log(getType(null));

// 산술 연산자
console.log(1 + 2);
console.log(1 - 2);
console.log(1 * 2);
console.log(10 / 2);
console.log(7 % 2);

// 할당 연산자
let x = 2;
x += 1; // x = x + 1;
console.log(x);

// 비교 연산자
const y = 1;
const z = '1';
console.log(y == z); // 동등
console.log(y === z); // 일치 - 데이터 타입까지 확인

function isEqual(x, y){
	return x === y;
}
console.log(isEqual(1,1));
console.log(isEqual(1,2));
console.log(isEqual(2,"2"));
console.log(y !== z);
// >, <, <=, >=

// 논리 연산자
const c = 1===1;
const d = "AB" === "AB";
const e = false;
console.log(c)
console.log(d)
console.log(e)
console.log("&&: ", c && d && e)
console.log("||: ", c || d || e)

// 삼항 연산자
const f = 1< 2;
if(f) console.log('참')
else console.log('거짓')

console.log(f? '참':'거짓');

console.log(Math.random * 10)

const func = userrandom();		// 사용자가 만든 js 파일 안에 있는 함수 호출
console.log(func);


// HTML 요소(Element) 1개 검색/찾기
const boxEls = document.querySelectorAll('.box');
console.log(boxEls)

// 찾은 요소들 반복해서 함수 실행 - 익명함수 추가
//boxEls.forEach(function(1, 2, 3,...){ })		// 1. 반복중인 요소값, 2. 인덱스, 3. 인덱스
boxEls.forEach(function(item, index){
	//item.classList.add(`order-${index + 1}`)
	console.log(index, item)
 });

const boxEl = document.querySelector('.box')
console.log(boxEl)

// HTML ㅛ소에 적용할 수 있는 메서드
//인수 (Arguments)를 추가하는 기능
// boxEl.addEventListneer(1, 2): 1. event, 2. 할일
boxEl.addEventListener('click', function(){
	console.log("Click!");
	boxEl.classList.add('active');
	console.log(
		boxEl.classList.contains("active")
	);
	boxEl.classList.remove("active")
	console.log(
		boxEl.classListcontains('active')
	);
});

let isShow = true;
let checked = false;

if(isShow){
	console.log("show!");
}

if(checked){
	console.log('checked!')
}

if(isShow){
	console.log("show!");
}else{
	console.log('hide!')
}
	