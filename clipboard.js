var clipboard = function(){};

var clipboard.prototype.copy = function(text, success, error){
  PhoneGap.exec(success, error, 
    "CopyToClipboardPlugin", "copy", [text]
  );
}

var clipboard.prototype.paste = function(success, error){
  PhoneGap.exec(success, error, 
    "CopyToClipboardPlugin", "paste", []
  );
}

PhoneGap.addConstructor(function() {
  PhoneGap.addPlugin('clipboard', new clipboard());
});