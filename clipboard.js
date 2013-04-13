var Clipboard = function(){};

Clipboard.prototype.copy = function(text, success, error){
  PhoneGap.exec(success, error, 
    "CopyToClipboardPlugin", "copy", [text]
  );
}

Clipboard.prototype.paste = function(success, error){
  PhoneGap.exec(success, error, 
    "CopyToClipboardPlugin", "paste", []
  );
}
window.clipboard = new Clipboard();
