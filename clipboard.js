var copyToClipBoard = function(success, error, text){
  PhoneGap.exec(
    function(status, args){ // on success
      console.log(status + " " + args);
      success(status, args);
    }, 
    function(err){ // on error
      console.log(err);
      error(err);
    }, 
    "CopyToClipboardPlugin", 
    "copy", 
    [text]
  );
}

