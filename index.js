$("#jokebtn").click(


  function(){

    $.ajax({

      url:"https://official-joke-api.appspot.com/random_joke",
      method:'GET',
      success:function(response){

        $('#joketxt').text(response.setup+" ----> "+response.punchline);

      },
      error:function(){

        $("#joketxt").text("not able to connect check yout internet connection")
      }
    })
  }
)
