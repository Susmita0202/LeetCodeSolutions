class Solution {
public:
    string intToRoman(int num) {
        int intCode[]={1000, 900, 500, 400, 100, 90, 50, 40, 10,9,5,4,1};
        string stringCode[]={"M", "CM", "D","CD","C", "XC","L","XL","X","IX","V","IV","I"};
        int index =0;
        string res="";
        while(num!=0){
            while(intCode[index]>num){
                index++;
            }

            num=num-intCode[index];
        res+=stringCode[index];
        }
        return res;
    }
};
