function showDetails(id:number,name:String,email_id?:String){
    console.log("Id:",id,"Name:",name);
    if(email_id!=undefined){
        console.log("Email_id:",email_id);
    }
}
showDetails(101,"Sham");
showDetails(102,"Sham","sham@gmail.com");