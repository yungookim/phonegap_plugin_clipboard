var clipboard = function(){};

var clipboard.prototype.copy = function(text, success, error){
  PhoneGap.exec(success, error, 
    "CopyToClipboardPlugin", "copy", [text]
  );
}



PhoneGap.addConstructor(function() {
  PhoneGap.addPlugin('clipboard', new clipboard());
});