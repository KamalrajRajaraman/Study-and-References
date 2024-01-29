function func1(){
    $("#img1").fadeToggle(3000);

}

function func2(){
//    $('div').css('background-color','orange');
        // $('#p1').css('font-style','italic');
        // $('.para').css('font-style','italic');
        // $('#div1,#div2').css('background-color','green');
        // $('#div1,li').css('background-color','orange');
        // $('div > p').fadeToggle();
        // $('div p').fadeToggle();
        // $('p:first').fadeToggle();
        $('li:odd').fadeToggle();
}

$('button').dblclick(func3);
function func3(){
    $("#img1").css('width','500px');

}

$('document').ready(()=>{
    // $('#img1').mouseenter(()=> $("#img1").css('width','500px'))
    // $('#img1').mouseleave(()=> $("#img1").css('width','250px'))
     $('#img1').hover(func4,func5)

     function func4(){
        $("#img1").css('width','500px')
     }
     function func5(){
        $("#img1").css('width','250px')
     }
});

$('document').ready(()=>{
    $('#hide-btn').click(()=>{
        $('#img1').hide(3000);
    })
    $('#show-btn').click(()=>{
        $('#img1').show(2000);
    })
    $('#toggle-btn').click(()=>{
        $('#img1').toggle(2000);
    })

    $('#btn-4').click(()=>{
        $('#img1').fadeIn(2000)
    })
    $('#btn-5').click(()=>{
        $('#img1').fadeOut(2000);
    })
    $('#btn-6').click(()=>{
        $('#img1').fadeToggle(2000);
    })

    $('#btn-7').click(()=>{
        $('#img1').slideUp(3000);
    })
    $('#btn-8').click(()=>{
        $('#img1').slideDown(3000);
    })
    $('#btn-9').click(()=>{
        $('#img1').slideToggle(3000);
    })
    $('#btn-10').click(()=>{
        $('#img1').stop();
    })


})