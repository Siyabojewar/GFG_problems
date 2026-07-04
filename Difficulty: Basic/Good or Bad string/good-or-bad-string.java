class Solution {
    static int isGoodorBad(String S) {
        int vowels=0;
        int consonants=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(isVowel(ch)){
                vowels++;
                consonants=0;
            }
            else if(ch=='?'){
                vowels++;
                consonants++;
            }
            else{
                consonants++;
                vowels=0;
            }
            if(vowels>5||consonants>3){
                return 0;
            }
        }
        return 1;
        
    }
    static boolean isVowel(char ch){
        return ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u';
    }
};