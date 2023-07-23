object Q1{
    def main(args: Array[String]) : Unit ={
        // Encryption
        var encrypt : Array[Char] = Encryption("I Love You!");
        for(i <- encrypt){
            print(i);
        }
        println(" ");

        //Decryption     
        var decrypt : Array[Char] = Decryption("J Mpwf Zpv\"");
        for(i <- decrypt){
            print(i);
        }
        println(" ");

        //High-Order Function CaesarCipher with Encryption Function
        var caesarEn : Array[Char] = CaesarCipher("Scala Viva", Encryption);
        for(i <- caesarEn){
            print(i);
        }
        println(" ");


        //High-Order Function CaesarCipher with Decryption Function
        var caesarDe : Array[Char] = CaesarCipher("Tdbmb Wjwb", Decryption);
        for(i <- caesarDe){
            print(i);
        }
        println(" ");
    }

    def Encryption(str:String):Array[Char]={
        var encryptData: Array[Char] = Array();
        for(i <- str){
            if(i == ' '){
                encryptData = encryptData :+ i; //Appending an element to the old array
            }
            else{
                encryptData = encryptData :+ (i.toInt + 1).toChar //Appending an element to the old array
            }
        }

        // for(i <- encryptData){
        //     print(i);
        // }
        return encryptData

    }

    def Decryption(str:String):Array[Char]={
        var decryptData: Array[Char] = Array();
        for(i <- str){
            if(i == ' '){
                decryptData = decryptData :+ i; //Appending an element to the old array
            }
            else{
                decryptData = decryptData :+ (i.toInt - 1).toChar //Appending an element to the old array
            }
        }

        // for(i <- decryptData){
        //     print(i);
        // }
        return decryptData;
    }

    def  CaesarCipher(str: String, formatFunction: String => Array[Char]) : Array[Char] = {
        return formatFunction(str);
    }
    
}
