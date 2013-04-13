phonegap_plugin_clipboard
=========================

Clipboard plugin for Phonegap tested for Android version 2.3 ~ 4.1 inspired by https://github.com/phonegap/phonegap-plugins/tree/master/Android/ClipboardManager


##To use##

Add
```
// Remember to change example.example to your package name
<plugin name="CopyToClipboardPlugin" value="com.example.example.CopyToClipboardPlugin" />
```  
to res/xml/config.xml under ```plugins```
* copy CopyToClipboardPlugin.java into your project.
* Copy clipboard.js to assets/www folder and reference it from .html file.

##API##

The plugin will be attached to window.plugins and can be accessed by 

Copying
```
var success = function(status, args){};
var error = function(err){};
var text = "COPYING TEXT";
window.clipboard.copy(text, success, error);
``` 
Getting Text from the system's clipboard
```
var success = function(ret, status){
  //ret is the returned text from the system's clipboard
  //status is the returned status
};
var error = function(err){};

window.clipboard.paste(success, error);
```



## License ##

The MIT License (MIT)

Copyright (c) 2013 Yungoo Kim

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
