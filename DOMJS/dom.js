document.getElementById('button').addEventListener('click',btnClick);

function btnClick(e){
    
        console.log(e); 
        //click { target: button#button.btn.btn-dark.btn-block, buttons: 0, clientX: 748, clientY: 499, layerX: 324, layerY: 379 }
        console.log(e.target);
        //<button id="button" class="btn btn-dark btn-block">
        console.log(e.target.id);
        //button
        console.log(e.target.className);
        //btn btn-dark btn-block
        console.log(e.target.classList);
        //DOMTokenList(3) [ "btn", "btn-dark", "btn-block" ]

        var output =document.getElementById('output');
        output.innerHTML ='<h6>'+ e.target.id +'</h6>';

        console.log(e.type);
        //click -->event.type

        console.log(e.clientX);//521 -->clicked x axis position
        console.log(e.clientY);//538 -->clicked y axis position



    
}