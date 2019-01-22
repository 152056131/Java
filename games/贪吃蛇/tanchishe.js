window.onload = function () {
    var content = document.getElementById('startGame');
    var scoreBox = document.getElementById('socer');
    var startBtn = document.getElementById('startBtn');
    var startAndPause = document.getElementById('startAndPause');
    var loser = document.getElementById('loser');
    var loserScore = document.getElementById('loserScore');
    var closelogo = document.getElementById('closelogo');
    var timer;
    var speed = 200;
    var count = 0;
    init();
    function init() {
        //设置地图属性
        this.mapW = parseInt(getComputedStyle(content).width);
        this.mapH = parseInt(getComputedStyle(content).height);
        this.mapDiv = content;
        //设置食物属性
        this.foodW = 20;
        this.foodH = 20;
        this.foodX = 0;
        this.foodY = 0;
        //设置蛇的属性
        this.snakeW = 20;
        this.snakeH = 20;
        this.snakeBody = [[2, 0, 'head'], [1, 0, 'body'], [0, 0, 'body']];
        //设置方向初始值
        this.direct = 'right';
        this.left = false;
        this.up = true;
        this.down = true;
        this.right = false;
        //设置分数初始值
        this.score = 0;
        scoreBox.innerHTML = this.score;
        Listener();

    }
    //食物函数
    function food() {
        var food = document.createElement('div');
        food.style.width = this.foodW + 'px';
        food.style.height = this.foodH + 'px';
        food.style.position = 'absolute';
        this.foodX = Math.floor(Math.random() * (this.mapW / 20));
        this.foodY = Math.floor(Math.random() * (this.mapH / 20));
        food.style.left = this.foodX * 20 + 'px';
        food.style.top = this.foodY * 20 + 'px';
        this.mapDiv.appendChild(food).setAttribute('class', 'food');
    }
    //蛇函数
    function snake() {
        for (var i = 0; i < this.snakeBody.length; i++) {
            var snake = document.createElement('div');
            snake.style.width = this.snakeW + 'px';
            snake.style.height = this.snakeH + 'px';
            snake.style.position = 'absolute';
            snake.style.left = this.snakeBody[i][0] * 20 + 'px';
            snake.style.top = this.snakeBody[i][1] * 20 + 'px';
            snake.classList.add(snakeBody[i][2]);
            this.mapDiv.appendChild(snake).classList.add('snake');
        }
        switch (this.direct) {
            case 'right':
                break;

            case 'up': snake.style.transform = 'rotate(270deg)';
                break;

            case 'left': snake.style.transform = 'rotate(180deg)';
                break;

            case 'down': snake.style.transform = 'rotate(90deg)';
                break;
            default:
                break;
        }
    }
    //开始游戏函数
    function startGame() {
        scoreBox.innerHTML = 0;
        food();
        snake();
        timer = setInterval(function(){
            move();
        },speed);
        bindEvent();
        startBtn.style.display = 'none';
        startAndPause.style.display = 'block';
    }
    //设置绑定事件
    function bindEvent() {
        document.onkeydown = function (e) {
            var code = e.keyCode;
            setDirect(code);
        }
    }
    //设置方向选择函数
    function setDirect(code) {
        switch (code) {
            case 38:
                if (this.up) {
                    this.direct = 'up';
                    this.up = false;
                    this.down = false;
                    this.right = true;
                    this.left = true;
                }
                break;
            case 40:
                if (this.down) {
                    this.direct = 'down';
                    this.down = false;
                    this.right = true;
                    this.left = true;
                    this.up = false;
                }
                break;
            case 37:
                if (this.left) {
                    this.direct = 'left';
                    this.up = true;
                    this.down = true;
                    this.right = false;
                    this.left = false;
                }
                break;
            case 39:
                if (this.right) {
                    this.direct = 'right';
                    this.down = true;
                    this.right = false;
                    this.left = false;
                    this.up = true;
                }
                break;
                default:break;
        }

    }
    //设置移动函数
    function move() {
        for (var i = this.snakeBody.length - 1; i > 0; i--) {
            this.snakeBody[i][0] = this.snakeBody[i - 1][0];
            this.snakeBody[i][1] = this.snakeBody[i - 1][1];
        }
        switch (this.direct) {
            case 'right': this.snakeBody[0][0] += 1;
                break;

            case 'up': this.snakeBody[0][1] -= 1;
                break;

            case 'left': this.snakeBody[0][0] -= 1;
                break;

            case 'down': this.snakeBody[0][1] += 1;
                break;
            default:
                break;
        }
        removeClass('snake');
        snake();
        if (this.snakeBody[0][0] == this.foodX && this.snakeBody[0][1] == this.foodY) {
            var snakeEndX = this.snakeBody[this.snakeBody.length - 1][0];
            var snakeEndY = this.snakeBody[this.snakeBody.length - 1][1];
            switch (this.direct) {
                case 'right': this.snakeBody.push([snakeEndX + 1, snakeEndY, 'body']);
                    break;

                case 'up': this.snakeBody.push([snakeEndX, snakeEndY - 1, 'body']);
                    break;

                case 'left': this.snakeBody.push([snakeEndX - 1, snakeEndY, 'body']);
                    break;

                case 'down': this.snakeBody.push([snakeEndX, snakeEndY + 1, 'body']);
                    break;
                default:
                    break;
            }
            this.score += 1;
            scoreBox.innerHTML = this.score;
            console.log( scoreBox.innerHTML);
            removeClass('food');
            food();

        }
        if (this.snakeBody[0][0] < 0 || this.snakeBody[0][0] >= this.mapW / 20) {
            reloarGame();
           
        }
        if (this.snakeBody[0][1] < 0 || this.snakeBody[0][1] >= this.mapH / 20) {
            reloarGame();

           
        }
        var snakeHX = this.snakeBody[0][0];
        var snakeHY = this.snakeBody[0][1];
        for (var i = 1; i < this.snakeBody.length; i++) {
            if (snakeHX == snakeBody[i][0] && snakeHY == snakeBody[i][1]) {
                reloarGame();
               
            }
        }
    }
    //设置移除类名
    function removeClass(className) {
        var ele = document.getElementsByClassName(className);
        while (ele.length > 0) {
            ele[0].parentNode.removeChild(ele[0]);
        }
    }
        //设置监听事件
        function Listener() {
            closelogo.onclick = function(){
                loser.style.display = 'none';
                startAndPause.style.display = 'none';
                startBtn.style.display = 'block';
            }
            startBtn.onclick = function () {
                startGame();
            }
            startAndPause.onclick = function(){
                //单数暂停，双数开始
               
                count++;
                if(count%2!=0){
                    clearInterval(timer);
                    startAndPause.style.backgroundImage = "url('imgs/start.png')";
                }
                else{
                    clearInterval(timer);
                    timer = setInterval(function(){move();},speed);
                    startAndPause.style.backgroundImage = "url('imgs/pause.png')";
                }
            }

        }
        //重新开始游戏
        function reloarGame(){
            removeClass('snake');
            removeClass('food');
            clearInterval(timer);
            this.snakeBody = [[2, 0, 'head'], [1, 0, 'body'], [0, 0, 'body']];
            //游戏方向
            this.direct = 'right';
            this.left = false;
            this.right = false;
            this.up = true;
            this.down = true;
            //分数初始化
            scoreBox.innerHTML = this.score;
            this.score = 0;
            loser.style.display = 'block';
            loserScore.innerHTML = scoreBox.innerHTML;
            startAndPause.style.display = 'none';
        }

  
    }
