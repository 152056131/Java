
window.onload = function () {
    var startGame = document.getElementsByClassName('startGame')[0];
    var btnStart = document.getElementsByClassName('btn-start')[0];
    var ball = document.getElementsByTagName('div');
    var redBall = document.getElementById('redBall');
    
   
    var timer;
    var speed = 200;
    var speedx=6;
    var speedy=8;
    var i = 0;
    redBall.style.top = '255px';
    redBall.style.left = '255px';
    init();
    Gameover();
    function init() {
        //获取游戏地图尺寸
        this.mapW = parseInt(getComputedStyle(startGame).width);
        this.mapH = parseInt(getComputedStyle(startGame).height);
        this.mapDiv = startGame;
        addListener();
        
       
    }
    function addListener(){
        btnStart.onclick = function(){
            btnStart.style.display = 'none';
            ball[1].style.display = 'block';
            ball[2].style.display = 'block';
            
          window.setInterval(function(){
                GreenBall();
                
                
            },500);
           
        }
        //设置红色球运动
       redBall.onmousedown = function(e){
           var oevent = e||event;
           var distanceX = oevent.clientX - redBall.offsetLeft;
           var distanceY = oevent.clientY - redBall.offsetTop;
           document.onmousemove = function(e){
               var oevent = e||event;
               redBall.style.left = oevent.clientX - distanceX + 'px';
               redBall.style.top = oevent.clientY - distanceY + 'px';
           };
           document.onmouseup = function(){
               document.onmouseup = null;
               document.onmousemove = null;
           }
           
       }

    }
    function GreenBall(){
        var greenBall = document.createElement('div');
        greenBall.style.width = "50px";
        greenBall.style.height = "50px";
        greenBall.style.position = 'absolute';
        greenBall.style.borderRadius = '50%';
        greenBall.style.top = '0px';
        greenBall.style.backgroundColor = 'green';
        greenBall.style.display = 'block';
        // greenBall.style.left = '450px';
        greenBall.style.left = Math.random()*500-50 + 'px';
        this.mapDiv.appendChild(greenBall).setAttribute('class', 'greenBall');
        setInterval(function(){GreenMove(greenBall);},50);
        
        
        
    }
    function GreenMove(greenBall){
        var l=greenBall.offsetLeft+speedx;
        var t=greenBall.offsetTop+speedy;

        if(l>=startGame.clientWidth-greenBall.offsetWidth){
            speedx*=-1;
            l=startGame.clientWidth-greenBall.offsetWidth;
        }else if(l<=0){
            speedx*=-1;
            l=0;
        }
        if(t>=startGame.clientHeight-greenBall.offsetHeight){
            speedy*=-1;
            t=startGame.clientHeight-greenBall.offsetHeight;
        }else if(t<=0){
            speedy*=-1;
            t=0;
        }
        greenBall.style.left=l+"px";
        greenBall.style.top=t+"px";
        
    }
    function Gameover(){
        
    }
    
}
// 1.设置拖动红色球 ✔
// 2.设置绿色球运动 ✔
// 3.设置随机出现绿色球 ✔
// 4.设置碰撞边距游戏结束
// 5.设置红色球与绿色球碰撞游戏结束
// 6.生成绿色球 ✔