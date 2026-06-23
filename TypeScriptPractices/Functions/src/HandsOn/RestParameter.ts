function sum(a:number,...b:number[]):number{
    let result:number = a
    for(let i=0;i<b.length;i++){
        result+=b[i];
    }
    return result;
}

console.log(sum(5,3));
console.log(sum(5,3,7,9));