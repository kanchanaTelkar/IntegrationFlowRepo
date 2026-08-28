package script

/* Refer the link below to learn more about the use cases of script.
https://help.sap.com/viewer/368c481cd6954bdfa5d0435479fd4eaf/Cloud/en-US/148851bf8192412cba1f9d2c17f4bd25.html

If you want to know more about the SCRIPT APIs, refer the link below
https://help.sap.com/doc/a56f52e1a58e4e2bac7f7adbf45b2e26/Cloud/en-US/index.html */
import com.sap.gateway.ip.core.customdev.util.Message;

def Message processData(Message message) {

    message.setBody(body + " Body is modified in BASE");
    message.setBody(body + " Body2 set in BASE");
    //To set or modify the body, you can use the following methods.
    def body = message.getBody();
    message.setBody(body + " Body is modified");

    //To set or modify the headers, you can use the following methods.
    def headers = message.getHeaders();
    def value = headers.get("oldHeader");
    message.setHeader("oldHeaderBASE", value + " modified");
    message.setHeader("newHeaderBASE", "newHeaderBASE");

    message.setHeader("BASECODE2", value + " modified");
    message.setHeader("BASECODE2", "newHeader");
    
    message.setHeader("oldHeaderBASE2", value + " modified");
    message.setHeader("newHeaderBASE2", "newHeader");
 
    return message;
}
