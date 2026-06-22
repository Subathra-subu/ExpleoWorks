function someFun(){
    if(true){
        var variable:number = 10;
        console.log(variable)
    }
    console.log(variable)

    function nested(){
        console.log(variable)
    }
}

someFun()