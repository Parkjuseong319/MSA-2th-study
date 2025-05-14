/* main.js */
// var vs let vs const

// Array(배열 데이터): 여러 데이터를 순차적으로 저장
let fruit = ["Apple", "Banana", "Cherry"];
console.log(fruit[0]);
console.log(fruit[1]);
console.log(fruit[2]);

console.log(new Date('2025-05-14'));
console.log(new Date('2025-05-14').getDay());	// 요일을 숫자로 출력. 월요일부터 1.
console.log(new Date('2025-05-14').getFullYear());

// String(문자데이터): 따옴표를 사용한다.
let myName = 'Zoo';
let email = "zoopark@naver.com"
// let hap = "안녕하세요" + myName + "입니다."
let hap = `안녕하세요 ${myName} 입니다.`;		// 백틱 (`)을 이용하여 문자열과 변수를 같이 작성할 수 있다.

console.log(myName);
console.log(email);
console.log(hap);
console.log(`my mail ${email} 여기로 연락`)

// Number(숫자데이터): 정수 및 부동소수점 숫자..
let num = 100;
console.log(num);
num = 99;
console.log(num);
let opacity = 1.34;
console.log(opacity);

//Boolean(불리언 데이터): true, false 논리 데이터
let checked = true;
let isShow = false;
console.log(checked);
console.log(isShow);

// Undefined: 값이 할당되지 않은 상태
let undef;	// 초기화 안되어 있으면...
console.log(undef);	// undefined
let obj = {pass:1234, pwd: 'abc'};
console.log(obj.pass);
console.log(obj.pwd);
console.log(obj.id);		// 없는건 undefined 속성

// Null: 어떤 값이 의도적으로 비어있음을 의미
let empty = null;
console.log(empty);		// null

// Object(객체 데이터): 여러데이터를 key:value 로 저장
let user = {
	// key:value
	name : "zoo",
	age : 28,
	isValid : false
};

console.log(user);
console.log(user.age);
console.log(user.isValid);
console.log(user.name);

// 변수 선언 - 재사용(재할당)이 가능
let a = 2;
let b = 5;
console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);

a= 12;
console.log(a)
b= 9999;
console.log(b)

// 값 재할당 불가
const x = 15;
console.log(x);
//x= 20;
//console.log(x); // TypeError: Assignment to constant variable.

// let break = 'zoo';	// 예약어는 변수로 지정 불가
// console.log(this);

// 함수 선언
function myFun(){
	// 실행코드
	console.log(1004);
}

// 함수 호출
myFun()

// return type method
function returnFun(){
	return 300;
}

console.log(returnFun())
let call = returnFun();
console.log(call);

function sum(x, y){		// x, y 는 매개변수(Parameter)
	return x + y;
}

console.log(sum(1,2))
let c = sum(3,4)
let d = sum(7, 12)
let e = sum(2, 4)

console.log(c, d, e)

// 기명(이름있는) 함수
function hello(){
	console.log("hello")
}

// 익명(이름없는) 함수
let world = function(){
	console.log("world!")
}

// 함수 호출
hello();
world();

// 객체 데이터
const person = {
	name: '강감찬',
	age: 85,
	//method
	getName: function(){
		return this.name;
	},
	getAge: function(){
		return this.age;
	},
	setName: function(data){
		this.name = data;
	},
	setAge: function(data){
		this.age = data;
	}
};

const hisName = person.getName();
console.log(hisName)
//or
console.log(person.getAge());
console.log(person.getName());
console.log(person.age);
person.setName('가나다라')
console.log(person.getName())
person.setAge(33)
console.log(person.getAge())