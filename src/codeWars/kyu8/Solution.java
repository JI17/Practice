package codeWars.kyu8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static boolean validatePin(String pin) {

        Pattern p = Pattern.compile("^\\d{4}$");
        Pattern p1 = Pattern.compile("^\\d{6}$");
        Matcher m = p.matcher(pin);
        Matcher m1 = p1.matcher(pin);

        return m.matches() || m1.matches();


    }
}


//function validatePIN (pin){
//  var num = "0123456789"
//
//  for(var i=0 ; i<=pin.length-1 ;i++){
//    if(num.indexOf(pin[i]) >= 0 ) {
//      if (pin.length === 4 || pin.length ===6){
//        return true;
//    }else{
//      return false;
//    }
//    }
//  }
//}
