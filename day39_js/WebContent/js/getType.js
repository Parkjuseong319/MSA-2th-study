/* getType.js */

export default function getType(data){
	return Object.prototype.toString.call(data).slice(8, -1);
}

export function userrandom(){
	return Math.floor(Math.random() * 10);
}                                                                                                             