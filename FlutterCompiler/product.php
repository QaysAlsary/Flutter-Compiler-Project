<?php
 echo "<!DOCTYPE html>
   <html>
        <head>
            <title>product details</title>
        </head>
        <body>


            <div>
            <p style=\"font-size: 24px;color: black\">{$_GET["name"]}</p>
            <img src=\"{$_GET["path"]}\" width=\"100%\" height=\"100%\">
            <p style=\"font-size: 24px;color: black\">{$_GET["description"]}</p>
            <a href=\"{$_GET["source"]}\">back to list</a>
           </div>
       </body>
   </html>" ;
?>
