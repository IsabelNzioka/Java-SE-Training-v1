package com.systechafrica.part2.staticClasses.nestedPackage;

// import static  com.systechafrica.part2.staticClasses.ATMUtils.maskCardNumber;

import com.systechafrica.part2.staticClasses.ATMUtils;

public class NestedPackageClassDemo {

    public static void main(String[] args) {


        // The class package is imported
        String cardNumber = "6236182636472637";
        System.out.println(ATMUtils.maskCardNumber(cardNumber)); //XXXXXXXXXXXX2637

        //      String cardNumber = "6236182636472637";
        //   System.out.println(maskCardNumber(cardNumber));  //the method in chained in the package import, and static is used

    }

}
