/* main4.js */

	let a, b, rest;
	/* a = 10;
	b = 20; */
	[a, b] = [10, 20];		// 구조분해할당
	
	document.write(a + "<br>");
	console.log(a);
	document.write(b + "<br>");
	console.log(b);
	
	[a, b, ...rest] = [1, 2, 3, 4, 5];		// ... 은 남은 값들을 할당하겠다는 의미. 결국 배열이 되어버린다.
	document.write(rest + "<br>");
	console.log(rest);
	document.write("<hr>")
	
	const numbers = [1, 2, 3, 4];
	let fruits = ["사과", "바나나", "토마토"];
	fruits.forEach(function(item, index, array){
		document.write(item, index + "<br><p>");
		document.write(array + "<hr>");
	});
	document.write("<hr>");
	
	// fruits.forEach( () => { } )
	fruits.forEach((item, index, array) => {
		document.write(item, index + "<br><p>");
	});
	document.write("<hr>")
	
	const x = fruits.map(function(fruit, i) { 
		return `${i + 1} - ${fruit}<br>`;
	});
	
	console.log(x);
	document.write(x);
	document.write("<hr>");
	
	const y = fruits.map( (fruit, i) => {
		//return `${i + 1} - ${fruit}<br>`;
		return {
			id: i,
			name: fruit
		}
	});
	
//	document.write(y);
	document.write(` y: ${y[0].id } ${y[0].name }`);
	document.write("<hr>");
	
	let newLength = fruits.push("오렌지");
	document.write(fruits + "<br><p>");
	document.write(newLength + "<hr>");
	