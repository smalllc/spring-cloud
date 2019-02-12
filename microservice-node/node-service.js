let http = require('http')
let url = require('url')
let path = require('path')


// 创建一个server
let server = http.createServer(function(req,res){
// 获取请求路径
let pathname= url.parse(req.url).pathname;
// 访问 http：//localhost:8060/ 返回欢迎你 smallcc
if(pathname === '/'){
 res.end(JSON.stringify({'index':'welcome to smallcc index'}))
}
else if (pathname ==='/health') {
res.end(JSON.stringify({
    "status":"UP"
}))

}
else{
    res.end(JSON.stringify({'code':404}))
}
});

// 创建监听
server.listen(8060,function(){
    console.log('start the project in localhost:8060');
})