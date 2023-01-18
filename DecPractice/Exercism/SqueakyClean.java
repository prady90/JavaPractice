package Exercism;

/*
Convert kebab-case to camelCase

Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.

SqueakyClean.clean("à-ḃç");
// => "àḂç"

Omit characters that are not letters

Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.

SqueakyClean.clean("a1😀2😀3😀b");
// => "ab"

Omit Greek lower case letters

Modify the (static) SqueakyClean.clean() method to omit any Greek letters in the range 'α' to 'ω'.

SqueakyClean.clean("MyΟβιεγτFinder");
// => "MyΟFinder"

*/

class SqueakyClean {

    public static void main(String args[]) {
        SqueakyClean.clean("a-1C");
    }

    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<identifier.length(); i++){
            char c = identifier.charAt(i);
            if(c==' '){
                sb.append('_');
            }else if(Character.isISOControl(c)){
                sb.append("CTRL");
            }else if(c=='-'){
                i++;
                if(Character.isDigit(identifier.charAt(i))){
                    continue;
                }else{
                    sb.append(Character.toUpperCase(identifier.charAt(i)));
                }
            }else if(!(Character.isLetter(c))){
               //i++;
                continue;
            }else if(c>='α' && c<='ω'){
               // i++;
                continue;
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

        
}
