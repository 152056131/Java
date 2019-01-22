window.onload = function () {
    var computer = document.getElementsByClassName('computer')[0];
    var player = document.getElementsByClassName('player')[0];
    var score = document.getElementsByClassName('counter')[0];
    var choose = document.getElementsByClassName('choose');
    var start = document.getElementsByClassName('btn-start')[0];
    var pic = document.getElementsByClassName('ul-pic')[0];
    var rstart = document.getElementsByClassName('btn-rstart')[0];
    var count = 0;
    var con;
    var time = 100;
    pic.style.marginTop = "0";
    pic.style.display = "none";
    for (var i = 0; i < choose.length; i++) {
        choose[i].style.display = "none";
    }
    var timer;
    rstart.onclick = function () {
        for( var i = 0 ; i<choose.length; i++){
            choose[i].style.display = "none";
        }
       
        con = confirm("确定要重新开始吗？");
        if (con == true) {
            count = 0;
            score.innerHTML = count;
            clearInterval(timer);
        }
        else {
            return;
        }

    }
    for (var i = 0; i < choose.length; i++) {
        choose[i].index = i;
        choose[i].onclick = function () {
            clearInterval(timer);

            switch (this.index) {
                case 0: player.style.backgroundImage = "url('imgs/shitou.jpg')";
                    break;
                case 1: player.style.backgroundImage = "url('imgs/jiandao.jpg')";
                    break;
                case 2: player.style.backgroundImage = "url('imgs/bu.jpg')"
            }
            if (pic.style.display == "none") {
                alert("请点击开始游戏");
                player.style.backgroundImage = "none";
            }

            else if (pic.style.marginTop == "0px" && this.index == 2 || pic.style.marginTop == "-100px" && this.index == 0 || pic.style.marginTop == "-200px" && this.index == 1) {
                count++;
                setTimeout(function () {
                    alert("你真棒");
                }, 0, false);
                clearInterval(timer);
                timer = setInterval(function () {
                    if (pic.style.marginTop != "-300px") {
                        var position = parseInt(pic.style.marginTop);
                        pic.style.marginTop = position - 100 + "px";
                        if (pic.style.marginTop == "-300px") {
                            pic.style.marginTop = "0";
                        }
                    }

                }, time);

            }
            else if (pic.style.marginTop == "0px" && this.index == 0 || pic.style.marginTop == "-100px" && this.index == 1 || pic.style.marginTop == "-200px" && this.index == 2) {
                count = count;
                setTimeout(function () {
                    alert("打平了");
                }, 0, false);
                clearInterval(timer);

                timer = setInterval(function () {
                    if (pic.style.marginTop != "-300px") {
                        var position = parseInt(pic.style.marginTop);
                        pic.style.marginTop = position - 100 + "px";
                        if (pic.style.marginTop == "-300px") {
                            pic.style.marginTop = "0";
                        }
                    }

                }, time);


            }

            else {
                count--;
                setTimeout(function () {
                    alert("你真菜");
                }, 0, false);

                clearInterval(timer);
                timer = setInterval(function () {
                    if (pic.style.marginTop != "-300px") {
                        var position = parseInt(pic.style.marginTop);
                        pic.style.marginTop = position - 100 + "px";
                        if (pic.style.marginTop == "-300px") {
                            pic.style.marginTop = "0";
                        }
                    }

                }, time);

            }
            score.innerHTML = count;


        }


    }
    start.onclick = function () {
        for( var i = 0 ; i<choose.length; i++){
            choose[i].style.display = "block";
        }
        pic.style.display = "block";
        clearInterval(timer);
        timer = setInterval(function () {
            if (pic.style.marginTop != "-300px") {
                var position = parseInt(pic.style.marginTop);
                pic.style.marginTop = position - 100 + "px";
                if (pic.style.marginTop == "-300px") {
                    pic.style.marginTop = "0";
                }
            }

        }, time);

    }




}