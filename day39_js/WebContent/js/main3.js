/*main3.js */

// 제어문 - if, for, while, .

/*let dan = prompt('dan input: ')
console.log(dan);*/

const ulEl = document.querySelector('ul')	// #idName, .className, tagName
console.log(ulEl);

for(let i=0; i < 10; i+=1){
	const li = document.createElement('li');
	li.textContent = `list-${i + 1}`;
	if(i%2 === 0){		// '===' 는 타입까지 값 비교, '==' 는 동등인지만 비교.
		li.addEventListener('click', function(){
			console.log(li.textContent);
		});
	}
	ulEl.appendChild(li);
}


// 선택자.addEventListener(이벤트명, 해야할일)
console.log('**')

// selector.addEventListener(eventName, function(){})
/*
for(let i = 0; i < 3; i += 1) {
    const li = document.createElement('li')
    li.textContent  =  `list-${i+1}`   // 'list-' + (i+1)
    ulEl.appendChild(li)
}
*/
//3. for
for(let i = 0; i < 3; i += 1) {
    console.log(i)
}


console.log('=================')

const x = Math.floor(Math.random() * 10)   // 난수 

console.log(x)

//2. switch ~ case 
switch (x) {
    case 0:
        console.log('x is 0')
        break;
    case 2:
        console.log('x is 2')
        break;
    case 5:
        console.log('x is 5')
        break;
    default:
        console.log('reset......', x)
}


console.log('=================')

//1. if~ else

if (x === 0) {
    console.log('x is 0')
} else if (x === 2) {
    console.log('x is 2')
} else {
    console.log('reset......', x)
}




//함수
//function name() {  }
//function name(val, val2,...) {  }
//function name() { return value; }

//화살표 함수
// ( ) => { }   vs    function() {   }

//const doubleArrow = (x) => {
//    return x * 5
//}

//const doubleArrow = (x) => { return  x * 5 }
const doubleArrow = (x) =>  x * 5 

console.log('doubleArrow : ' , doubleArrow(3) )


//function double() { //함수정의부
//    console.log( xy * 2 );
//}

const double = ( ) => {     console.log( xy * 2 );  }

const double2 =  x  => {
//const double2 = ( x ) => {
//const double2 = function(x, y) {
    //return x * 2;
    return x * y ;
}

//const double4 =  x, y => {  X
const double4 = (x, y) => {
    //return x * 2;
    return x * y ;
}

const double5 = (x, y) => {  x * y ; }



const double3 = (x) => { return x * 2 };

//const double2 = function( x ) {
//const double2 = function(x, y) {
    //return x * 2;
    //return x * y ;
//}
console.log( 'double2 : ', double2(6, 7) )
console.log( 'double2 : ', double2(5) )




//즉시실행함수 1) ( x )( ) ,   2) ( x() )
const xy = 7
//function double() { //함수정의부
//    console.log( xy * 2 );
//}

double() // 함수호출
console.log('------------------------------------');
(function square(x){
    console.log(x, x);
} ( 2 ) );
console.log('------------------------------------');

(function(){
    console.log( xy * 2 );
}());
console.log('------------------------------------');

//변수 유효범위
// var - 함수레벨
// let, const - 블럭레벨

var y = 789;
function scope() { //함수 정의부
    if( true ) {
        //console.log( y )  //
        //var y = 123;
        let y = 456;
        console.log( y )
    }

    //console.log( y ) //  var  vs let 
} // func end

scope();
console.log('-=-=-=-=-=-=-=-=-=-=-')

//형변환
// 참 : true, {}, [], 1,2, 'false', -12, '3.45', 12.34,....
// 거짓 : false, ' ', null, undefined, 0, -0, NaN

if( true ){ //if( 'false' ) { //if( !0 ){
    console.log(1235);
}

/*const a = 1;
const b = 1;
console.log(a == b)*/


// function

//( ) => { }


const arrowFun2 = x => { { name: 'Yuna' } }
console.log('arrowFun2 : ', arrowFun2 )
console.log('arrowFun2 : ', arrowFun2(x.name) )

console.log('---------------------------')

const arrowFun = x => [1, 2, 3]
console.log('arrowFun : ', arrowFun(7))

console.log('---------------------------')
const sum11 = ( ) => { console.log('hello') }
sum11()

console.log('---------------------------')

const sum10 = (  ) => 1000
console.log('sum10 : ', sum10() )
console.log('---------------------------')

const sum9 = x  => x + 500 
console.log('sum9 : ', sum9(5) )
console.log('---------------------------')

const sum8 = ( x ) => x + 300 
console.log('sum8 : ', sum8(5) )
console.log('---------------------------')

const sum7 = (x , y) => x + y 
//const sum7 = (x , y) => {     return x + y  }
console.log('sum7 : ', sum7(11, 22) )
console.log('---------------------------')
const sum6 = (x , y) => {
    return x + y
}
console.log('sum6 : ', sum6(1, 2) )
console.log('---------------------------')
const sum5 = function(x , y) {
    return x + y
}
console.log('sum5 : ', sum4(100, 200) )

console.log('---------------------------')
function sum4() {
    console.log( arguments )
    return arguments[0]
}

console.log( sum4(100, 7, 3) );
//console.log( sum4(7, 3) );
//console.log( sum4() );

console.log('---------------------------')
const sum3 = function(x , y) {
    return x + y
}
const c = sum3(1, 1)
console.log( c );
console.log( sum3(10, 20) )
console.log('---------------------------')
function sum2(x , y) {
    return x + y
}
const a = sum2(10, 20)
const b = sum2(5, 10)
console.log( a + b ) 

console.log(sum2(1, 1) + sum2( 5, 10))

console.log('---------------------------')
function sum(x , y) {
    console.log(x + y)
}

sum(1, 3)
sum(5, 7)